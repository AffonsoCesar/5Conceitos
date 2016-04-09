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

    private ListView listView; //Criação de um listView do Tipo ListView.
    String []lista = new String[] {"View","TextView","EditText", "Button", "CheckBox", "Toggle  Button"}; //Criação da lista que será carregada no ListView
    ArrayAdapter<?> adapter; //ArrayAdapter para adaptação da lista no ListView
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager(); //Suporte para o uso de fragment


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<Object>(this, android.R.layout.simple_list_item_1, lista); //Dando um new no adapter para preencher a listView
        listView = (ListView)findViewById(R.id.listView); // associando o ListView ao componente da tela no main XML.
        listView.setAdapter(adapter); //Setando a ListView com o adapter.

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) { //Controle de clique da ListView e associação dos fragments para a ListView
                TextView txt = (TextView) view;
                txt.setTextColor(Color.GRAY);


                if (position == 0) { //Condição para os cliques
                    Fragment f1 = new Fragment01();
                    fm.beginTransaction().replace(R.id.ladodireito, f1).commit(); //inflando o fragment na tela.
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

        ActionBar actionBar = getSupportActionBar(); //Edição da ActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setIcon(R.drawable.ic_launcher);

        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //Criação do Menu
        getMenuInflater().inflate(R.menu.menu_main, menu); //Infalndo o Menu
        return super.onCreateOptionsMenu(menu); //Retorno do Menu
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //Funcionalidade do clique no item do menu

        int id = item.getItemId();
        if(id == R.id.action_sobre){ //condição do clique do menu
            Toast.makeText(this, "Projeto Final do Curso - Google Study Jams 2016 - Android for Beginners", Toast.LENGTH_LONG).show(); //Mensagem que aparece ao clicar sobre o menu "SOBRE"
        }

        return super.onOptionsItemSelected(item);
    }
}
