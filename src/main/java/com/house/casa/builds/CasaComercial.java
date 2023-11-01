package com.house.casa.builds;

import com.house.casa.entity.Casa;

public class CasaComercial extends CasaBuilder implements CasaBuilderInterface {

    public CasaComercial() {
        this.casa = new Casa();
        this.casa.setEhComercial(true);
    }

    @Override
    public Casa getResult() {
        return null;
    }
}
