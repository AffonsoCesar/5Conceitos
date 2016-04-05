package com.example.affonso.cincoconceitos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * Created by Affonso on 04/04/2016.
 */
public class Fragment01 extends Fragment {

    private TextView textView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_01, container, false);
        textView = (TextView)view.findViewById(R.id.textView);
        textView.setText("O que é uma view?"+"\n"+"\n         Uma View é similar a um JComponent, " +
                "é um item que pode ser adicionado a tela onde o " +
                "usuario poderá ver e interagir com ele."+"\n         Todas as tags de Views no Android tem " +
                "suporte ao atributo id, é com ele que conseguimos acessar nossa tela após inflá-la.\n" +
                "As declarações de novos ids devem começar com ‘@+id/’ e depois disso atribuimos o valor que " +
                "vai ser o id."+"\n         Abaixo veremos alguns componentes que estão incluidos em uma View, eles podem " +
                "ser um: TextView, EditText, Button ou CheckBox!"+"\n"+"\n         Clique sobre os menus ao lado para saber " +
                "mais informações. Boa Leitura!!!");
        return view;
    }
}

