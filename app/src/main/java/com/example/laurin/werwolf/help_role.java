package com.example.laurin.werwolf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class help_role extends AppCompatActivity {

    TextView Beschreibung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_role);

        Beschreibung = findViewById(R.id.textHelpRole);
        int choose = getIntent().getExtras().getInt("CounterRole");

        switch(choose){
            case 1:
                Beschreibung.setText(getResources().getString(R.string.Beschreibung_Wolfshund));
                break;
            case 2:
                Beschreibung.setText(getResources().getString(R.string.Beschreibung_WWolf));
                break;
            case 3:
                Beschreibung.setText(getResources().getString(R.string.Beschreibung_Urwolf));
                break;
            case 4:
                Beschreibung.setText(getResources().getString(R.string.Beschreibung_GBWolf));
                break;
            case 5:
                Beschreibung.setText(getResources().getString(R.string.Beschreibung_Werwolf));
                break;
            case 6:
                Beschreibung.setText(getResources().getString(R.string.Beschreibung_Nutte));
                break;
            case 7:
                Beschreibung.setText(getResources().getString(R.string.Beschreibung_Amor));
                break;
            case 8:
                Beschreibung.setText(getResources().getString(R.string.Beschreibung_WKind));
                break;
            case 9:
                Beschreibung.setText(getResources().getString(R.string.Beschreibung_Hexe));
                break;
            case 10:
                Beschreibung.setText(getResources().getString(R.string.Beschreibung_Heiler));
                break;
            case 11:
                Beschreibung.setText(getResources().getString(R.string.Beschreibung_Seher));
                break;
            default:
                Beschreibung.setText(getResources().getString(R.string.Error));
                break;
        }
    }
}
