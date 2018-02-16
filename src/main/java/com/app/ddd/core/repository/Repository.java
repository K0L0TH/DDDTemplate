package com.app.ddd.core.repository;

import com.app.ddd.core.contractualisation.Contrat;
import com.app.ddd.core.contractualisation.ContratAggregate;
import com.app.ddd.core.sourcing.CTO;
import com.app.ddd.core.sourcing.Candidat;
import com.app.ddd.core.sourcing.ChargeRecrutement;
import com.app.ddd.core.sourcing.ConsultantRecruteur;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bench on 16/02/2018.
 */
public class Repository {

    private List<Candidat> candidateList;
    private List<ChargeRecrutement> cRList;
    private List<ConsultantRecruteur> recruteurList;
    private List<ContratAggregate> contrats;
    private CTO cto;

    public Repository(CTO cto){
        this.candidateList = new ArrayList<Candidat>();
        this.cRList = new ArrayList<ChargeRecrutement>();
        this.recruteurList = new ArrayList<ConsultantRecruteur>();
        this.contrats = new ArrayList<ContratAggregate>();
        this.cto = cto;
    }

    public void addContrat(ContratAggregate contrat){
        this.contrats.add(contrat);
    }

    public void addCandidat(Candidat candidat){
        this.candidateList.add(candidat);
    }

    public void addCR(ChargeRecrutement CR){
        this.cRList.add(CR);
    }

    public void addRecruteur(ConsultantRecruteur recruteur){
        this.recruteurList.add(recruteur);
    }

    public List<Candidat> getCandidateList() {
        return candidateList;
    }

    public void setCandidateList(List<Candidat> candidateList) {
        this.candidateList = candidateList;
    }

    public List<ChargeRecrutement> getcRList() {
        return cRList;
    }

    public void setcRList(List<ChargeRecrutement> cRList) {
        this.cRList = cRList;
    }

    public List<ConsultantRecruteur> getRecruteurList() {
        return recruteurList;
    }

    public void setRecruteurList(List<ConsultantRecruteur> recruteurList) {
        this.recruteurList = recruteurList;
    }

    public CTO getCto() {
        return cto;
    }

    public void setCto(CTO cto) {
        this.cto = cto;
    }

    public List<ContratAggregate> getContrats() {
        return contrats;
    }

    public void setContrats(List<ContratAggregate> contrats) {
        this.contrats = contrats;
    }
}
