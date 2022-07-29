package com.bootcampexcercise.module10;

import java.util.HashMap;

public class ElectronicItemDetails {
    public static void main(String[] args) {
        HashMap<String, Double> itemHashMap = new HashMap<>();

        itemHashMap.put("TV", 1500.99);
        itemHashMap.put("Refrigerator", 890.50);
        itemHashMap.put("Washing Machine", 400.0);
        itemHashMap.put("Laptop", 2333.99);

        System.out.println("Price of TV is: " + returnPriceOfItem(itemHashMap, "Laptop"));
    }

    public static double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        if (!itemHashMap.containsKey(name)) {
            System.out.println("There is no price for " + name);
            return -1;
        }

        double price = itemHashMap.get(name);
        return price;
    }
}
