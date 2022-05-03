package com.br.cargoapp.cargoapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
}
