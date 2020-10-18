package com.jon.dagger2sample.bean;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class FruitModule {
    @Provides
    //@Named("Apple")
    @AppleFruit
    public Fruit provideApple() {
        return new Apple();
    }

    @Provides
    //@Named("Banana")
    @BananaFruit
    public Fruit provideBanana() {
        return new Banana();
    }
}
