package com.unibague.bienestaruniversitario;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Service_santa_ana extends AppCompatActivity {

    private Spinner spinnerHour;
    private Spinner spinnerSport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_santa_ana);

        spinnerHour = (Spinner) findViewById(R.id.spinner_hour_sport);
        spinnerSport = (Spinner) findViewById(R.id.spinner_hour_sport);


        ArrayList<String> hours = new ArrayList<String>();
        ArrayList<String> sports = new ArrayList<String>();

        hours.add("6:00 AM");
        sports.add("Soccer");

        ArrayAdapter adapterHours = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,hours);
        ArrayAdapter adapterSports = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,sports);

        spinnerHour.setAdapter(adapterHours);
        spinnerSport.setAdapter(adapterSports);

        spinnerSport.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String sport = (String) spinnerSport.getAdapter().getItem(i);
                Toast.makeText(this,"Sport selected: " + sport,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerHour.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String hour = (String) spinnerHour.getAdapter().getItem(i);
                Toast.makeText(this,"Hour selected: " + hour,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        })


    }

    public void btn_back_arrow_service_santa_ana(View view) {
        onBackPressed();
    }
}