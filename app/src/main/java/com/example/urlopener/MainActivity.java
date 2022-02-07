package com.example.urlopener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    EditText prompt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button run = findViewById(R.id.run), google = findViewById(R.id.google), yahoo = findViewById(R.id.yahoo), amazon = findViewById(R.id.amazon), flipkart = findViewById(R.id.flipkart);

        run.setOnClickListener(view -> {
            try {
                new URL(getURL()).openConnection().connect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        google.setOnClickListener(view -> {
            try {
                new URL("https://www.google.co.in").openConnection().connect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        yahoo.setOnClickListener(view -> {
            try {
                new URL("https://in.yahoo.com").openConnection().connect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        amazon.setOnClickListener(view -> {
            try {
                new URL("https://www.amazon.in").openConnection().connect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        flipkart.setOnClickListener(view -> {
            try {
                new URL("https://www.flipkart.com").openConnection().connect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public String getURL() {
        prompt = findViewById(R.id.prompt);
        return prompt.getText().toString();
    }
}