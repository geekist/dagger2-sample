package com.jon.dagger2sample.bean;

import com.jon.dagger2sample.ui.MainActivity;

import dagger.Component;

@Component(modules = StudentModule.class,dependencies = TeacherComponent.class)
public interface StudentComponent {
    void inject(MainActivity activity);
}
