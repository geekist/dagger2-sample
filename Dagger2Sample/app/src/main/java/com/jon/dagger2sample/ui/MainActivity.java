package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.jon.dagger2sample.R;
import com.jon.dagger2sample.bean.DBManager;
import com.jon.dagger2sample.bean.DaggerActivityComponent;
import com.jon.dagger2sample.bean.Fruit;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DBManager dbManager1;

    @Inject
    DBManager dbManager2;

    @Inject
    Fruit fruit1;

    @Inject
    Fruit fruit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       DaggerActivityComponent.builder().build().inject(this);

       String str = "dbManager1:" + dbManager1.hashCode() + " dbManager2: " +  dbManager2.hashCode();
       Toast.makeText(this,str,Toast.LENGTH_LONG).show();

        String str2 = "fruit1:" + fruit1.hashCode() + " fruit2: " +  fruit2.hashCode();
        Toast.makeText(this,str2,Toast.LENGTH_LONG).show();
    }
}