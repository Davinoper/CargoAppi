package com.br.cargoapp.cargoapp.controller;

import com.br.cargoapp.cargoapp.model.Pessoa;
import com.br.cargoapp.cargoapp.model.dto.pessoa.CreatePessoaDto;
import com.br.cargoapp.cargoapp.service.PessoaService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<Pessoa> create(@RequestBody CreatePessoaDto createPessoaDto){
        log.info("PessoaController.create - input {}",createPessoaDto);
        Pessoa pessoa =  pessoaService.create(createPessoaDto);
        log.info("PessoaController.create - output {}",pessoa);
        return new ResponseEntity<>(pessoa, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll(){
        log.info("PessoaController.findAll");
        List<Pessoa> lista = pessoaService.findAll();
        return new ResponseEntity<>(lista,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> findById(@PathVariable(value="id") Long id){
        log.info("PessoaController.findById - input {}",id );
        Pessoa pessoa = pessoaService.findById(id);
        log.info("PessoaController.findById - output {}",pessoa);
        return new ResponseEntity<>(pessoa,HttpStatus.OK);
    }



}
