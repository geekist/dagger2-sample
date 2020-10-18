package com.jon.dagger2sample.bean;

import com.jon.dagger2sample.ui.MainActivity;

import dagger.Component;

@Component
public interface ActivityCarComponent {

  public void inject(MainActivity activity);

}
