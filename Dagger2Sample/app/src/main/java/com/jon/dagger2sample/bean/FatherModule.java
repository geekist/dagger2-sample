package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = ChildComponent.class)
public class FatherModule {
    @Provides
    public Father provideFather() {
        return new Father();
    }
}
