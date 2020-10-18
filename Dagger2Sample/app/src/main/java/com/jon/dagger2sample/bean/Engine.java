package com.jon.dagger2sample.bean;

import androidx.annotation.NonNull;

import javax.inject.Inject;

public class Engine {

    @Inject
    public Engine() {

    }

    @NonNull
    @Override
    public String toString() {
        return "I am an engine";
    }
}
