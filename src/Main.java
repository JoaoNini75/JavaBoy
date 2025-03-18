public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Game Boy");

        Emulator emu = new EmulatorClass();
        String runResult = emu.run(args);

        System.out.println(runResult);
    }
}
