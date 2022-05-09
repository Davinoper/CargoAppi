package com.br.cargoapp.cargoapp.repository;

import com.br.cargoapp.cargoapp.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro,Long> {
}
