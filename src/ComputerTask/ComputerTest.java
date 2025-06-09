package ComputerTask;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        // Using different constructors for different PC's!

        // Part I of the Tasks

        Computer fullPC = new Computer(
                "Lenovo", 3600, 16, 1000, 4,
                15.6, "Laptop", true);

        Computer emptyPC = new Computer();

        Computer basicPC = new Computer("ASUS", 13.3, false);

        System.out.println(fullPC);

        fullPC.doubleRAM();

        System.out.println("\n" + fullPC);

        // Part III of the Tasks

        Computer pc1 = new Computer("Dell", 3200, 16, 512, 4, 15.6, "Laptop", true, 600.00, 899.99);
        Computer pc2 = new Computer("HP", 2800, 8, 256, 3, 14.0, "Laptop", true, 500.00, 749.99);
        Computer pc3 = new Computer("Lenovo", 3600, 32, 1000, 6, 17.0, "Desktop", false, 800.00, 1199.99);
        Computer pc4 = new Computer("Asus", 3000, 16, 512, 4, 15.6, "Laptop", true, 580.00, 829.99);
        Computer pc5 = new Computer("Acer", 2500, 8, 256, 2, 13.3, "Laptop", true, 450.00, 699.99);

        ArrayList<Computer> computers = new ArrayList<Computer>();
        computers.add(pc1);
        computers.add(pc2);
        computers.add(pc3);
        computers.add(pc4);
        computers.add(pc5);

        ComputerShop shop = new ComputerShop(computers);
        double totalProfit = shop.calculateProfit();
        System.out.println("The total potential Profit of all PCs is: " + totalProfit);
    }
}
