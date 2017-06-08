package com.example.anamika.igl4.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.anamika.igl4.R;
import com.example.anamika.igl4.model.LoginFieldResponce;
import com.example.anamika.igl4.rest.ApiClient;
import com.example.anamika.igl4.rest.ApiInterface;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
@BindView(R.id.edt_uname)EditText editText_uname;
@BindView(R.id.edt_pwd)EditText editText_pwd;
@BindView(R.id.btn_login)Button button_login;

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ButterKnife.bind(this);

            button_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, Menu.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this,"Login successfull",Toast.LENGTH_SHORT).show();
                    sendCredentials();
                }
            });
        }

    public void sendCredentials(){

        Call<List<LoginFieldResponce>> call = apiService.sendLoginCredential(editText_uname.getText().toString(),editText_pwd.getText().toString());
        call.enqueue(new Callback<List<LoginFieldResponce>>() {
            @Override
            public void onResponse(Call<List<LoginFieldResponce>> call, Response<List<LoginFieldResponce>> response) {

            }

            @Override
            public void onFailure(Call<List<LoginFieldResponce>> call, Throwable t) {

            }
        });
    }
}

