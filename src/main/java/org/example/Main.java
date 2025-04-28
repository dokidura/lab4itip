package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Fridge fridge = context.getBean(Fridge.class);
        Dishwasher dishwasher = context.getBean(Dishwasher.class);
        Vacuum vacuum = context.getBean(Vacuum.class);

        ApplianceComposite fridge1 = new ApplianceComposite(fridge);
        ApplianceComposite dishwasher1 = new ApplianceComposite(dishwasher);
        ApplianceComposite vacuum1 = new ApplianceComposite(vacuum);

        fridge1.displayAll();
        dishwasher1.displayAll();
        vacuum1.displayAll();

        context.close();
    }
}