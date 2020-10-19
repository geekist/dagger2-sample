package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class TeacherModule {

    @Provides
    public  Teacher provideTeacher() {
        return new Teacher();
    }
}
