package com.example.onlineapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class Adminpage extends AppCompatActivity {

    public Toolbar toolbar;
    Button addTeacher,addStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpage);

        addTeacher=(Button)findViewById(R.id.addTeacher);
        addStudent=(Button)findViewById(R.id.addStudent);

        addTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Adminpage.this,TeacherDetails.class);
                startActivity(intent);
            }
        });

        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Adminpage.this,StudentDetails.class);
                startActivity(intent);
            }
        });


    }
}