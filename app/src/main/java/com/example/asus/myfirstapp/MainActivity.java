package com.example.asus.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.asus.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendMonth(View view)
    {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        String month = spinner.getSelectedItem().toString();
        intent.putExtra(EXTRA_MESSAGE, month);
        startActivity(intent);

    }




}
