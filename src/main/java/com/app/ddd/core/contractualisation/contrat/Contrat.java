package com.app.ddd.core.contractualisation.contrat;

import com.app.ddd.core.contractualisation.role.Candidat;
import com.app.ddd.core.model.Entity;
import org.joda.time.DateTime;



public class Contrat extends Entity{

    private DateTime dateArrivee;
    private Boolean ContratAccepte;
    private DateTime dateSignature;
    private Double salaire;
    private Candidat candidat;

    public Candidat getCandidat() {
        return candidat;
    }

    public DateTime getDateArrivee() {
        return dateArrivee;
    }

    public Boolean getContratAccepte() {
        return ContratAccepte;
    }

    public DateTime getDateSignature() {
        return dateSignature;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setContratAccepte(Boolean contratAccepte) {
        ContratAccepte = contratAccepte;
    }

    public Contrat(DateTime dateArrivee,DateTime dateSignature, Double salaire,Candidat candidat) {
        this.dateArrivee = dateArrivee;
        this.dateSignature = dateSignature;
        this.salaire = salaire;
        this.candidat = candidat;
        this.ContratAccepte = false;
    }
}
