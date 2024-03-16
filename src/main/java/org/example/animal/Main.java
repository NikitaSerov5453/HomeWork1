package org.example.animal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class);

        Animal cat = context.getBean("cat", Animal.class);
        cat.getSay();

        Animal dog = context.getBean("dog", Animal.class);
        dog.getSay();

        Pet pet = context.getBean("pet", Pet.class);
        pet.say();

        context.close();
    }
}
