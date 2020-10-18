package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jon.dagger2sample.R;
import com.jon.dagger2sample.bean.Car;
import com.jon.dagger2sample.bean.DaggerActivityComponent;

import javax.inject.Inject;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

    @Inject
    Lazy<Car> carLazy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent.builder().build().inject(this);
        Car car = carLazy.get();
    }
}