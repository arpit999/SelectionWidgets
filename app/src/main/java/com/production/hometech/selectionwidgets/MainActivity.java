package com.production.hometech.selectionwidgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void SimpleListClickListener(View view) {

        startActivity(new Intent(this, SimpleListActivity.class));

    }

    public void SpinnerClickListener(View view) {

        startActivity(new Intent(this, SpinnerActivity.class));
    }

    public void GridClickListener(View view) {

        startActivity(new Intent(this, GridActivity.class));
    }

    public void AutocompleteClickListener(View view) {

        startActivity(new Intent(this,AutoCompleteActivity.class));
    }

    public void CustomListClickListener(View view) {

        startActivity(new Intent(this,CustomListActivity.class));
    }
}
