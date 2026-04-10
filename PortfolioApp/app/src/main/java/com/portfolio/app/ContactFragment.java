package com.portfolio.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class ContactFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        view.findViewById(R.id.btnEnvoyer).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:mkebe2022@gmail.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contact depuis Portfolio");
            startActivity(Intent.createChooser(intent, "Envoyer email"));
        });
        view.findViewById(R.id.tvPhone).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+221771234567"));
            startActivity(intent);
        });
        view.findViewById(R.id.tvFacebook).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com/mohamed.kebe.765663"));
            startActivity(intent);
        });
        return view;
    }
}package com.portfolio.app;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
public class ContactFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        view.findViewById(R.id.btnEnvoyer).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:mkebe2022@gmail.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Contact depuis Portfolio");
            startActivity(Intent.createChooser(intent, "Envoyer email"));
        });
        view.findViewById(R.id.tvPhone).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+221771234567"));
            startActivity(intent);
        });
        view.findViewById(R.id.tvFacebook).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com/mohamed.kebe.765663"));
            startActivity(intent);
        });
        return view;
    }
}
