package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class FruitModule {
    @Provides
    @AppleFruit
    public Fruit provideApple() {
        return new Apple();
    }

    @Provides
    @BananaFruit
    public Fruit provideBanana() {
        return new Banana();
    }
}
