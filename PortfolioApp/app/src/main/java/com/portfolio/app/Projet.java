package com.portfolio.app;

public class Projet {
    private String titre;
    private String description;
    private String technologies;

    public Projet(String titre, String description, String technologies) {
        this.titre = titre;
        this.description = description;
        this.technologies = technologies;
    }

    public String getTitre() { return titre; }
    public String getDescription() { return description; }
    public String getTechnologies() { return technologies; }
}