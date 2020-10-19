package com.jon.dagger2sample.bean;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {

    @Provides
    public Student provideStudent(Teacher teacher) {
        return  new Student(teacher);
    }

}
