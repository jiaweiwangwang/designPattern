package FacadePattern;

public class Facade {
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Facade() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start() {
        System.out.println("Computer is starting,other component will start");
        cpu.start();;
        disk.start();
        memory.start();
        System.out.println("Computer started");
    }

    public void shutdown() {
        System.out.println("Computer is shutDowning,other component will shutdown");
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
        System.out.println("Computer shutDown");
    }
}
