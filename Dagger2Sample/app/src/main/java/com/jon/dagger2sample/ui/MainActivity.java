package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jon.dagger2sample.R;
import com.jon.dagger2sample.bean.DaggerActivityComponent;
import com.jon.dagger2sample.bean.DaggerFruitComponent;
import com.jon.dagger2sample.bean.DaggerMallComponent;
import com.jon.dagger2sample.bean.Mall;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Mall mall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//       DaggerActivityComponent.builder().build().inject(this);
//       car.getName();
//
//       String str = fruit.toString();

        DaggerActivityComponent
                .builder()
                .mallComponent(DaggerMallComponent
                        .builder()
                        .fruitComponent(DaggerFruitComponent
                                .create())
                        .build())
                .build()
                .inject(this);

    }
}