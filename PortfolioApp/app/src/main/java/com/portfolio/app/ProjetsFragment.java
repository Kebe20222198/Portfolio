package com.portfolio.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class ProjetsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_projets, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_projets);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Projet> projets = Arrays.asList(
                new Projet("Application Portfolio", "Application Android de portfolio personnel", "Java • Android"),
                new Projet("Projet Data Science", "Analyse de données avec Python", "Python • Pandas"),
                new Projet("App Mobile Flutter", "Application cross-platform", "Flutter • Dart")
        );

        ProjetAdapter adapter = new ProjetAdapter(projets);
        recyclerView.setAdapter(adapter);

        return view;
    }
}package com.portfolio.app;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ProjetsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_projets, container, false);
        RecyclerView recycler = view.findViewById(R.id.recyclerProjets);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Projet> projets = new ArrayList<>();

        // --- PROJETS PHARES & ACTUELS ---
        
        // Wonkhaï (Ton projet majeur)
        projets.add(new Projet(
            "Wonkhaï Super-App", 
            "Plateforme multiservices (super-app) avec backend distribué.", 
            "Elixir • Flutter • Phoenix", 
            Color.parseColor("#D32F2F")
        ));

        // Projet React Native
        projets.add(new Projet(
            "Application Cross-Platform", 
            "Développement d'une interface mobile fluide et réactive avec gestion d'état complexe.", 
            "React Native • Redux • Firebase", 
            Color.parseColor("#61DAFB") // Couleur caractéristique de React
        ));

        // --- DATA SCIENCE (INSEA) ---
        projets.add(new Projet(
            "Knowledge Discovery", 
            "Extraction de patterns et text mining sur des jeux de données massifs.", 
            "Python • NLP • Scikit-learn", 
            Color.parseColor("#388E3C")
        ));

        // --- AUTRES RÉALISATIONS ---
        projets.add(new Projet("Portfolio App", "Cette application même, vitrine de mes compétences.", "Java • Android SDK", Color.parseColor("#1565C0")));
        projets.add(new Projet("API REST Seguris", "Système sécurisé avec authentification JWT.", "Node.js • JWT • MongoDB", Color.parseColor("#0D47A1")));
        projets.add(new Projet("Expert System", "Moteur d'inférence logique développé en Prolog.", "Prolog • IA", Color.parseColor("#1976D2")));

        recycler.setAdapter(new ProjetAdapter(projets));
        return view;
    }
}
