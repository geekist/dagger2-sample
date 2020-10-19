package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jon.dagger2sample.R;
import com.jon.dagger2sample.bean.Child;
import com.jon.dagger2sample.bean.DaggerFatherComponent;
import com.jon.dagger2sample.bean.FatherComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Child child;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FatherComponent fatherComponent = DaggerFatherComponent.create();
        fatherComponent.buildChildComponent().build().inject(this);

        child.toString();

    }
}