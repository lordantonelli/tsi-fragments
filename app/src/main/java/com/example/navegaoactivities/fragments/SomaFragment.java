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

}