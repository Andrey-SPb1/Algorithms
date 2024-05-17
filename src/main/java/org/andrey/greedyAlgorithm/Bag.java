package org.andrey.greedyAlgorithm;

import java.util.*;

public class Bag {
    private final int maxWeight;
    private final List<Item> items;

    private int currentWeight;
    private int currentCost;

    public Bag(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
        currentCost = 0;
        currentWeight = 0;
    }

    private int getMaxWeight() {
        return maxWeight;
    }

    private int getCurrentWeight() {
        return currentWeight;
    }

    public void fillBackpack(List<Item> items) {
        for (Item item : items) {
            if(getMaxWeight() > getCurrentWeight() + item.getWeight()) {
                addItem(item);
            }
        }
    }

    public void effectiveFillBackpack(List<Item> items) {
        Map<Double, Item> sortByRatio = new TreeMap<>(Collections.reverseOrder());
        for (Item item : items) {
            sortByRatio.put((double) item.getCost() / item.getWeight(), item);
        }

        for (Item item : sortByRatio.values()) {
            if(getMaxWeight() > getCurrentWeight() + item.getWeight()) {
                addItem(item);
            }
        }
    }

    private void addItem(Item item) {
        items.add(item);
        currentWeight += item.getWeight();
        currentCost += item.getCost();
    }

    @Override
    public String toString() {
        return "Current weight = " + currentWeight + ", current cost = " + currentCost +
                " Items: " + items;
    }
}
