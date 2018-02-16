package com.app.ddd.core.contractualisation;

import com.app.ddd.core.contractualisation.role.Candidat;
import com.app.ddd.core.model.ValueObject;

import java.util.Date;

/**
 * Created by kokoghlanian on 16/02/2018.
 */
public class Contrat extends ValueObject{

    private Date dateArrivee;
    private Boolean ContratAccepte;
    private Date dateSignature;
    private Double salaire;
    private Candidat candidat;

    public Candidat getCandidat() {
        return candidat;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public Boolean getContratAccepte() {
        return ContratAccepte;
    }

    public Date getDateSignature() {
        return dateSignature;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setContratAccepte(Boolean contratAccepte) {
        ContratAccepte = contratAccepte;
    }

    public Contrat(Date dateArrivee,Date dateSignature, Double salaire,Candidat candidat) {
        this.dateArrivee = dateArrivee;
        this.dateSignature = dateSignature;
        this.salaire = salaire;
        this.candidat = candidat;
        this.ContratAccepte = false;
    }

    @Override
    public int compareTo(Object o){
        return 0;
    }
}
