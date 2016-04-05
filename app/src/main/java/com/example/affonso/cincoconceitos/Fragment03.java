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
public class Fragment03 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_03, container, false);
        TextView textView = (TextView)view.findViewById(R.id.textView2);
        textView.setText("EditText");

        return view;
    }
}
