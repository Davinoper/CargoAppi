package com.br.cargoapp.cargoapp.model.dto.pessoa;

import com.br.cargoapp.cargoapp.model.Endereco;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
public class CreatePessoaDto {
    private String telefone;
    private String email;
    private String nome;
    private boolean isRemetente;
    private Endereco endereco;
    private boolean pessoaFisica;
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private String cpf;
    private String rg;
}
