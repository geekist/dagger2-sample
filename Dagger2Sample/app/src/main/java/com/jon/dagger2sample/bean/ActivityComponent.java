package com.jon.dagger2sample.bean;

import com.jon.dagger2sample.ui.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = FruitModule.class)
public interface ActivityComponent {
    public void inject(MainActivity activity);
}
