package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class ThirdPartObjModule {

    @Provides
    public ThirdPartObj provideThirdPartObj() {
        return new ThirdPartObj();
    }
}
