package com.jon.dagger2sample.bean;

import androidx.annotation.NonNull;

import javax.inject.Inject;

public class Fruit {

    @Inject
    public Fruit() {

    }

    @NonNull
    @Override
    public String toString() {
        return "hello,fruit";
    }
}
