package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        ApplianceComposite applianceComposite = context.getBean(ApplianceComposite.class);
        applianceComposite.displayAll();

        context.close();
    }
}