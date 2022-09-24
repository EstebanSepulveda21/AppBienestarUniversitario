package com.unibague.bienestaruniversitario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main_page_services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page_services);
    }

    public void btn_service_psychology(View view){
        try{
            Intent intent = new Intent(this, Service_Psychology.class);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            e.getMessage();
        }
    }

    public void btn_service_santa_ana (View view){
        try{
            Intent intent = new Intent(this, Service_santa_ana.class);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            e.getMessage();
        }
    }

    public void btn_reserves (View view){
        try{
            Intent intent = new Intent(this, Reserve_Without.class);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            e.getMessage();
        }
    }
}