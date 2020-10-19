package com.jon.dagger2sample.bean;


import dagger.Component;

@Component(modules = TeacherModule.class)
public interface TeacherComponent {

    public Teacher getTeacher();
}
