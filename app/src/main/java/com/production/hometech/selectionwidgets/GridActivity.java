package com.production.hometech.selectionwidgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class GridActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private TextView tv_selectiion;
    private GridView gridView;
    private static final String[] items = {"Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye", "Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye", "Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye", "Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye"};
    private static final ArrayList<String> itemsList = new ArrayList<String>(Arrays.asList(items));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        tv_selectiion = (TextView) findViewById(R.id.tv_selection);
        gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(new ArrayAdapter<String>(this, R.layout.grid_cell, items));
        gridView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        tv_selectiion.setText(items[i]);

    }
}
