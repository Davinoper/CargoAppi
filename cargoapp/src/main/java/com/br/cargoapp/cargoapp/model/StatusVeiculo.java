package com.br.cargoapp.cargoapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatusVeiculo {

    DISPONIVEL(1,"Disponível"),
    INDISPONIVEL(2,"Indisponível");

    private int id;
    private String label;

    public static StatusVeiculo returStatus(int id) {
        StatusVeiculo[] lista = StatusVeiculo.values();
        for (StatusVeiculo status : lista) {
            if (status.getId() == id) {
                return status;
            }
        }
        return null;
    }

}
