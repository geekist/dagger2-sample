package com.jon.dagger2sample;


import com.jon.dagger2sample.bean.Father;

import dagger.Module;
import dagger.Provides;

@Module
public class FatherModule {

    @Provides
    Father provideFather() {
        return new Father();
    }
}
