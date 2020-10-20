package com.jon.dagger2sample.bean;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class TeacherModule {
    @Provides
    Teacher provideTeacher(@Named("id")int id,@Named("age") int age) {
        return new Teacher( id,age);
    }

    @Provides
    @Named("id")
    int provideId() {
        return 5;
    }

    @Provides
    @Named("age")
    int provideAge() {
        return 36;
    }
}
