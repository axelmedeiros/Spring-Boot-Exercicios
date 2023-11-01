package com.house.casa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // criar um construtor Casa sem paramétros
@AllArgsConstructor // criar um construtor Casa com cada parametro
public class Casa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String nomeProprietario;

    private Float area;

    private Integer numQuartos;

    private Integer numero;

    private String logadouro;

    private Boolean ehComercial;

}
