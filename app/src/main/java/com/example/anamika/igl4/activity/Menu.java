package com.example.anamika.igl4.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.anamika.igl4.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Menu extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
//@BindView(R.id.meter_reading_spinner)Spinner spinner;
Spinner spinner;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //ButterKnife.bind(this);
        spinner = (Spinner) findViewById(R.id.meter_reading_spinner);
       // textView = (TextView) findViewById(R.id.spinner_textView);

        List<String> data = new ArrayList<String>();
        data.add("anu");
        data.add("afff");
        data.add("afs");
        data.add("sdf");
        data.add("amk");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,R.layout.spinner_item,data);
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(Menu.this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
