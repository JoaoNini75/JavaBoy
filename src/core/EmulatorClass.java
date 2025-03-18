package core;

import core.cartridge.Cartridge;
import core.cartridge.CartridgeClass;
import java.math.BigInteger;

public class EmulatorClass implements Emulator {

    private static final long DELAY = 10;

    private boolean paused;
    private boolean running;
    // simulate unsigned 64 bit integer, possible bottleneck!
    private BigInteger ticks;

    private CPUClass cpu;
    private Cartridge cartridge;

    public EmulatorClass() {
        this.running = true;
        this.paused = false;
        this.ticks = BigInteger.ZERO;
        this.cpu = new CPUClass();
        this.cartridge = new CartridgeClass();
    }

    @Override
    public String run(String[] args) {
        String inputRes = handleInput(args);
        if (inputRes != null)
            return inputRes;

        initializations();

        while (running) {
            if (paused) {
                delay(DELAY);
                continue;
            }

            if (!cpu.cpuStep())
                return Messages.CPU_STOPPED;

            ticks = ticks.add(BigInteger.ONE);
        }

        return Messages.OK;
    }

    private String handleInput(String[] args) {
        if (args.length < 2)
            return Messages.INVALID_INPUT;

        if (!cartridge.loadCartridge(args[1]))
            return String.format(Messages.ROM_LOAD_FAIL, args[1]);

        return null;
    }

    private void initializations() {
        System.out.println("Cart loaded...");

        /* TODO
        SDL_Init(SDL_INIT_VIDEO);
        System.out.println("SDL init");

        TTF_Init();
        System.out.println("TTF init");*/

        cpu.cpuInit();
    }

    private void delay(long ms) {
        // TODO
        // SDL_Delay(ms);
    }
}
