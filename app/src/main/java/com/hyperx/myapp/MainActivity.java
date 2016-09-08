package com.hyperx.myapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    String[] courseList = {"Database","Software","Eng","System Prog.","Intro to Com.","Eng. Math","Prog. Practices"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,courseList);
        setListAdapter(adapter);
    }
}
