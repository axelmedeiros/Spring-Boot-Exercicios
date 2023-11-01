package com.house.casa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CasaDTO {
    private String nomeProprietario;

    private Float area;

    private Integer numQuartos;

    private Integer numero;

    private String logadouro;

    private Boolean ehComercial;

}