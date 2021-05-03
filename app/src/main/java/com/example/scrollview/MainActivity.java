package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstName, lastName, marks10th, marks12th, stream, fatherName, motherName, city, number;
    CheckBox percentage, cgpa, c, python;
    RadioGroup radioGroup;
    RadioButton gender;
    Button button;
    String type, language, Gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        marks10th = findViewById(R.id.Marks10th);
        marks12th = findViewById(R.id.Marks12th);
        stream = findViewById(R.id.stream);
        fatherName = findViewById(R.id.fatherName);
        motherName = findViewById(R.id.motherName);
        city = findViewById(R.id.cityName);
        number = findViewById(R.id.mobileNumber);

        percentage = findViewById(R.id.percentage);
        cgpa = findViewById(R.id.cgpa);
        c = findViewById(R.id.c);
        python = findViewById(R.id.Python);

        radioGroup = findViewById(R.id.gender);

        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Successfully Submitted", Toast.LENGTH_SHORT).show();
                if(percentage.isChecked()){
                    type = "Percentage";
                }
                if(cgpa.isChecked()){
                    type = "cgpa";
                }
                if(c.isChecked()){
                    language = "C";
                }
                if(python.isChecked()){
                    language = language + ',' + "Python";
                }

                int id = radioGroup.getCheckedRadioButtonId();
                gender = findViewById(id);
                Gender = gender.getText().toString();

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("FirstName",firstName.getText().toString());
                intent.putExtra("LastName",lastName.getText().toString());
                intent.putExtra("Marks10th",marks10th.getText().toString());
                intent.putExtra("Marks12th",marks12th.getText().toString());
                intent.putExtra("Stream",stream.getText().toString());
                intent.putExtra("FatherName",fatherName.getText().toString());
                intent.putExtra("MotherName",motherName.getText().toString());
                intent.putExtra("City",city.getText().toString());
                intent.putExtra("Number",number.getText().toString());
                intent.putExtra("Type",type);
                intent.putExtra("Skills",language);
                intent.putExtra("Gender",Gender);
                startActivity(intent);
            }
        });
    }
}