package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {
    @Provides
    public Car provideCar() {
        return new Car();
    }
}
