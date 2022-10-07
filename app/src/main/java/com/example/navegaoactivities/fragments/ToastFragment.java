package com.example.navegaoactivities.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ToastFragment extends Fragment {

    // Atributos representando os objetos da interface
    private TextView txtMensagem;
    private Button btnOK;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Criando o desenho da interface deste fragment (variável view),
        // inflando o layout XML que criamos para este fragment.
        View view = inflater.inflate(R.layout.fragment_toast, container, false);
        // Ligando os atributos aos objetos gráficos
        txtMensagem = view.findViewById(R.id.txtMensagem);
        btnOK = view.findViewById(R.id.btnOK);
        // Definindo o escutador do botao OK
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), txtMensagem.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
