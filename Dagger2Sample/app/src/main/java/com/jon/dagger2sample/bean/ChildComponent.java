package com.jon.dagger2sample.bean;


import com.jon.dagger2sample.ui.MainActivity;

import dagger.Subcomponent;

@Subcomponent(modules = ChildModule.class)
public interface ChildComponent {
    void inject(MainActivity activity);

    @Subcomponent.Builder
    interface Builder {
        ChildComponent build();
    }
}
