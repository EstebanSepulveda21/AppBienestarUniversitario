package com.unibague.bienestaruniversitario;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Service_Psychology extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_psychology);

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