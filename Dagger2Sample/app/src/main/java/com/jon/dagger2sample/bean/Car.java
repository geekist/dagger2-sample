package com.jon.dagger2sample.bean;

import javax.inject.Inject;

public class Car {
    public String name;

    @Inject
    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
