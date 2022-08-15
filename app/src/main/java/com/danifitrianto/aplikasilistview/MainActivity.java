package com.danifitrianto.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView countriesList;
    TextView countryName;
    String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countriesList =(ListView)findViewById(R.id.countryList);
        countryName =(TextView)findViewById(R.id.itemCountry);
        listItem = getResources().getStringArray(R.array.countries);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        countriesList.setAdapter(adapter);

    }
}