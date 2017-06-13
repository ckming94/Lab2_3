package com.example.taruc.lab2_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int GET_MESSAGE = 1;
    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
    }
    
    public void getMessage(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, GET_MESSAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == GET_MESSAGE){
            if(resultCode == GET_MESSAGE){
                textViewMessage.setText(data.getStringExtra("MESSAGE"));
            }
        }
    }
}
