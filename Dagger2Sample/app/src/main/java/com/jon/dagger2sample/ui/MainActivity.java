package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jon.dagger2sample.R;
import com.jon.dagger2sample.bean.Car;
import com.jon.dagger2sample.bean.DaggerActivityComponent;
import com.jon.dagger2sample.bean.Fruit;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Inject
    Fruit fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       DaggerActivityComponent.builder().build().inject(this);
       car.getName();

       String str = fruit.toString();



    }
}