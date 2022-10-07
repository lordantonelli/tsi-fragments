package com.example.navegaoactivities.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class SomaFragment extends Fragment {

    // Atributos representando os objetos da interface
    private TextView txtValor1;
    private TextView txtValor2;
    private Button btnSomar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflando o layout da interface deste fragment
        View view = inflater.inflate(R.layout.fragment_soma, container, false);
        // Ligando os atributos aos objetos gráficos
        txtValor1 = view.findViewById(R.id.txtValor1);
        txtValor2 = view.findViewById(R.id.txtValor2);
        btnSomar = view.findViewById(R.id.btnSomar);
        // Definindo o escutador do botao SOMA
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(txtValor1.getText().toString());
                int valor2 = Integer.parseInt(txtValor2.getText().toString());
                Toast.makeText(getContext(), "O resultado é " + (valor1+valor2), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}