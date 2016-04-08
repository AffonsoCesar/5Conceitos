package com.example.affonso.cincoconceitos;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    String []lista = new String[] {"View","TextView","EditText", "Button", "CheckBox", "Toggle  Button"};
    ArrayAdapter<?> adapter;
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<Object>(this, android.R.layout.simple_list_item_1, lista);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView txt = (TextView) view;
                txt.setTextColor(Color.GRAY);


                if (position == 0) {
                    Fragment f1 = new Fragment01();
                    fm.beginTransaction().replace(R.id.ladodireito, f1).commit();
                } else if (position == 1) {
                    Fragment f2 = new Fragment02();
                    fm.beginTransaction().replace(R.id.ladodireito, f2).commit();
                } else if (position == 2) {
                    Fragment f3 = new Fragment03();
                    fm.beginTransaction().replace(R.id.ladodireito, f3).commit();
                } else if (position == 3) {
                    Fragment f4 = new Fragment04();
                    fm.beginTransaction().replace(R.id.ladodireito, f4).commit();
                } else if (position == 4){
                    Fragment f5 = new Fragment05();
                    fm.beginTransaction().replace(R.id.ladodireito, f5).commit();
                } else {
                    Sobre f6 = new Sobre();
                    fm.beginTransaction().replace(R.id.ladodireito, f6).commit();
                }
            }
        });

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setIcon(R.drawable.ic_launcher);

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.action_sobre){
            Toast.makeText(this, "Projeto Final do Curso - Google Study Jams 2016 - Android for Beginners", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
