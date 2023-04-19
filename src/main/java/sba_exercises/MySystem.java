package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MySystem {
    Map<String, Item> myItemsInHashMap = new HashMap<>();
    public MySystem() throws FileNotFoundException {
        // creating a File instance to reference "sample" file
        File sampleFile = new File("sample.txt");
        // creating a Scanner instance to read File
        Scanner scanner = new Scanner(sampleFile);
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split("  ");
            String name = line[0];
            String description = line[1];
            double price = Double.parseDouble(line[2]);
            int availableQuantity = Integer.parseInt(line[3]);

            Item itemsList = new Item(name, description, price, availableQuantity);
            myItemsInHashMap.put(itemsList.getItemName(), itemsList);

        }
    }

    public Map<String, Item> getMyItemsInHashMap() {
        return myItemsInHashMap;
    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }
}
