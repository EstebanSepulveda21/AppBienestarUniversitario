package com.unibague.bienestaruniversitario;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_app);
//        setContentView(R.layout.activity_register);
//        setContentView(R.layout.activity_log_in);
//        setContentView(R.layout.activity_form_personal_data);
//        setContentView(R.layout.activity_main_page_services);
//        setContentView(R.layout.activity_service_psychology);
//        setContentView(R.layout.activity_service_santa_ana);
//        setContentView(R.layout.activity_reserve_without);
//        setContentView(R.layout.activity_reserves);
//        setContentView(R.layout.item_list_reserves);
//        setContentView(R.layout.fragment_alert_reserve_failed);
//        setContentView(R.layout.fragment_alert__reserve__check);
    }


    public void btn_log_in(View view){
        try{
            Intent intent = new Intent(this, Log_in.class);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            e.getMessage();
        }
    }

    public void btn_register(View view){
        try{
            Intent intent = new Intent(this, Register.class);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            e.getMessage();
        }
    }
}