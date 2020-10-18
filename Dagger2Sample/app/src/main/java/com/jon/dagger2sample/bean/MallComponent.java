package com.jon.dagger2sample.bean;


import dagger.Component;

@Component(modules = MallModule.class,dependencies = FruitComponent.class)
public interface MallComponent {

    public Mall getMall();
}
