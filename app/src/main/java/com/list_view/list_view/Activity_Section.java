package com.list_view.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Activity_Section extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView sectionList;
    ArrayAdapter<String> section;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__section);

        sectionList = (ListView) findViewById(R.id.listSection);
        section = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        section.add("A");
        section.add("B");

        sectionList.setAdapter(section);
        sectionList.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String temp = section.getItem(position);
        Toast.makeText(getApplicationContext(),"You Selected "+ temp  + " section ",Toast.LENGTH_SHORT).show();
    }
}
