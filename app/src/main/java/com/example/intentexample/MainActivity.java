package com.example.intentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent I = new Intent(this, SecondActivity.class);

        final EditText applesInput = (EditText) findViewById(R.id.applesInput);
        String userMessage = applesInput.getText().toString();
        I.putExtra("appleMessage", userMessage);

        startActivity(I); // as we only have one Intent object created so far
    }
}
