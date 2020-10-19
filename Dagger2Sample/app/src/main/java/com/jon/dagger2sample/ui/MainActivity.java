package com.jon.dagger2sample.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jon.dagger2sample.R;

import com.jon.dagger2sample.bean.DaggerStudentComponent;
import com.jon.dagger2sample.bean.DaggerTeacherComponent;
import com.jon.dagger2sample.bean.Student;
import com.jon.dagger2sample.bean.TeacherComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //@Inject
    //Teacher teacher;

    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Teacher teacher = DaggerTeacherComponent.builder().build().getTeacher();

        TeacherComponent teacherComponent = DaggerTeacherComponent.create();
        DaggerStudentComponent.builder().teacherComponent(teacherComponent).build().inject(this);
        student.toString();
        //  teacher.toString();

    }
}