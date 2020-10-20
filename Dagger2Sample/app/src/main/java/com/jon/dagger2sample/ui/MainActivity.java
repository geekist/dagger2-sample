package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.jon.dagger2sample.R;

import com.jon.dagger2sample.bean.ClassAComponent;
import com.jon.dagger2sample.bean.ClassB;
import com.jon.dagger2sample.bean.DaggerClassAComponent;
import com.jon.dagger2sample.bean.DaggerClassBComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ClassB cB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClassAComponent cAComponent = DaggerClassAComponent.create();
        DaggerClassBComponent.builder().classAComponent(cAComponent).build().inject(this);

        int hashCode = cB.hashCode();
        Log.d("msg","hash code :" + hashCode);
    }
}