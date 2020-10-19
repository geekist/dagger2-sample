package com.jon.dagger2sample.bean;

import androidx.annotation.NonNull;

public class ThirdPartObj {

    public String name;
    public int id;


    @NonNull
    @Override
    public String toString() {
        return "I am a third part object";
    }

}
