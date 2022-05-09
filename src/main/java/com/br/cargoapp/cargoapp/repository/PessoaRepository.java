package com.br.cargoapp.cargoapp.repository;


import com.br.cargoapp.cargoapp.model.Pessoa;
import com.br.cargoapp.cargoapp.model.PessoaFisica;
import com.br.cargoapp.cargoapp.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long> {

    @Query(value="SELECT * FROM pessoa p WHERE dtype = 'PessoaFisica'",nativeQuery = true)
    List<PessoaFisica> findAllPessoaFisica();

    @Query(value="SELECT * FROM pessoa p WHERE dtype = 'PessoaJuridica'",nativeQuery = true)
    List<PessoaJuridica> findAllPessoaJuridica();
}
