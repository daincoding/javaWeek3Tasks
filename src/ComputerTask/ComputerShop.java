package ComputerTask;

import java.util.ArrayList;

public class ComputerShop {
    private ArrayList<Computer> computers;

    // Constructor
    public ComputerShop(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    //Calculate Profit
    public double calculateProfit() {
        double totalProfit = 0.0;
        for (Computer computer : computers) {
            totalProfit += (computer.getSellingPrice() - computer.getPurchasePrice());
        }
        return totalProfit;
    }
}
