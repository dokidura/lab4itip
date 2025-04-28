package org.example;

import java.util.List;

public class ApplianceComposite {
    private Appliance appliances;

    public ApplianceComposite(Appliance appliances) {
        this.appliances = appliances;
    }

    public void displayAll() {
        appliances.cpc();
    }
}