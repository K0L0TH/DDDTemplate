package com.app.ddd.core.repository;

import com.app.ddd.core.contractualisation.contrat.ContratAggregat;
import com.app.ddd.core.planification.entretien.EntretienAgregat;
import com.app.ddd.core.sourcing.role.CTO;
import com.app.ddd.core.sourcing.role.Candidat;
import com.app.ddd.core.sourcing.role.ChargeRecrutement;
import com.app.ddd.core.sourcing.role.ConsultantRecruteur;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bench on 16/02/2018.
 */
public class Repository {

    private List<Candidat> candidateList;
    private List<ChargeRecrutement> cRList;
    private List<ConsultantRecruteur> recruteurList;
    private List<ContratAggregat> contrats;
    private List<EntretienAgregat> entretiens;
    private CTO cto;

    public Repository(CTO cto){
        this.candidateList = new ArrayList<Candidat>();
        this.cRList = new ArrayList<ChargeRecrutement>();
        this.recruteurList = new ArrayList<ConsultantRecruteur>();
        this.contrats = new ArrayList<ContratAggregat>();
        this.entretiens = new ArrayList<EntretienAgregat>();
        this.cto = cto;
    }

    public void addContrat(ContratAggregat contrat){
        this.contrats.add(contrat);
    }

    public void addEntretiens(EntretienAgregat entretiens){
        this.entretiens.add(entretiens);
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

    public List<ContratAggregat> getContrats() {
        return contrats;
    }

    public void setContrats(List<ContratAggregat> contrats) {
        this.contrats = contrats;
    }

    public List<EntretienAgregat> getEntretiens() {
        return entretiens;
    }

    public void setEntretiens(List<EntretienAgregat> entretiens) {
        this.entretiens = entretiens;
    }
}
