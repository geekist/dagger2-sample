package com.jon.dagger2sample.bean;

import com.jon.dagger2sample.ui.MainActivity;

import dagger.Component;

@Component(modules = CarModule.class,dependencies = EngineComponent.class)
public interface MainActivityComponent {
    public void inject(MainActivity activity);
}
