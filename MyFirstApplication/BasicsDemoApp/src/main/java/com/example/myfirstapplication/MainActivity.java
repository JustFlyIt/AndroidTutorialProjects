package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void disable(View v) {
        v.setEnabled(false);
        ((Button)v).setText("Disabled");
        Log.d("INFO", "Button disabled." );
    }

    public void handText(View v) {
        EditText eText = findViewById(R.id.sourceText);
        String input = eText.getText().toString();

        EditText eTextOutput = findViewById(R.id.outputEditText);
        eTextOutput.setText(input);

        ((TextView)findViewById(R.id.textViewOutput)).setText(input);

        Context currentContext = v.getContext();
        // In below currentContext could be used as the first parameter
        Toast.makeText(this, input, Toast.LENGTH_LONG).show();

        Log.d("info", input);
    }
}