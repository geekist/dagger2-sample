package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.jon.dagger2sample.R;
import com.jon.dagger2sample.bean.DaggerActivityComponent;
import com.jon.dagger2sample.bean.Fruit;
import com.jon.dagger2sample.bean.Teacher;
import com.jon.dagger2sample.bean.ThirdPartObj;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Teacher teacher;

    @Inject
    ThirdPartObj tpObj;

    @Inject
    Fruit fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerActivityComponent.builder().build().inject(this);
        int hashCode = fruit.hashCode();
        Log.d("msg","hash code: " + hashCode);
    }
}