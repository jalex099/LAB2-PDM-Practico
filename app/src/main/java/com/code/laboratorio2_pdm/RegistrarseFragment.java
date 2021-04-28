package com.code.laboratorio2_pdm;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RegistrarseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegistrarseFragment extends Fragment {

    public RegistrarseFragment() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static RegistrarseFragment newInstance(String param1, String param2) {
        RegistrarseFragment fragment = new RegistrarseFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registrarse, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnAtrasRegistrarse = (Button)view.findViewById(R.id.btnAtrasRegistrarse);
        Button btnRegistrarseSesion = (Button)view.findViewById(R.id.btnRegistrarseSesion);


        final NavController navController = Navigation.findNavController(view);

        btnAtrasRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.inicioFragment);
            }
        });

        btnRegistrarseSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Registrado", Toast.LENGTH_SHORT).show();
            }
        });

    }
}