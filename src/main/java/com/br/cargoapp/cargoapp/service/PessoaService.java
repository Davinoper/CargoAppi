package com.br.cargoapp.cargoapp.service;

import com.br.cargoapp.cargoapp.model.Pessoa;
import com.br.cargoapp.cargoapp.model.PessoaFisica;
import com.br.cargoapp.cargoapp.model.PessoaJuridica;
import com.br.cargoapp.cargoapp.model.dto.pessoa.CreatePessoaDto;
import com.br.cargoapp.cargoapp.repository.Enderecorepository;
import com.br.cargoapp.cargoapp.repository.PessoaRepository;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Log4j2
@Service
public class PessoaService {

    @Autowired PessoaRepository pessoaRepository;

    @Autowired ModelMapper mapper;

    @Autowired Enderecorepository enderecoRepository;

    @Transactional
    public Pessoa create(CreatePessoaDto createPessoaDto){
        log.info("PessoaService.create - input {}",createPessoaDto);
        if(createPessoaDto.isPessoaFisica()){
            PessoaFisica pessoa = (PessoaFisica) mapper.map(createPessoaDto,PessoaFisica.class);
            pessoa.setCpf(createPessoaDto.getCpf());
            pessoa.setRg(createPessoaDto.getRg());
            enderecoRepository.save(createPessoaDto.getEndereco());
            Pessoa pessoaSaved = pessoaRepository.save(pessoa);
            log.info("PessoaService.create - output {}",pessoa);
            return pessoaSaved;
        }
        else{
            PessoaJuridica pessoa = (PessoaJuridica) mapper.map(createPessoaDto,PessoaJuridica.class);
            pessoa.setCnpj(createPessoaDto.getCnpj());
            pessoa.setNomeFantasia(createPessoaDto.getNomeFantasia());
            pessoa.setRazaoSocial(createPessoaDto.getRazaoSocial());
            enderecoRepository.save(createPessoaDto.getEndereco());
            Pessoa pessoaSaved = pessoaRepository.save(pessoa);
            log.info("PessoaService.create - output {}",pessoa);
            return pessoaSaved;
        }

    }

    public List<PessoaFisica> findAllPessoaFisica(){
        log.info("PessoaService.findAllPessoaFisica");
        return pessoaRepository.findAllPessoaFisica();
    }

    public List<PessoaJuridica> findAllPessoaJuridica(){
        log.info("PessoaService.findAllPessoaJuridica");
        return pessoaRepository.findAllPessoaJuridica();
    }

    public List<Pessoa> findAll(){
        log.info("PessoaService.findAll");
        return pessoaRepository.findAll();
    }

    public Pessoa findById(Long id){
        log.info("PessoaService.findById - input {}",id);
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow();
        log.info("PessoaService.findById - output {}",pessoa);
        return pessoa;
    }

}
