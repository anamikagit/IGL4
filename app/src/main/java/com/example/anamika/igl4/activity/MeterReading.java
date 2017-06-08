package com.example.anamika.igl4.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.anamika.igl4.R;
import com.example.anamika.igl4.rest.ApiClient;
import com.example.anamika.igl4.rest.ApiInterface;

import retrofit2.Call;

public class MeterReading extends AppCompatActivity {
    ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
    TextView textView_reading;
    TextView textView_date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter_reading2);

        textView_reading = (TextView) findViewById(R.id.tv_reading);
        textView_date = (TextView) findViewById(R.id.tv_reading_date);

       
    }
}
