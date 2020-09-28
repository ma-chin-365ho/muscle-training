package com.example.muscletraining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {

            int cntCall = 0;

            @Override
            public void onClick(View v) {
                cntCall++;
                ((TextView)findViewById(R.id.textView)).setText(Integer.toString(cntCall));
            }
        });
    }
}