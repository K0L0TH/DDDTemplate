package com.app.ddd.core.planification.contrat;

import com.app.ddd.core.contractualisation.role.*;
import org.junit.Test;

/**
 * Created by kokoghlanian on 16/02/2018.
 */
public class contrat {


    @Test
    public void createContrat(){

        Cto cto = new Cto("cto", "cto");
        Rh rh = new Rh("rh", "rh");
        Dg dg = new Dg("dg","dg");
        Candidat c1 = new Candidat("c1", "c1");
        Daf daf = new Daf(cto,dg,rh);


    }
}
