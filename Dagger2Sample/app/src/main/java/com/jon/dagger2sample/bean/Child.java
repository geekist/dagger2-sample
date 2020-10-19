package com.jon.dagger2sample.bean;

import androidx.annotation.NonNull;

public class Child {

    public Child(Father father) {

    }

    @NonNull
    @Override
    public String toString() {
        return "child";
    }
}
