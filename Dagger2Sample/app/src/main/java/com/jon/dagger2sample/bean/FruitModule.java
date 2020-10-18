package com.jon.dagger2sample.bean;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

@Module
public class FruitModule {

    @Provides
    @Singleton
    public Fruit provideFruit() {
        return new Apple();
    }
}
