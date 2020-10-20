package com.jon.dagger2sample.bean;

import com.jon.dagger2sample.ui.MainActivity;

import dagger.Component;

@Component(modules = {TeacherModule.class,ThirdPartObjModule.class,FruitModule.class})
public interface ActivityComponent {
    public void inject(MainActivity activity);
}
