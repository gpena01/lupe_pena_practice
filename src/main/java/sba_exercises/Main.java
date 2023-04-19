package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // creating a File instance to reference "sample" file
        File sampleFile = new File("sample.txt");
        // creating a Scanner instance to read File
        Scanner scanner = new Scanner(sampleFile);

        // reading each line of the file using Scanner class

        System.out.println("----------- Testing reading sample.txt -----");
        System.out.printf("%-20s %-20s %-10s %-10s %n",
                "Name",
                "Description",
                "Price",
                "Available Quantity");
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split("  ");
            String name = line[0];
            String description = line[1];
            double price = Double.parseDouble(line[2]);
            int quantity = Integer.parseInt(line[3]);

            System.out.printf("%-20s %-20s %-10.2f %-10d %n",
                    name,
                    description,
                    price,
                    quantity);

        }
        Item item1 = new Item("noodle", "really good", 20.0, 20);
        System.out.println("----------- Testing the constructor of Item class -----");
        System.out.printf("%-20s %-20s %-10.2f %-10d %-10d %n",
                item1.getItemName(),
                item1.getItemDescription(),
                item1.getPrice(),
                item1.getQuantity(),
                item1.getAvailableQuantity());

        System.out.println("----------- Testing the constructor of MySystem class -----");
        MySystem mySystem = new MySystem();
//        System.out.printf("%-20s %-20s %-10.2f %-10d %-10d %n", );

    }
}
