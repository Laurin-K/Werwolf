package com.example.laurin.werwolf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class prepare extends AppCompatActivity {

    TextView fillroles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepare);

        fillroles = findViewById(R.id.text_prepare_rollen);

        Bundle b = this.getIntent().getExtras();
        String[] test = b.getStringArray("roles");


        fillroles.setText(Arrays.toString(test));

    }
}
