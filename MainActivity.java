package com.example.listview;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> list = new ArrayList<String>();

    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        list.add("Rekayasa Perangkat Lunak");
        list.add("Teknik Komputer dan Jaringan");
        list.add("Multimedia");
        list.add("Audio Video");
        list.add("Teknik Otomasi Industri");
        list.add("Teknik Instalasi Tenaga Listrik");

    }
}