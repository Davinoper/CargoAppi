package com.br.cargoapp.cargoapp.controller;

import com.br.cargoapp.cargoapp.model.Carga;
import com.br.cargoapp.cargoapp.model.dto.carga.CreateCargaDto;
import com.br.cargoapp.cargoapp.service.CargaService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("api/carga")
public class CargaController {

    @Autowired CargaService cargaService;


    @PostMapping
    public ResponseEntity<Carga> create(@RequestBody CreateCargaDto createCargaDto){
        log.info("CargaController.create - input {}",createCargaDto);
        Carga retorno = cargaService.create(createCargaDto);
        log.info("CargaController.create - output {}",retorno);
        return new ResponseEntity<>(retorno, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Carga>> findAll(){
        log.info("CargaController.findAll ");
        List<Carga> retorno = cargaService.findAll();
        return new ResponseEntity<>(retorno,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carga> findAll(@PathVariable(value="id") Long id){
        log.info("CargaController.findAll ");
        Carga retorno = cargaService.findById(id);
        return new ResponseEntity<>(retorno,HttpStatus.OK);
    }




}
