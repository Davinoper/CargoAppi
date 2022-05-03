package com.br.cargoapp.cargoapp.repository;

import com.br.cargoapp.cargoapp.model.Operacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperacaoRepository extends JpaRepository<Operacao,Long> {
}
