package com.jon.dagger2sample.bean;

import dagger.Component;
import dagger.Module;

@Component(modules = FruitModule.class)
public interface FruitComponent {
    @AppleFruit
    Fruit getAppleFruit();

    @BananaFruit
    Fruit getBananaFruit();
}
