package com.unibague.bienestaruniversitario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Log_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void btn_next_log_in(View view){
        try {
            Intent intent = new Intent(this, Main_page_services.class);
            startActivity(intent);
        }catch (ActivityNotFoundException e) {
            e.getMessage();
        }
    }

    public void btn_back_arrow_log_in(View view){
        onBackPressed();
    }

}