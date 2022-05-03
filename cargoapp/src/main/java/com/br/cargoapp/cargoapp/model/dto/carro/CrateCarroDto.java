package com.br.cargoapp.cargoapp.model.dto.carro;

import com.br.cargoapp.cargoapp.model.StatusVeiculo;
import lombok.Data;

@Data
public class CrateCarroDto {
    private String modelo;
    private String marca;
    private String ano;
    private double alturaBau;
    private double larguraBau;
    private double comprimentoBau;
    private double pesoMaxBau;
    private int statusVeiculo;





}
