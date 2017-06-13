package com.example.taruc.lab2_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextMessage = (EditText)findViewById(R.id.editTextMessage);
    }

    public void closeSecond(View view){
        // get the Entered message
        String message = editTextMessage.getText().toString();
        Intent intent = new Intent();

        // put the message in Intent
        intent.putExtra("MESSAGE", message);
        // set the result in Intent
        setResult(1, intent);
        // finish the activity
        finish();
    }
}
