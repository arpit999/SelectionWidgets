package com.production.hometech.selectionwidgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private TextView tv_selectiion;
    private Spinner spinner;
    private static final String[] items = {"Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye"};
    private static final ArrayList<String> itemsList = new ArrayList<String>(Arrays.asList(items));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        tv_selectiion = (TextView) findViewById(R.id.tv_selection);
        spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        tv_selectiion.setText(items[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        tv_selectiion.setText("Not selected");
    }
}
