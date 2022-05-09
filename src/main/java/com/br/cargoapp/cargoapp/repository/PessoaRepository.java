package com.br.cargoapp.cargoapp.repository;

import com.br.cargoapp.cargoapp.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Repeatable;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
}
