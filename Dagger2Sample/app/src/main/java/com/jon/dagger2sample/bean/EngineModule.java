package com.jon.dagger2sample.bean;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

@Module
public class EngineModule {
    @Provides
    public Engine provideEngine() {
        return new Engine();
    }
}
