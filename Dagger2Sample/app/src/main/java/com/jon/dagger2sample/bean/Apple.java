package com.jon.dagger2sample.bean;

import androidx.annotation.NonNull;

import javax.inject.Inject;

public class Apple extends Fruit {
    public Apple() {
    }

    @NonNull
    @Override
    public String toString() {
        return "I am an apple ";
    }
}
