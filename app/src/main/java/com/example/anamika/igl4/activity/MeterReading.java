package com.example.anamika.igl4.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.anamika.igl4.R;
import com.example.anamika.igl4.adapter.ReadingAdapter;
import com.example.anamika.igl4.model.MeterReadingResponce;
import com.example.anamika.igl4.rest.ApiClient;
import com.example.anamika.igl4.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.R.id.list;

public class MeterReading extends AppCompatActivity {
    RecyclerView recyclerView;

    ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter_reading);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        final ReadingAdapter readingAdapter = new ReadingAdapter();
        recyclerView.setAdapter(readingAdapter);

        Call<List<MeterReadingResponce>> call = apiService.getMeterReading("o00002");
        call.enqueue(new Callback<List<MeterReadingResponce>>() {
            @Override
            public void onResponse(Call<List<MeterReadingResponce>> call, Response<List<MeterReadingResponce>> response) {
                  List<MeterReadingResponce> readingResponces = response.body();
                  readingAdapter.updateList(readingResponces);
            }

            @Override
            public void onFailure(Call<List<MeterReadingResponce>> call, Throwable t) {

            }
        });
    }
}
