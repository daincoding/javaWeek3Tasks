package ComputerTask;

public class Computer {
    //region Variables
    // Private fields
    private String manufacturer;
    private int processorSpeedMHz;
    private int ramGB;
    private int hardDriveGB;
    private int usbPorts;
    private double screenSizeInches;
    private String computerType;
    private boolean hasOS;
    private double purchasePrice;
    private double sellingPrice;

    //endregion

    // region  Constructors
    // 1) Default constructor
    public Computer() {
        this.manufacturer = "Unknown";
        this.processorSpeedMHz = 0;
        this.ramGB = 0;
        this.hardDriveGB = 0;
        this.usbPorts = 0;
        this.screenSizeInches = 0.0;
        this.computerType = "Unknown";
        this.hasOS = false;
    }

    // 2) Constructor with minimum values
    public Computer(String manufacturer, double screenSizeInches, boolean hasOS) {
        this.manufacturer = manufacturer;
        this.screenSizeInches = screenSizeInches;
        this.hasOS = hasOS;
        this.processorSpeedMHz = 0;
        this.ramGB = 0;
        this.hardDriveGB = 0;
        this.usbPorts = 0;
        this.computerType = "Unknown";
    }

    // 3) Constructor with all values
    public Computer(String manufacturer, int processorSpeedMHz, int ramGB, int hardDriveGB,
                    int usbPorts, double screenSizeInches, String computerType, boolean hasOS) {
        this.manufacturer = manufacturer;
        this.processorSpeedMHz = processorSpeedMHz;
        this.ramGB = ramGB;
        this.hardDriveGB = hardDriveGB;
        this.usbPorts = usbPorts;
        this.screenSizeInches = screenSizeInches;
        this.computerType = computerType;
        this.hasOS = hasOS;
    }

    // 4) Constructor for Part III of the task

    public Computer(String manufacturer, int processorSpeedMHz, int ramGB, int hardDriveGB,
                    int usbPorts, double screenSizeInches, String computerType, boolean hasOS, double purchasePrice, double sellingPrice) {
        this.manufacturer = manufacturer;
        this.processorSpeedMHz = processorSpeedMHz;
        this.ramGB = ramGB;
        this.hardDriveGB = hardDriveGB;
        this.usbPorts = usbPorts;
        this.screenSizeInches = screenSizeInches;
        this.computerType = computerType;
        this.hasOS = hasOS;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    //endregion

    //region Getters & Setters
    // Getters and setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getProcessorSpeedMHz() {
        return processorSpeedMHz;
    }

    public void setProcessorSpeedMHz(int processorSpeedMHz) {
        this.processorSpeedMHz = processorSpeedMHz;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public int getHardDriveGB() {
        return hardDriveGB;
    }

    public void setHardDriveGB(int hardDriveGB) {
        this.hardDriveGB = hardDriveGB;
    }

    public int getUsbPorts() {
        return usbPorts;
    }

    public void setUsbPorts(int usbPorts) {
        this.usbPorts = usbPorts;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public void setScreenSizeInches(double screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public boolean hasOS() {
        return hasOS;
    }

    public void setHasOS(boolean hasOS) {
        this.hasOS = hasOS;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    //endregion

    @Override
    public String toString() {
        return "The Computer has the following parameters:\n" +
                "\tManufacturer='" + manufacturer + '\'' +
                "\n\t ProcessorSpeedMHz=" + processorSpeedMHz +
                "\n\t RamGB=" + ramGB +
                "\n\t HardDriveGB=" + hardDriveGB +
                "\n\t UsbPorts=" + usbPorts +
                "\n\t ScreenSizeInches=" + screenSizeInches +
                "\n\t ComputerType='" + computerType + '\'' +
                "\n\t hasOS=" + hasOS;
    }

    public void doubleRAM() {
        int current = getRamGB();
        int upgrade = current * 2;
        setRamGB(upgrade);
    }

    public double calculatedProfit() {
        double profit = purchasePrice - sellingPrice;
        return profit;
    }
}
