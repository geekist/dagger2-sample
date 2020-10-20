package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.jon.dagger2sample.R;
import com.jon.dagger2sample.bean.ClassB;
import com.jon.dagger2sample.bean.ClassAComponent;
import com.jon.dagger2sample.bean.DaggerClassAComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ClassB classB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClassAComponent classAComponent = DaggerClassAComponent.builder().build();
        classAComponent.buildClassBComponent().build().inject(this);

        int hashCode;
        Log.d("msg","hash code is: " + classB.hashCode());
    }
}