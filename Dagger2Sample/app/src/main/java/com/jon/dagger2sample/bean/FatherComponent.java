package com.jon.dagger2sample.bean;


import com.jon.dagger2sample.FatherModule;

import dagger.Component;

@Component(modules = FatherModule.class)
public interface FatherComponent {
    ChildComponent.Builder buildChildComponent();
}
