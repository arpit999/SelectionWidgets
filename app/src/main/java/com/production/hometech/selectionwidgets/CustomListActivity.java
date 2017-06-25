package com.production.hometech.selectionwidgets;

import android.app.ListActivity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CustomListActivity extends ListActivity  {

    private TextView tv_selection;
    private ListView listView;
    private static final String[] items = {"Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye", "Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye", "Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye", "Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        listView = (ListView) findViewById(android.R.id.list);
        tv_selection = (TextView) findViewById(R.id.tv_selection);

        setListAdapter(new CustomAdapter());


    }

    private class CustomAdapter extends ArrayAdapter<String>{


        public CustomAdapter() {
            super(CustomListActivity.this, R.layout.custom_row,R.id.tv_title,items);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View view = super.getView(position,convertView,parent);

            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);

            if (items[position].length()>4) {
                imageView.setImageResource(R.drawable.ic_action_true);
            }
            else {
                imageView.setImageResource(R.drawable.ic_action_false);
            }

            TextView tv_size = (TextView) view.findViewById(R.id.tv_size);

            tv_size.setText(getString(R.string.size)+""+ items[position].length());
            return view;
        }
    }
}
