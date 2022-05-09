package com.br.cargoapp.cargoapp.controller;

import com.br.cargoapp.cargoapp.model.Carro;
import com.br.cargoapp.cargoapp.model.dto.carga.CreateCargaDto;
import com.br.cargoapp.cargoapp.model.dto.carro.CrateCarroDto;
import com.br.cargoapp.cargoapp.service.CarroService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/api/carro")
public class CarroController {

    @Autowired CarroService carroService;

    @PostMapping
    public ResponseEntity<Carro> create(@RequestBody CrateCarroDto createCarroDto){
        log.info("CarroController.create - input {}",createCarroDto);
        Carro carro = carroService.create(createCarroDto);
        log.info("CarroController.create - output {}",carro);
        return new ResponseEntity<>(carro, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Carro>> findAll(){
        log.info("CarroController.findAll");
        List<Carro> lista = carroService.findAll();
        return new ResponseEntity<>(lista,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> findById(@PathVariable(value="id") Long id){
        log.info("CarroController.findAll");
        Carro carro = carroService.findById(id);
        return new ResponseEntity<>(carro,HttpStatus.OK);
    }

}
