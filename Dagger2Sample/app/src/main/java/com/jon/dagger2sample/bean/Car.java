package com.jon.dagger2sample.bean;

import androidx.annotation.NonNull;

import javax.inject.Inject;

public class Car {

    private Engine engine;

    @Inject
    public Car(Engine engine) {
        this.engine = engine;
    }

    public String getEngineName(){
        return engine.toString();
    }

    @NonNull
    @Override
    public String toString() {
        return "I am a car";
    }
}
