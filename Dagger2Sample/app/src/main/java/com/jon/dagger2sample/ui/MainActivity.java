package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.jon.dagger2sample.R;
import com.jon.dagger2sample.bean.Teacher;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Teacher teacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DaggerMainActivityComponent.builder().build().inject(this);
        int hashCode = teacher.hashCode();
        Log.d("msg","hashCode: " + hashCode);

    }
}