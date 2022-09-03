package com.unibague.bienestaruniversitario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Reserve_Without extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_without);
    }

    public void btn_back_arrow_without_reserve(View view){
        onBackPressed();
    }
}