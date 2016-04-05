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
public class Sobre extends Fragment{

    private TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sobre, container, false);
        textView = (TextView)view.findViewById(R.id.textView6);
        textView.setText("Sobre");
        return view;
    }
}



