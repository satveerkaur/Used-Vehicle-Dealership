package com.example.usedvehicledealership;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.OutputStreamWriter;

public class AddActivity extends BaseMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }
    public void onAdd(View v){
        EditText make= findViewById(R.id.add_make);
        EditText engineCylinder=findViewById(R.id.add_engineCylinder);
        EditText condition=findViewById(R.id.add_condition);
        EditText model=findViewById(R.id.add_model);
        EditText year=findViewById(R.id.add_year);
        EditText noOfDoors=findViewById(R.id.add_noOfDoors);
        EditText price=findViewById(R.id.add_price);
        
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("CarsAdded/*");


    }
}