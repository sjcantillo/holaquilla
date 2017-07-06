package com.example.silviocantillo.holaquilla.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.silviocantillo.holaquilla.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentoPerfil.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentoPerfil#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentoPerfil extends Fragment {
    public FragmentoPerfil() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmento_perfil, container, false);
    }
}
