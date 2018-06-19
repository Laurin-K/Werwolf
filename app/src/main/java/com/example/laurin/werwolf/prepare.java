package com.example.laurin.werwolf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class prepare extends AppCompatActivity {

    TextView fillroles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepare);

        fillroles = findViewById(R.id.text_prepare_rollen);

        fillroles.setText("test");
    }
}
