package com.br.cargoapp.cargoapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String telefone;
    private String email;
    private String nome;
    private boolean isRemetente;
    @OneToOne
    private Endereco endereco;
}
