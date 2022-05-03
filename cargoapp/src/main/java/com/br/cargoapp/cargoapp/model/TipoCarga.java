package com.br.cargoapp.cargoapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum TipoCarga {
    PERECIVEL(1, "Perecível"),
    NAOPERECIVEL(2, "Não perecível"),
    FRAGIL(3, "Frágil"),
    MEDICAMENTO(4, "Medicamento"),
    QUIMICO(5, "Químico"),
    MILITAR(6, "Militar");

    private int id;
    private String label;


    public static TipoCarga returTipo(int id) {
        TipoCarga[] lista = TipoCarga.values();
        for (TipoCarga tipo : lista) {
            if (tipo.getId() == id) {
                return tipo;
            }
        }
        return null;
    }




}
