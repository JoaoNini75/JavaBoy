import java.math.BigInteger;

public class EmulatorClass implements Emulator {

    private static final long DELAY = 10;

    private boolean paused;
    private boolean running;
    // simulate unsigned 64 bit integer, possible bottleneck!
    private BigInteger ticks;

    public EmulatorClass() {
        this.running = true;
        this.paused = false;
        this.ticks = BigInteger.ZERO;
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

            if (!cpuStep())
                return Messages.CPU_STOPPED;

            ticks = ticks.add(BigInteger.ONE);
        }

        return Messages.OK;
    }

    private String handleInput(String[] args) {
        if (args.length < 2)
            return Messages.INVALID_INPUT;

        if (!cartLoad(args[1]))
            return String.format(Messages.ROM_LOAD_FAIL, args[1]);

        return null;
    }

    private void initializations() {
        System.out.println("Cart loaded...");

        SDL_Init(SDL_INIT_VIDEO);
        System.out.println("SDL init");

        TTF_Init();
        System.out.println("TTF init");

        cpuInit();
    }

    private void delay(long ms) {
        SDL_Delay(ms);
    }
}
