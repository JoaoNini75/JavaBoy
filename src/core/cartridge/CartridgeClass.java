package core.cartridge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CartridgeClass implements Cartridge {

    private String filename;
    private long romSize;
    private short romData;
    private CartridgeHeader header;

    public CartridgeClass() {
        this.filename = "";
        this.romSize = 0L;
        this.romData = 0;
        this.header = new CartridgeHeader();
    }

    public String getCartNewLicCodeName() {
        return (header.getNewLicCode() <= 0xA4)
                ? NewLicCodeEnum.fromKey(header.getNewLicCode()).getValue()
                : "Unknown";
    }

    public String getCartTypeName() {
        return (header.getType() <= 0x22)
                ? RomTypes.romTypes[header.getType()]
                : "Unknown";
    }

    @Override
    public boolean loadCartridge(String cartridgeName) {
        this.filename = cartridgeName;

        try {
            File file = new File(filename);
            this.romSize = file.length();

            FileInputStream fis = new FileInputStream(file);
            System.out.println("romSize: " + romSize + " intmax: " + Integer.MAX_VALUE +
                               "rom bigger: " + (romSize > Integer.MAX_VALUE));
            byte[] data = new byte[(int) romSize];
            int readStatus = fis.read(data);
            fis.close();

            if (readStatus < 0) {
                System.out.println("Failed to read file.");
                return false;
            }

            // TODO header = data

        } catch (IOException e) {
            System.out.println("Failed to open file: " + filename);
            e.printStackTrace();
            return false;
        }

        String title = header.getTitle();
        header.setTitle(title.substring(0, title.length()-1) + "0");
        printCartridgeInfo();

        return verifyChecksum();
    }

    private void printCartridgeInfo() {

    }

    private boolean verifyChecksum() {
        return false;
    }
}
