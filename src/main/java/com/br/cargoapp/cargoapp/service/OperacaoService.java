package com.br.cargoapp.cargoapp.service;

import com.br.cargoapp.cargoapp.model.Operacao;
import com.br.cargoapp.cargoapp.model.TipoOperacao;
import com.br.cargoapp.cargoapp.model.dto.operacao.CreateOperacao;
import com.br.cargoapp.cargoapp.repository.OperacaoRepository;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Log4j2
@Service
public class OperacaoService {
    @Autowired
    OperacaoRepository operacaoRepository;
    @Autowired
    ModelMapper mapper;
    @Autowired
    CarroService carroService;
    @Autowired
    CargaService cargaService;
    @Autowired
    PessoaService pessoaService;


    public Operacao create(CreateOperacao createOperacao){
        log.info("OperacaoService.create - input {}",createOperacao);
        Operacao operacao = new Operacao();
        operacao.setCarga(cargaService.findById(createOperacao.getCarga()));
        operacao.setTipoOperacao(TipoOperacao.returnTipo(createOperacao.getTipoOperacao()));
        operacao.setCarro(carroService.findById(createOperacao.getCarro()));
        operacao.setDestinatario(pessoaService.findById(createOperacao.getDestinatario()));
        operacao.setRemetente(pessoaService.findById(createOperacao.getRemetente()));
        operacao.setHorario(LocalDateTime.now());
        Operacao operacaoSaved = operacaoRepository.save(operacao);
        log.info("OperacaoService.create - output {}",operacaoSaved);
        return operacao;

    }

    public List<Operacao> findAll(){
        log.info("OperacaoService.findAll");
        return operacaoRepository.findAll();
    }





}
