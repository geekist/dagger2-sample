package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jon.dagger2sample.R;
import com.jon.dagger2sample.bean.AppleFruit;
import com.jon.dagger2sample.bean.BananaFruit;
import com.jon.dagger2sample.bean.DaggerActivityComponent;
import com.jon.dagger2sample.bean.Fruit;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject
    @AppleFruit
    // @Named("Apple")
    public Fruit fruitApple;


    @Inject
    @BananaFruit
    //@Named("Banana")
    public Fruit fruitBanana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent.builder().build().inject(this);

        String strApple = fruitApple.toString();
        String strBanana = fruitBanana.toString();

    }
}