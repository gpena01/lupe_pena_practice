package map_practice;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // initialize HashMap object
        Map<String, Item> myMap = new HashMap<>();

        // create variables to hold an item to include
        // name of item, price and quantity
        Item pizza = new Item("pizza", 9.50, 5);
        myMap.put("pizza", pizza);
        Item salad = new Item("salad", 3.89, 11);
        myMap.put("salad", salad);
        Item beverage = new Item("zero sugar soda", 1.50, 6);
        myMap.put("zero sugar soda", beverage);

        System.out.println(myMap.keySet());

        int size = myMap.size();
        System.out.println(size);

        Item pizza1 = myMap.get("pizza");
        System.out.println(pizza1.getName());

        Item salad1 = myMap.remove("salad");
        int size1 = myMap.size();
        System.out.println(size1);

        Item salad2 = myMap.get("salad");
        if(salad2 != null) {
            System.out.println(salad2);
        }
    }
}

class Item {
    // create fields name, price, quantity
    private String name;
    private double price;
    private int quantity;

    // create a constructor
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // generate getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
