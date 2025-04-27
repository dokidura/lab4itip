package org.example;

public class Vacuum implements Appliance {
    private String name;
    private int suctionpower;

    public Vacuum(String name, int suctionpower) {
        this.name = name;
        this.suctionpower = suctionpower;
    }

    @Override
    public void cpc() {
        System.out.println(name + " has the suction power of " + suctionpower);
    }
}
