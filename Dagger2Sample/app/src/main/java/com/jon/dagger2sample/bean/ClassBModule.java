package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class ClassBModule {

    @Provides
    ClassB provideClassB() {
        return new ClassB();
    }
}
