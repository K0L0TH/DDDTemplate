package com.app.ddd.core.contractualisation.role;

import com.app.ddd.core.model.ValueObject;

/**
 * Created by kokoghlanian on 16/02/2018.
 */
public class Daf extends ValueObject{

    private Cto cto;
    private Dg dg;
    private Rh rh;

    public Cto getCto() {
        return cto;
    }

    public Dg getDg() {
        return dg;
    }

    public Rh getRh() {
        return rh;
    }

    public Daf(Cto cto, Dg dg, Rh rh) {
        this.cto = cto;
        this.dg = dg;
        this.rh = rh;
    }


    /*public Contrat creerContrat(Double salaire,){
        return new Contrat(, , ,);
    }*/

    @Override
    public int compareTo(Object o) {
        if(o instanceof Daf) {
            if(((Daf) o).cto == this.getCto()){
                if(((Daf) o).dg == this.getDg()){
                    if(((Daf) o).rh == this.rh){
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}
