package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView Name, MarksType, Marks10th, Marks12th, Stream, FatherName, MotherName, City, MobileNumber, Gender, Skills;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Name = findViewById(R.id.name);
        MarksType = findViewById(R.id.marksType);
        Marks10th = findViewById(R.id.Marks10th);
        Marks12th = findViewById(R.id.Marks12th);
        Stream = findViewById(R.id.stream);
        FatherName = findViewById(R.id.fatherName);
        MotherName = findViewById(R.id.motherName);
        City = findViewById(R.id.cityName);
        MobileNumber = findViewById(R.id.mobileNumber);
        Gender = findViewById(R.id.gender);
        Skills = findViewById(R.id.skills);

        Intent intent = getIntent();
        String name = intent.getStringExtra("FirstName");
        name = name + ' ' +intent.getStringExtra("LastName");
        Name.setText(name);
        MarksType.setText(intent.getStringExtra("Type"));
        Marks10th.setText(intent.getStringExtra("Marks10th"));
        Marks12th.setText(intent.getStringExtra("Marks12th"));
        Stream.setText(intent.getStringExtra("Stream"));
        FatherName.setText(intent.getStringExtra("FatherName"));
        MotherName.setText(intent.getStringExtra("MotherName"));
        City.setText(intent.getStringExtra("City"));
        MobileNumber.setText(intent.getStringExtra("Number"));
        Gender.setText(intent.getStringExtra("Gender"));
        Skills.setText(intent.getStringExtra("Skills"));
    }
}