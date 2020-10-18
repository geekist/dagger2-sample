package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.jon.dagger2sample.bean.Car;
import com.jon.dagger2sample.bean.DaggerActivityCarComponent;
import com.jon.dagger2sample.bean.DaggerActivityFruitComponent;
import com.jon.dagger2sample.bean.Fruit;
import com.jon.dagger2sample.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Fruit fruit;

    @Inject
    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String toString = "";
        DaggerActivityFruitComponent.builder().build().inject(this);
        toString = fruit.toString();

        DaggerActivityCarComponent.builder().build().inject(this);
        toString = car.getEngineName();

        Toast.makeText(this,toString,Toast.LENGTH_LONG).show();
    }
}