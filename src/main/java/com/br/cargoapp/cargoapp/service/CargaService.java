package com.br.cargoapp.cargoapp.service;

import com.br.cargoapp.cargoapp.model.Carga;
import com.br.cargoapp.cargoapp.model.TipoCarga;
import com.br.cargoapp.cargoapp.model.dto.carga.CreateCargaDto;
import com.br.cargoapp.cargoapp.repository.CargaRepository;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.xml.ws.http.HTTPException;
import java.util.List;

@Log4j2
@Service
public class CargaService {

@Autowired CargaRepository cargaRepository;

@Autowired ModelMapper mapper;



    @Transactional
    public Carga create(CreateCargaDto createCargaDto){
    log.info("CargaService.Create - input {}",createCargaDto);
    Carga carga = mapper.map(createCargaDto,Carga.class);
    carga.setTipoCarga(TipoCarga.returTipo(createCargaDto.getTipoCarga()));
    Carga cargaSaved = cargaRepository.save(carga);
    log.info("CargaService.Create - output {}",cargaSaved);
    return cargaSaved;
    }

    public List<Carga> findAll(){
        log.info("CargaService.findAll");
        return cargaRepository.findAll();
    }

    public Carga findById(Long id){
        log.info("CargaService.findById - input {}",id);
        Carga carga = cargaRepository.findById(id).orElseThrow();
        log.info("CargaService.findById - output {}",carga);
        return carga;
    }




}
