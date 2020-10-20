package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class ClassAModule {

    @Provides
    ClassA provideClassA() {
        return new ClassA();
    }
}
