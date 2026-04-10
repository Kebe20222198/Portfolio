package com.portfolio.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class ProfilFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profil, container, false);

        view.findViewById(R.id.btnQRCode).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), QRCodeActivity.class)));

        view.findViewById(R.id.btnRDV).setOnClickListener(v ->
                startActivity(new Intent(getActivity(), RendezVousActivity.class)));

        return view;
    }
}