package com.br.cargoapp.cargoapp.controller;

import com.br.cargoapp.cargoapp.model.Operacao;
import com.br.cargoapp.cargoapp.model.dto.operacao.CreateOperacao;
import com.br.cargoapp.cargoapp.service.OperacaoService;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/api/operacao")
public class OperacaoController {

    @Autowired
    OperacaoService operacaoService;

    @PostMapping
    public ResponseEntity<Operacao> create(@RequestBody CreateOperacao createOperacao){
        log.info("OperacaoController.create - input {}",createOperacao);
        Operacao operacao = operacaoService.create(createOperacao);
        log.info("OperacaoController.create - output {}",operacao);
        return new ResponseEntity<>(operacao, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<Operacao>> findAll(){
        log.info("OperacaoController.findAll");
        List<Operacao> lista = operacaoService.findAll();
        return new ResponseEntity<>(lista,HttpStatus.OK);
    }
}
