package org.example.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pet {

    @Qualifier("cow")
    @Autowired
    private Animal animal;

    public void say() {
        animal.getSay();
    }

}
