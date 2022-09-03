package com.unibague.bienestaruniversitario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class form_personal_data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_personal_data);
    }

    public void btn_next(View view) {
        try{
            Intent intent = new Intent(this, Main_page_services.class);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            e.getMessage();
        }
    }
}