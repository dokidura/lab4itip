package org.example;

public class Dishwasher implements Appliance {
    private String name;
    private int programms;

    public Dishwasher(String name, int programms) {
        this.name = name;
        this.programms = programms;
    }

    @Override
    public void cpc() {
        System.out.println(name + " has " + programms + " programms" );
    }
}
