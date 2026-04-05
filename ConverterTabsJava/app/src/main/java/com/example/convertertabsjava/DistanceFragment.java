package com.example.convertertabsjava;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import android.widget.EditText;
import android.widget.TextView;

public class DistanceFragment extends Fragment {

    private EditText input;
    private TextView result;
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_distance, container, false);

        input = view.findViewById(R.id.inputKm);
        result = view.findViewById(R.id.resultMiles);
        btn = view.findViewById(R.id.btnConvertKm);

        btn.setOnClickListener(v -> {
            if (TextUtils.isEmpty(input.getText().toString())) {
                result.setText("Veuillez entrer une valeur");
                return;
            }

            double km = Double.parseDouble(input.getText().toString());
            double miles = km * 0.621;

            result.setText(miles + " miles");
        });

        return view;
    }
}