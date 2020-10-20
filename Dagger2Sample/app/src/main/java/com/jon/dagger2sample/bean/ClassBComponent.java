package com.jon.dagger2sample.bean;

import com.jon.dagger2sample.ui.MainActivity;

import dagger.Component;

@Component(modules = ClassBModule.class,dependencies = ClassAComponent.class)
public interface ClassBComponent {
    public void inject(MainActivity activity);
}
