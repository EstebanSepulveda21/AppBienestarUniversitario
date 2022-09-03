package com.unibague.bienestaruniversitario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void btn_next(View view){
        try{
            Intent intent = new Intent(this, form_personal_data.class);
            startActivity(intent);
        }catch(ActivityNotFoundException e){
            e.getMessage();
        }
    }

    public void btn_back_arrow_register(View view){
        onBackPressed();
    }
}