package com.example.convertertabsjava;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;


public class TemperatureFragment extends Fragment {

    private EditText input;
    private TextView result;
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_temperature, container, false);

        input = view.findViewById(R.id.inputTemp);
        result = view.findViewById(R.id.resultTemp);
        btn = view.findViewById(R.id.btnConvertTemp);

        btn.setOnClickListener(v -> {
            if (TextUtils.isEmpty(input.getText().toString())) {
                result.setText("Veuillez entrer une valeur");
                return;
            }

            double c = Double.parseDouble(input.getText().toString());
            double f = (c * 9/5) + 32;

            result.setText(f + " °F");
        });

        return view;
    }
}