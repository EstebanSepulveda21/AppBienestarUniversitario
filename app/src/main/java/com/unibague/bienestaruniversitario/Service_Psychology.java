package com.unibague.bienestaruniversitario;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Service_Psychology extends AppCompatActivity {
    TextView textView;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_psychology);

        spinner = (Spinner) findViewById(R.id.spinner_hour_reserve);

        ArrayList<String> elements = new ArrayList<String>();
        elements.add("6:00 AM");
        elements.add("7:00 AM");
        elements.add("8:00 AM");
        elements.add("9:00 AM");
        elements.add("10:00 AM");
        elements.add("11:00 AM");
        elements.add("12:00 PM");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, elements);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String element = (String) spinner.getAdapter().getItem(i);
                Toast.makeText(this,"Hour selected: " + element,Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private String getDateReservation() {
        LocalDate date = LocalDate.now().plusDays(1);
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM uuuu");
        String output = dtf.format(date);
        String reserve = "The reservation will be scheduled for the day " + output;
        return reserve;
    }

    public void btn_back_arrow_psychology(View view) {
        onBackPressed();
    }
}