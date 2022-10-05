package com.unibague.bienestaruniversitario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class form_personal_data extends AppCompatActivity {

    EditText txtName, txtLastName, txtCode, txtEmail, txtCellphone, txtPassword;
    private Button btn;
    public static final String TAG = "MSG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_personal_data);
        txtCode = findViewById(R.id.txt_number_form_data);
        txtName = findViewById(R.id.txt_name_form_data);
        txtLastName = findViewById(R.id.txt_last_name_form_data);
        txtCellphone = findViewById(R.id.txt_cell_phone_form_data);
        txtPassword = findViewById(R.id.txt_password_form_data2);
        btn = findViewById(R.id.btn_next_register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void addPerson(View view){
        ApiInterface api = RetrofitClient.getRetrofitInstance().create(ApiInterface.class);
        Call<Person> call = api.addPerson(Long.valueOf(4),"Auron", "Auroncito", "Auroncitomail",
                "Estudiante", "Auron");
        call.enqueue(new Callback<Person>() {
            @Override
            public void onResponse(Call<Person> call, Response<Person> response) {
                Log.e(TAG, "onResponse: " + response.code() );
                Log.e(TAG, "onResponse: id " + response.body().getId() );
                Log.e(TAG, "onResponse: name" + response.body().getName() );
                Log.e(TAG, "onResponse: lastName" + response.body().getLastName() );

            }

            @Override
            public void onFailure(Call<Person> call, Throwable t) {
                Log.e(TAG, "onFailure: "+t.getMessage());

            }
        });
     /*   Call<Person> call = api.addPerson(9L, txtName.getText().toString(),
                txtLastName.getText().toString(),"cristianmail", txtCellphone.getText().toString(),
                txtPassword.getText().toString());*/

    }



}