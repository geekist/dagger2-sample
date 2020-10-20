package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.jon.dagger2sample.R;
import com.jon.dagger2sample.annotation.AppleFruit;
import com.jon.dagger2sample.annotation.BananaFruit;
import com.jon.dagger2sample.bean.DaggerActivityComponent;
import com.jon.dagger2sample.bean.Fruit;
import com.jon.dagger2sample.bean.Teacher;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    @AppleFruit
    Fruit apple;

    @Inject
    @BananaFruit
    public Fruit banana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent.builder().build().inject(this);
        apple.toString();
        banana.toString();


//
//        DaggerActivityComponent.builder().build().inject(this);
//        int hashCode = teacher.hashCode();
//        Log.d("msg", "hash code : " + hashCode);


    }
}