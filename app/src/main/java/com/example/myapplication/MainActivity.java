package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView tvTitle;
    EditText editLogin;
    Adapter adapter;
    RecyclerView recyclerView;
    List<Car> carList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitle=findViewById(R.id.tvnm);
        tvTitle.setTextSize(35);

       int a=3;
       boolean isTrue=true;
       float x=3.5f;
       double y=4.9;
       String name="arslan";

    }
}