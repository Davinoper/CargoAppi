package com.br.cargoapp.cargoapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoOperacao {
    ENTRADA(1,"Entrada"),
    SAIDA(2,"Saída");

    private int id;
    private String label;

    public static TipoOperacao returnTipo(int id) {
        TipoOperacao[] lista = TipoOperacao.values();
        for (TipoOperacao tipo : lista) {
            if (tipo.getId() == id) {
                return tipo;
            }
        }
        return null;
    }
}
