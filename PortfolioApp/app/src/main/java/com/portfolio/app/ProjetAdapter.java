package com.portfolio.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ProjetAdapter extends RecyclerView.Adapter<ProjetAdapter.ProjetViewHolder> {
    private List<Projet> projets;

    public ProjetAdapter(List<Projet> projets) {
        this.projets = projets;
    }

    @NonNull
    @Override
    public ProjetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_projet, parent, false);
        return new ProjetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjetViewHolder holder, int position) {
        Projet projet = projets.get(position);
        holder.tvTitre.setText(projet.getTitre());
        holder.tvDescription.setText(projet.getDescription());
        holder.tvTechnologies.setText(projet.getTechnologies());
    }

    @Override
    public int getItemCount() {
        return projets.size();
    }

    static class ProjetViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitre, tvDescription, tvTechnologies;

        ProjetViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitre = itemView.findViewById(R.id.tv_titre_projet);
            tvDescription = itemView.findViewById(R.id.tv_desc_projet);
            tvTechnologies = itemView.findViewById(R.id.tv_tech_projet);
        }
    }
}