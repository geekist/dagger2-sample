package com.jon.dagger2sample.bean;

import dagger.Component;

@Component(modules = ClassAModule.class)
public interface ClassAComponent {
    public ClassA getClassA();
}
