package com.example.laurin.werwolf;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch switchWolfshund;
    Switch switchWWolf;
    Switch switchUrwolf;
    Switch switchGBWolf;
    Switch switchWerwolf;

    Switch switchNutte;
    Switch switchAmor;
    Switch switchWKind;
    Switch switchHexe;
    Switch switchHeiler;
    Switch switchSeher;

    Button help;
    Button pluswolf;
    Button minuswolf;
    EditText amountWolfs;
    FloatingActionButton startGame;

    int wolfs = 5;
    int numRoles = 11;
    int numCols = 2;
    int colRoleNumber = 0;
    int colRoleName = 1;
    String[][] aRoles = new String[numCols][numRoles];
    String[] RoleName = new String[numRoles];
    int[] aWolfs = new int[wolfs];

    int id_wolfshund = 0;
    int id_wwolf = 1;
    int id_urwolf = 2;
    int id_gbwolf = 3;
    int id_werwolf = 4;
    int id_nutte = 5;
    int id_amor = 6;
    int id_wkind = 7;
    int id_hexe = 8;
    int id_heiler = 9;
    int id_seher = 10;

    int helpcount;
    int wolfcount = 1;
    int maxWolfs = 5;
    int backButtonCount = 0;
    long timestamp = 0;
    long time= System.currentTimeMillis();


    @Override
    public void onBackPressed()
    {
        if(backButtonCount >= 1){

            if(time > timestamp + 2000){
                backButtonCount = 0;
                timestamp = 0;
            }
            else{
                Intent intenthome = new Intent(Intent.ACTION_MAIN);
                intenthome.addCategory(Intent.CATEGORY_HOME);
                intenthome.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intenthome);
            }
        }
        else{
            Toast.makeText(this, "Press the back button once again to close the application.", Toast.LENGTH_SHORT).show();
            backButtonCount = 1;
            timestamp = time;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchWolfshund = findViewById(R.id.switch_wolfshund);
        switchWWolf = findViewById(R.id.switch_wwolf);
        switchUrwolf = findViewById(R.id.switch_urwolf);
        switchGBWolf = findViewById(R.id.switch_gbwolf);
        switchWerwolf = findViewById(R.id.switch_werwolf);

        switchNutte = findViewById(R.id.switch_nutte);
        switchAmor = findViewById(R.id.switch_amor);
        switchWKind = findViewById(R.id.switch_wkind);
        switchHexe = findViewById(R.id.switch_hexe);
        switchHeiler = findViewById(R.id.switch_heiler);
        switchSeher = findViewById(R.id.switch_seher);

        help = findViewById(R.id.button_help);
        pluswolf = findViewById(R.id.addWolf);
        minuswolf = findViewById(R.id.subWolf);
        amountWolfs =findViewById(R.id.amountWolf);
        startGame = findViewById(R.id.fab_start);


        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent preparesite = new Intent(getBaseContext(), prepare.class);
                for(int i = 0; i < numRoles; i++) {
                    if(aRoles[colRoleName][i] != "" || aRoles[colRoleName][i] != null) {
                        RoleName[i] = aRoles[colRoleName][i];
                    }else{
                        RoleName[i] = "X";
                    }
                }
                Bundle b = new Bundle();
                b.putStringArray("roles", RoleName);
                preparesite.putExtras(b);
                startActivity(preparesite);
            }
        });

        pluswolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(wolfcount < maxWolfs) {
                    wolfcount++;
                    String w = Integer.toString(wolfcount);
                    amountWolfs.setText(w);
                }else{
                    Toast.makeText(getApplicationContext(), "Die max. Anzahl an Werwölfen wird überschritten", Toast.LENGTH_SHORT).show();
                }
            }
        });

        minuswolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(wolfcount > 1){
                    wolfcount--;
                    String w = Integer.toString(wolfcount);
                    amountWolfs.setText(w);
                }else{
                    Toast.makeText(getApplicationContext(), "Die mind. Anzahl an Werwölfen wird unterschritten", Toast.LENGTH_SHORT).show();
                }
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpsite = new Intent(getBaseContext(), help.class);
                startActivity(helpsite);
            }
        });

        switchWolfshund.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Toast.makeText(getApplicationContext(), "Wolfshund hinzugefügt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_wolfshund] = Integer.toString(1);
                    aRoles[colRoleName][id_wolfshund] = "Wolfshund";
                }else{
                    Toast.makeText(getApplicationContext(), "Wolfshund entfernt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_wolfshund] = Integer.toString(0);
                    aRoles[colRoleName][id_wolfshund] = "";
                }
            }
        });

        switchWWolf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Toast.makeText(getApplicationContext(), "Weißer Werwolf hinzugefügt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_wwolf] = Integer.toString(1);
                    aRoles[colRoleName][id_wwolf] = "Weißer Wolf";
                }else{
                    Toast.makeText(getApplicationContext(), "Weißer Werwolf entfernt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_wwolf] = Integer.toString(0);
                    aRoles[colRoleName][id_wwolf] = "";
                }
            }
        });switchUrwolf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Toast.makeText(getApplicationContext(), "Urwolf hinzugefügt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_urwolf] = Integer.toString(1);
                    aRoles[colRoleName][id_urwolf] = "Urwolf";
                }else{
                    Toast.makeText(getApplicationContext(), "Urwolf entfernt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_urwolf] = Integer.toString(0);
                    aRoles[colRoleName][id_urwolf] = "";
                }
            }
        });

        switchGBWolf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Toast.makeText(getApplicationContext(), "Großer Böser Wolf hinzugefügt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_gbwolf] = Integer.toString(1);
                    aRoles[colRoleName][id_gbwolf] = "Großer Böser Wolf";
                }else{
                    Toast.makeText(getApplicationContext(), "Großer Böser Wolf  entfernt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_gbwolf] = Integer.toString(0);
                    aRoles[colRoleName][id_gbwolf] = "";
                }
            }
        });

        switchWerwolf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    aRoles[colRoleNumber][id_werwolf] = Integer.toString(1);
                    aRoles[colRoleName][id_werwolf] = "Werwölfen";
                    for(int i = 0; i < wolfcount; i++){
                        aWolfs[i] = 1;
                    }
                    Toast.makeText(getApplicationContext(), "Werwolf hinzugefügt" + aWolfs[0] + aWolfs[1] + aWolfs[2] + aWolfs[3] + aWolfs[4], Toast.LENGTH_SHORT).show();
                }else {
                    aRoles[colRoleNumber][id_werwolf] = Integer.toString(0);
                    aRoles[colRoleName][id_werwolf] = "";
                    for (int i = 0; i < maxWolfs - 1; i++){
                        aWolfs[i] = 0;
                    }
                    Toast.makeText(getApplicationContext(), "Werwolf entfernt"+ aWolfs[0] + aWolfs[1] + aWolfs[2] + aWolfs[3] + aWolfs[4], Toast.LENGTH_SHORT).show();
                }
            }
        });

        switchNutte.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Toast.makeText(getApplicationContext(), "Nutte hinzugefügt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_nutte] = Integer.toString(1);
                    aRoles[colRoleName][id_nutte] = "Nutte";
                }else{
                    Toast.makeText(getApplicationContext(), "Nutte entfernt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_nutte] = Integer.toString(0);
                    aRoles[colRoleName][id_nutte] = "";
                }
            }
        });

        switchAmor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Toast.makeText(getApplicationContext(), "Amor hinzugefügt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_amor] = Integer.toString(1);
                    aRoles[colRoleName][id_amor] = "Amor";
                }else{
                    Toast.makeText(getApplicationContext(), "Amor entfernt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_amor] = Integer.toString(0);
                    aRoles[colRoleName][id_amor] = "";
                }
            }
        });

        switchWKind.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Toast.makeText(getApplicationContext(), "Wildes Kind hinzugefügt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_wkind] = Integer.toString(1);
                    aRoles[colRoleName][id_wkind] = "Wildes Kind";
                }else{
                    Toast.makeText(getApplicationContext(), "Wildes Kind entfernt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_wkind] = Integer.toString(0);
                    aRoles[colRoleName][id_wkind] = "";
                }
            }
        });

        switchHexe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Toast.makeText(getApplicationContext(), "Hexe hinzugefügt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_hexe] = Integer.toString(1);
                    aRoles[colRoleName][id_hexe] = "Hexe";
                }else{
                    Toast.makeText(getApplicationContext(), "Hexe entfernt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_hexe] = Integer.toString(0);
                    aRoles[colRoleName][id_hexe] = "";
                }
            }
        });

        switchHeiler.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Toast.makeText(getApplicationContext(), "Heiler hinzugefügt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_heiler] = Integer.toString(1);
                    aRoles[colRoleName][id_heiler] = "Heiler";
                }else{
                    Toast.makeText(getApplicationContext(), "Heiler entfernt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_heiler] = Integer.toString(0);
                    aRoles[colRoleName][id_heiler] = "";
                }
            }
        });

        switchSeher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Toast.makeText(getApplicationContext(), "Seher hinzugefügt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_seher] = Integer.toString(1);
                    aRoles[colRoleName][id_seher] = "Seher";
                }else{
                    Toast.makeText(getApplicationContext(), "Seher entfernt", Toast.LENGTH_SHORT).show();
                    aRoles[colRoleNumber][id_seher] = Integer.toString(0);
                    aRoles[colRoleName][id_seher] = "";
                }
            }
        });
    }
}
