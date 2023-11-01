package com.house.casa.builds;

import com.house.casa.entity.Casa;

public interface CasaBuilderInterface {

    public void setInformacoesRegistro(String nomeProprietario, float area, Integer numero, String logadouro);

    public void setInformacoesConstrucao(Integer numQuartos);

    public Casa getResult();
}
