package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class MallModule {

    @Provides
    Mall provideMal(@AppleFruit Fruit fruit) {
        return new Mall(fruit);
    }

}
