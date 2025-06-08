package ComputerTask;

public class Computer {
    private String manufacturer;
    private double mhz;
    private int ram;
    private int hardDrive;
    private double screenSize;
    private String computerType;
    private boolean hasOperatingSystem;

    public Computer(String manufacturer, double mhz, int ram, int hardDrive, double screenSize, String computerType, boolean hasOperatingSystem) {
        this.manufacturer = manufacturer;
        this.mhz = mhz;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.screenSize = screenSize;
        this.computerType = computerType;
        this.hasOperatingSystem = hasOperatingSystem;
    }
}
