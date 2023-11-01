package com.house.casa.builds;

import com.house.casa.entity.Casa;

public abstract class CasaBuilder implements CasaBuilderInterface {
    protected Casa casa;

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
}
