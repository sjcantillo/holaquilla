package com.example.silviocantillo.holaquilla.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.silviocantillo.holaquilla.R;

/**
 * Created by silvio.cantillo on 06/07/2017.
 */

public class FragmentoTarjetas extends Fragment {

    public FragmentoTarjetas() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmento_tarjetas, container, false);
    }


}
