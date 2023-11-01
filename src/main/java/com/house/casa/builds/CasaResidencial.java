package com.house.casa.builds;

import com.house.casa.entity.Casa;
import com.house.casa.repository.CasaRepository;

public class CasaResidencial implements CasaBuilderInterface{
    private Casa casa;

    public CasaResidencial() {
        this.casa = new Casa();
        this.casa.setEhComercial(false);
    }

    @Override
    public void setInformacoesRegistro(String nomeProprietario, float area,
                                       Integer numero, String logadouro) {
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
        return this.casa;
    }
}
