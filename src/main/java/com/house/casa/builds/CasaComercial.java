package com.house.casa.builds;

import com.house.casa.entity.Casa;

public class CasaComercial implements CasaBuilderInterface {
    private Casa casa;

    public CasaComercial() {
        this.casa = new Casa();
        this.casa.setEhComercial(true);
    }

    @Override
    public void setInformacoesRegistro(String nomeProprietario, float area, Integer numero, String logadouro) {
        this.casa.setNomeProprietario(nomeProprietario);
        this.casa.setArea(area);
        this.casa.setNumero(numero);
        this.casa.setLogadouro(logadouro);
    }

    @Override
    public void setInformacoesConstrucao(Integer numQuartos) {
        this.casa.setNumQuartos(numQuartos);
    }

    @Override
    public Casa getResult() {
        return null;
    }
}
