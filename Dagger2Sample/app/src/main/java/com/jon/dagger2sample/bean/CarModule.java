package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    public Car provideCar(String name) {
        Car car = new Car(name);
        return car;
    }

    @Provides
    public String provideName() {
        return "car";
    }
}
