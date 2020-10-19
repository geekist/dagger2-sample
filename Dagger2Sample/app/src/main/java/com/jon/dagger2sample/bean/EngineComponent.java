package com.jon.dagger2sample.bean;

import dagger.Component;

@Component(modules = EngineModule.class)
public interface EngineComponent {
    public Engine getEngine();
}
