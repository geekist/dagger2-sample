package com.jon.dagger2sample.bean;


import com.jon.dagger2sample.ui.MainActivity;

import dagger.Subcomponent;

@Subcomponent(modules = ClassBModule.class)
public interface ClassBComponent {
    void inject(MainActivity activity);

    @Subcomponent.Builder
    interface Builder {
        ClassBComponent build();
    }
}
