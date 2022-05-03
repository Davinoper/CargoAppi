package com.br.cargoapp.cargoapp.repository;

import com.br.cargoapp.cargoapp.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Enderecorepository extends JpaRepository<Endereco,Long> {
}
