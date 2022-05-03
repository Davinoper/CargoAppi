package com.br.cargoapp.cargoapp.service;

import com.br.cargoapp.cargoapp.model.Carro;
import com.br.cargoapp.cargoapp.model.StatusVeiculo;
import com.br.cargoapp.cargoapp.model.dto.carga.CreateCargaDto;
import com.br.cargoapp.cargoapp.model.dto.carro.CrateCarroDto;
import com.br.cargoapp.cargoapp.repository.CarroRepository;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Log4j2
@Service
public class CarroService {

    @Autowired CarroRepository carroRepository;

    @Autowired ModelMapper mapper;

    @Transactional
    public Carro create(CrateCarroDto createCarroDto){
        log.info("CarroService.create - input {}", createCarroDto);
        Carro carro = mapper.map(createCarroDto,Carro.class);
        carro.setStatusVeiculo(StatusVeiculo.returStatus(1));
        Carro carroSaved = carroRepository.save(carro);
        log.info("CarroService.create - output {}",carroSaved);
        return carroSaved;

    }

    public List<Carro> findAll(){
        log.info("CarroService.findAll");
        return carroRepository.findAll();
    }


    public Carro findById(Long id){
        log.info("CarroService.findById");
        Carro carro = carroRepository.findById(id).orElseThrow();
        return carro;
    }



}
