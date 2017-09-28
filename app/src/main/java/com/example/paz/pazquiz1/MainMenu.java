package com.example.paz.pazquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity {
    String[] name;
    int[] logos;
    ListView version_list;
    CustomAdapter adapter;
    List<Names> listNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void callFirst(View view) {
        Intent intent = new Intent(this,First.class);
        String Name = "Oreo";
        String version = "8.0";
        String api = "26";
        String Date = "August 21, 2017";
        intent.putExtra("name",Name);
        intent.putExtra("version",version);
        intent.putExtra("api",api);
        intent.putExtra("date",Date);
        startActivity(intent);
    }
    public void callsecond(View view) {
        Intent intent = new Intent(this,Second.class);
        String Name = "Nougat";
        String version = "7.0 – 7.1.2";
        String api = "24 – 25";
        String Date = "August 22, 2016";
        intent.putExtra("name",Name);
        intent.putExtra("version",version);
        intent.putExtra("api",api);
        intent.putExtra("date",Date);
        startActivity(intent);
    }
    public void callthird(View view) {
        Intent intent = new Intent(this,Third.class);
        String Name = "Marshmallow";
        String version = "6.0 – 6.0.1";
        String api = "23";
        String Date = "October 5, 2015";
        intent.putExtra("name",Name);
        intent.putExtra("version",version);
        intent.putExtra("api",api);
        intent.putExtra("date",Date);
        startActivity(intent);
    }

    public void menu(View view) {
        Intent intent = new Intent(this,MainMenu.class);
        startActivity(intent);
    }

}
