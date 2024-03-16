package org.example.animal;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat extends Animal{


    private Animal animal;
    @Override
    public void getSay() {
        System.out.println("MAUUUU");
    }
}
