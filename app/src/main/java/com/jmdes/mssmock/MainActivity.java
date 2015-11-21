package com.jmdes.mssmock;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
                            implements AdapterView.OnItemSelectedListener{

    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    Spinner spinner5;
    Spinner spinner6;
    Spinner spinner7;
    Spinner spinner8;
    Spinner spinner9;
    Spinner spinner10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner5 = (Spinner) findViewById(R.id.spinner5);
        spinner6 = (Spinner) findViewById(R.id.spinner6);
        spinner7 = (Spinner) findViewById(R.id.spinner7);
        spinner8 = (Spinner) findViewById(R.id.spinner8);
        spinner9 = (Spinner) findViewById(R.id.spinner9);
        spinner10 = (Spinner) findViewById(R.id.spinner10);

        ArrayAdapter typeAdapter=ArrayAdapter.createFromResource(this, R.array.typeFields,android.R.layout.simple_spinner_item);
        ArrayAdapter sizeAdapter=ArrayAdapter.createFromResource(this, R.array.sizeFields,android.R.layout.simple_spinner_item);
        spinner1.setAdapter(typeAdapter);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setAdapter(sizeAdapter);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setAdapter(typeAdapter);
        spinner3.setOnItemSelectedListener(this);
        spinner4.setAdapter(sizeAdapter);
        spinner4.setOnItemSelectedListener(this);
        spinner5.setAdapter(typeAdapter);
        spinner5.setOnItemSelectedListener(this);
        spinner6.setAdapter(sizeAdapter);
        spinner6.setOnItemSelectedListener(this);
        spinner7.setAdapter(typeAdapter);
        spinner7.setOnItemSelectedListener(this);
        spinner8.setAdapter(sizeAdapter);
        spinner8.setOnItemSelectedListener(this);
        spinner9.setAdapter(typeAdapter);
        spinner9.setOnItemSelectedListener(this);
        spinner10.setAdapter(sizeAdapter);
        spinner10.setOnItemSelectedListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        TextView myText = (TextView) view;
//        Toast.makeText(this, "You Selected "+myText.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
