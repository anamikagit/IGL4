package com.example.anamika.igl4.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.anamika.igl4.R;
import com.example.anamika.igl4.model.MeterReadingResponce;
import com.example.anamika.igl4.rest.ApiClient;
import com.example.anamika.igl4.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

        Call<List<MeterReadingResponce>> call = apiService.getMeterReading("o00002");
        call.enqueue(new Callback<List<MeterReadingResponce>>() {
            @Override
            public void onResponse(Call<List<MeterReadingResponce>> call, Response<List<MeterReadingResponce>> response) {
                List<MeterReadingResponce> readingResponces = response.body();
                MeterReadingResponce meterReadingResponce = readingResponces.get(0);
                String data1 = meterReadingResponce.getReading().toString();
                String data2 = meterReadingResponce.getIMGDATE();
                textView_reading.setText(data1);
                textView_date.setText(data2);

               /* List<String>dataSet = new ArrayList<String>();
                dataSet.add(data1);
                dataSet.add(data2);*/
                //recyclerView.setAdapter(new ReadingAdapter(dataSet, R.layout.meter_reading_row, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<List<MeterReadingResponce>> call, Throwable t) {

            }
        });
    }
}
