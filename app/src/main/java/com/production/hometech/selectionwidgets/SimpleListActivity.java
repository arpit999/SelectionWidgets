package com.production.hometech.selectionwidgets;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleListActivity extends ListActivity {

    private static final String[] items = {"Apple", "Banana", "Cat", "Dog", "Elephant", "Fox", "Goat", "Horse", "Eye"};
    private TextView tv_selection;
    private static final ArrayList<String> itemsList = new ArrayList<String>(Arrays.asList(items));
    private ArrayList<String> selectedList = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        listView = (ListView) findViewById(android.R.id.list);

        tv_selection = (TextView) findViewById(R.id.tv_selection);


//        For array
//        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));


//        For ArrayList with ArrayAdapter
//        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemsList));

//        For single choice  NOTE : change attribute in xml file according to layout file  (android:choiceMode="singleChoice")
//        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, itemsList));

//        For multichoce mode  NOTE : change attribute in xml file according to layout file (android:choiceMode="multipleChoice")
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, itemsList));


    }


    @Override
    protected void onListItemClick(ListView l, View view, int position, long id) {

        tv_selection.setText(items[position]);

        listView.getCheckedItemCount();
        listView.getCheckedItemPosition();

        int len = listView.getCount();
        SparseBooleanArray checked = listView.getCheckedItemPositions();
        selectedList.clear();
        selectedList = new ArrayList<>();
        for (int i = 0; i < len; i++)
            if (checked.get(i)) {
                String item = itemsList.get(i);
                selectedList.add(item);
  /* do whatever you want with the checked item */
            }
        tv_selection.setText(selectedList.toString());


    }
}
