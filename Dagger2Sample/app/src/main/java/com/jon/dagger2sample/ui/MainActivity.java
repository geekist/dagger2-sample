package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jon.dagger2sample.R;

import com.jon.dagger2sample.bean.Car;
import com.jon.dagger2sample.bean.DaggerEngineComponent;
import com.jon.dagger2sample.bean.DaggerMainActivityComponent;
import com.jon.dagger2sample.bean.EngineComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EngineComponent engineComponent = DaggerEngineComponent.create();
        DaggerMainActivityComponent.builder().engineComponent(engineComponent).build().inject(this);
        car.toString();
    }
}