package com.production.hometech.selectionwidgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class AutoCompleteActivity extends AppCompatActivity implements TextWatcher, AdapterView.OnItemClickListener {

    private TextView tv_selection;
    private AutoCompleteTextView autoCompleteTextView;
    private static final String[] items = {"Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye", "Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye", "Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye", "Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        tv_selection = (TextView) findViewById(R.id.tv_selection);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        autoCompleteTextView.addTextChangedListener(this);
autoCompleteTextView.setOnItemClickListener(this);

        autoCompleteTextView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items));

    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {



    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        tv_selection.setText(autoCompleteTextView.getText());
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        tv_selection.setText(autoCompleteTextView.getText());
    }
}
