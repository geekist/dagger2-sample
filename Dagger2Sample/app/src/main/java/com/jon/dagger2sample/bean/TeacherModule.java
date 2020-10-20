package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class TeacherModule {
    @Provides
    Teacher provideTeacher(int id) {
        return new Teacher(id);
    }

    @Provides
    int provideId() {
        return 5;
    }
}
