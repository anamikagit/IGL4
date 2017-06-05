package com.example.anamika.igl4.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.anamika.igl4.R;
import com.example.anamika.igl4.model.LoginFieldResponce;
import com.example.anamika.igl4.model.MeterReadingResponce;
import com.example.anamika.igl4.rest.ApiClient;
import com.example.anamika.igl4.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Menu extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
//@BindView(R.id.meter_reading_spinner)Spinner spinner;
    Spinner spinner;
    TextView textView;
    Button button;
    ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //ButterKnife.bind(this);

        spinner = (Spinner) findViewById(R.id.meter_reading_spinner);
        textView = (TextView) findViewById(R.id.spinner_text);
        button = (Button) findViewById(R.id.spinner_show);

        List<String> data = new ArrayList<String>();
        data.add("Daily");
        data.add("Monthly");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,R.layout.spinner_item,data);
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(Menu.this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu.this,MeterReading.class);
                startActivity(i);
                getMeterReading();
            }
        });
    }

    public void getMeterReading(){

        Call<List<MeterReadingResponce>> call = apiService.getMeterReading("o00002");
        call.enqueue(new Callback<List<MeterReadingResponce>>() {
            @Override
            public void onResponse(Call<List<MeterReadingResponce>> call, Response<List<MeterReadingResponce>> response) {

            }

            @Override
            public void onFailure(Call<List<MeterReadingResponce>> call, Throwable t) {

            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
