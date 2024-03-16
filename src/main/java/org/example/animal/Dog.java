package org.example.animal;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog extends Animal{

    @Override
    public void getSay() {
        System.out.println("Bark");
    }
}
