package com.br.cargoapp.cargoapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PessoaFisica extends Pessoa{
    private String cpf;
    private String rg;
}
