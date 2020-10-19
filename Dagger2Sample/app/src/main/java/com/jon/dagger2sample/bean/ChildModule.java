package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class ChildModule {
    @Provides
    public Child provideChild(Father father) {
        return new Child(father);
    }
}
