package com.example.laurin.werwolf;

import android.content.Intent;
import android.icu.util.ICUUncheckedIOException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.ArcMotion;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class help extends AppCompatActivity {

    TextView helpText;
    Button Wolfshund;
    Button WWolf;
    Button Urwolf;
    Button GBWolf;
    Button Werwolf;
    Button Nutte;
    Button Amor;
    Button WKind;
    Button Hexe;
    Button Heiler;
    Button Seher;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);


        helpText = findViewById(R.id.textHelp);
        Wolfshund = findViewById(R.id.buttonHelpWolfshund);
        WWolf = findViewById(R.id.buttonHelpWWolf);
        Urwolf = findViewById(R.id.buttonHelpUrwolf);
        GBWolf = findViewById(R.id.buttonHelpGBWolf);
        Werwolf = findViewById(R.id.buttonHelpWerwolf);

        Nutte = findViewById(R.id.buttonHelpNutte);
        Amor = findViewById(R.id.buttonHelpAmor);
        WKind = findViewById(R.id.buttonHelpWKind);
        Hexe = findViewById(R.id.buttonHelpHexe);
        Heiler = findViewById(R.id.buttonHelpHeiler);
        Seher = findViewById(R.id.buttonHelpSeher);


        Wolfshund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpsite = new Intent(getBaseContext(), help_role.class);
                counter = 1;
                helpsite.putExtra("CounterRole", counter);
                startActivity(helpsite);
            }
        });

        WWolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpsite = new Intent(getBaseContext(), help_role.class);
                counter = 2;
                helpsite.putExtra("CounterRole", counter);
                startActivity(helpsite);
            }
        });

        Urwolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpsite = new Intent(getBaseContext(), help_role.class);
                counter = 3;
                helpsite.putExtra("CounterRole", counter);
                startActivity(helpsite);
            }
        });

        GBWolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpsite = new Intent(getBaseContext(), help_role.class);
                counter = 4;
                helpsite.putExtra("CounterRole", counter);
                startActivity(helpsite);
            }
        });

        Werwolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpsite = new Intent(getBaseContext(), help_role.class);
                counter = 5;
                helpsite.putExtra("CounterRole", counter);
                startActivity(helpsite);
            }
        });

        Nutte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpsite = new Intent(getBaseContext(), help_role.class);
                counter = 6;
                helpsite.putExtra("CounterRole", counter);
                startActivity(helpsite);
            }
        });

        Amor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpsite = new Intent(getBaseContext(), help_role.class);
                counter = 7;
                helpsite.putExtra("CounterRole", counter);
                startActivity(helpsite);
            }
        });

        WKind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpsite = new Intent(getBaseContext(), help_role.class);
                counter = 8;
                helpsite.putExtra("CounterRole", counter);
                startActivity(helpsite);
            }
        });

        Hexe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpsite = new Intent(getBaseContext(), help_role.class);
                counter = 9;
                helpsite.putExtra("CounterRole", counter);
                startActivity(helpsite);
            }
        });

        Heiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpsite = new Intent(getBaseContext(), help_role.class);
                counter = 10;
                helpsite.putExtra("CounterRole", counter);
                startActivity(helpsite);
            }
        });

        Seher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpsite = new Intent(getBaseContext(), help_role.class);
                counter = 11;
                helpsite.putExtra("CounterRole", counter);
                startActivity(helpsite);
            }
        });



    }
}
