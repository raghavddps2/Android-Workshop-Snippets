package com.example.android.try_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final TextView txtView = (TextView) findViewById(R.id.text1);
        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txtView.setText("Hello india");
            }
        });
    }
}
