package com.br.cargoapp.cargoapp.repository;

import com.br.cargoapp.cargoapp.model.Carga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargaRepository extends JpaRepository<Carga,Long> {

}
