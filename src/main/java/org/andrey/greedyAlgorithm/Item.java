package org.andrey.greedyAlgorithm;

public class Item implements Comparable<Item> {

    private final String name;
    private final int cost;
    private final int weight;

    public Item(String name, int cost, int weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return '\'' + name + "' cost=" + cost + " weight=" + weight;
    }

    @Override
    public int compareTo(Item o) {
        if (this.cost == o.cost) return 0;
        else return this.cost > o.cost ? -1 : 1;
    }
}
