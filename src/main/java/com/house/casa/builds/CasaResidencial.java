package com.house.casa.builds;

import com.house.casa.entity.Casa;

public class CasaResidencial extends CasaBuilder implements CasaBuilderInterface{

    public CasaResidencial() {
        this.casa = new Casa();
        this.casa.setEhComercial(false);
    }

    @Override
    public Casa getResult() {
        return this.casa;
    }
}
