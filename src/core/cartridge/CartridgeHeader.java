package core.cartridge;

public class CartridgeHeader {

    private byte[/*4*/] entry;
    private byte[/*30*/] logo;

    private String/*16 chars*/ title;
    private short newLicCode;
    private byte sgbFlag;
    private byte type;
    private byte romSize;
    private byte ramSize;
    private byte destinationCode;
    private byte oldLicCode;
    private byte version;
    private byte checksum;
    private short globalChecksum;

    public CartridgeHeader() {}

    public byte[] getEntry() {
        return entry;
    }

    public void setEntry(byte[] entry) {
        this.entry = entry;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getNewLicCode() {
        return newLicCode;
    }

    public void setNewLicCode(short newLicCode) {
        this.newLicCode = newLicCode;
    }

    public byte getSgbFlag() {
        return sgbFlag;
    }

    public void setSgbFlag(byte sgbFlag) {
        this.sgbFlag = sgbFlag;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public byte getRomSize() {
        return romSize;
    }

    public void setRomSize(byte romSize) {
        this.romSize = romSize;
    }

    public byte getRamSize() {
        return ramSize;
    }

    public void setRamSize(byte ramSize) {
        this.ramSize = ramSize;
    }

    public byte getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(byte destinationCode) {
        this.destinationCode = destinationCode;
    }

    public byte getOldLicCode() {
        return oldLicCode;
    }

    public void setOldLicCode(byte oldLicCode) {
        this.oldLicCode = oldLicCode;
    }

    public byte getVersion() {
        return version;
    }

    public void setVersion(byte version) {
        this.version = version;
    }

    public byte getChecksum() {
        return checksum;
    }

    public void setChecksum(byte checksum) {
        this.checksum = checksum;
    }

    public short getGlobalChecksum() {
        return globalChecksum;
    }

    public void setGlobalChecksum(short globalChecksum) {
        this.globalChecksum = globalChecksum;
    }
}
