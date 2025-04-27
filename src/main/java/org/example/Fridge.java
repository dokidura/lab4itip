package org.example;

public class Fridge implements Appliance {
    private String name;
    private int capacity;

    public Fridge(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public void cpc() {
        System.out.println(name + " has the capacity of " + capacity);
    }
}
