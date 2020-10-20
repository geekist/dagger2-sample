package com.jon.dagger2sample.bean;

import androidx.annotation.NonNull;

public class ClassB {
    private ClassA cA;

    public ClassB(ClassA cA) {
        this.cA = cA;
    }

    @NonNull
    @Override
    public String toString() {
        return "classB";
    }
}
