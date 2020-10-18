package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class FruitModule {
    @Provides
    public Fruit provideFruit() {
        return new Apple();
    }
}
