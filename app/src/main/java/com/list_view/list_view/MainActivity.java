package com.list_view.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView deptList;
    ArrayAdapter<String> deptName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deptList = (ListView) findViewById(R.id.deptList1);
        deptName = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1);

        deptName.add("CSE");
        deptName.add("IT");
        deptName.add("CIVIL");
        deptName.add("MECH");
        deptName.add("EEE");
        deptName.add("ECE");
        deptName.add("MBA");

        deptList.setAdapter(deptName);
        deptList.setOnItemClickListener(this);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String temp = deptName.getItem(position);
        Toast.makeText(this , "You Selected " + temp + " Department", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(MainActivity.this , Activity_Section.class));
    }
}
