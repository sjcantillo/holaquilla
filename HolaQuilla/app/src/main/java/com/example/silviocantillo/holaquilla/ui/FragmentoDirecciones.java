package com.example.silviocantillo.holaquilla.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.silviocantillo.holaquilla.R;

/**
 * Created by silvio.cantillo on 06/07/2017.
 */

public class FragmentoDirecciones extends Fragment {

    private LinearLayoutManager linearLayout;

    public FragmentoDirecciones() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_grupo_items, container, false);

        RecyclerView reciclador = (RecyclerView)view.findViewById(R.id.reciclador);
        linearLayout = new LinearLayoutManager(getActivity());
        reciclador.setLayoutManager(linearLayout);

        AdaptadorDirecciones adaptador = new AdaptadorDirecciones();
        reciclador.setAdapter(adaptador);
        reciclador.addItemDecoration(new DecoracionLineaDivisoria(getActivity()));

        return view;
    }


}
