package org.example;

import java.util.List;

public class ApplianceComposite {
    private List<Appliance> appliances;

    public ApplianceComposite(List<Appliance> appliances) {
        this.appliances = appliances;
    }

    public void displayAll() {
        for (Appliance appliance : appliances) {
            appliance.cpc();
        }
    }
}