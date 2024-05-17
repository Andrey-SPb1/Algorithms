package org.andrey.greedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final List<Item> shop = new ArrayList<>();
        shop.add(new Item("TV", 1000, 15));
        shop.add(new Item("Laptop", 900, 4));
        shop.add(new Item("Laptop", 1200, 6));
        shop.add(new Item("Table", 900, 20));
        shop.add(new Item("Guitar", 500, 3));
        shop.add(new Item("Phone", 1200, 1));
        shop.add(new Item("Chair", 150, 3));
        shop.add(new Item("Rug", 400, 5));
        shop.add(new Item("Painting", 700, 1));
        shop.add(new Item("Set of forks", 10, 1));

        Bag firstBag = new Bag(30);
        firstBag.fillBackpack(shop);
        System.out.println(firstBag);

        Bag secondBag = new Bag(30);
        secondBag.effectiveFillBackpack(shop);
        System.out.println(secondBag);

    }
}
