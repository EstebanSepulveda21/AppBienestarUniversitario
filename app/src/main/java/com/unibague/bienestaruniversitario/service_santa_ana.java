package com.unibague.bienestaruniversitario;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class service_santa_ana extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_santa_ana);
    }

    public void btn_back_arrow_service_santa_ana(View view) {
        onBackPressed();
    }
}