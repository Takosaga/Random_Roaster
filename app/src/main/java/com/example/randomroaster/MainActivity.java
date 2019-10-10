package com.example.randomroaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button button = findViewById(R.id.vincent_button);

    Button button1 = findViewById(R.id.zoey_button);

    TextView textView = findViewById(R.id.roastText);

    public void vincentPress (View view){
        textView.setText("vincent " + "roast 1");

    }

    public void zoeyPress (View view){
        textView.setText("Zoey " + "roast 1");

    }
}
