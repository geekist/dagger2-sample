package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = ClassBComponent.class)
public class ClassAModule {
    @Provides
    public ClassA provideClassA() {
        return new ClassA();
    }
}
