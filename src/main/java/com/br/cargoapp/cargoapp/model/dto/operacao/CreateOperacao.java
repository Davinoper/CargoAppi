package com.br.cargoapp.cargoapp.model.dto.operacao;

import com.br.cargoapp.cargoapp.model.Carga;
import com.br.cargoapp.cargoapp.model.Carro;
import com.br.cargoapp.cargoapp.model.Pessoa;
import com.br.cargoapp.cargoapp.model.TipoOperacao;
import lombok.Data;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Data
public class CreateOperacao {
    private int tipoOperacao;
    private LocalDateTime horario;

    private Long remetente;

    private Long destinatario;

    private Long carga;

    private Long carro;
}
