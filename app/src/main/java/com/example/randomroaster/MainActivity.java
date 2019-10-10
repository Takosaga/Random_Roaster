package com.example.randomroaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.vincent_button);

        Button button1 = findViewById(R.id.zoey_button);

        TextView textView = findViewById(R.id.roastText);
    }


    public void vincentPress (View view){
        TextView textView = findViewById(R.id.roastText);
        final String[] vinceInsults = {"roast 1", "roast 2", "roast 3", "roast 4"};
        Random random = new Random();
        int index = random.nextInt(vinceInsults.length);
        textView.setText("Vincent " + vinceInsults[index]);


    }

    public void zoeyPress (View view){
        TextView textView = findViewById(R.id.roastText);
        final String[] zoeyInsults = {"roast 1", "roast 2", "roast 3", "roast 4"};
        Random random = new Random();
        int index = random.nextInt(zoeyInsults.length);
        textView.setText("Zoey " + zoeyInsults[index]);


    }
}
