package com.br.cargoapp.cargoapp.model.dto.carga;

import lombok.Data;



@Data
public class CreateCargaDto {
    private double altura;
    private double largura;
    private double comprimento;
    private double peso;
    private boolean inventario;
    private int tipoCarga;
}
