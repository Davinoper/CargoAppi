package com.br.cargoapp.cargoapp.model;

import com.br.cargoapp.cargoapp.model.Carga;
import com.br.cargoapp.cargoapp.model.Carro;
import com.br.cargoapp.cargoapp.model.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Operacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private TipoOperacao tipoOperacao;
    private LocalDateTime horario;
    @ManyToOne
    private Pessoa remetente;
    @ManyToOne
    private Pessoa destinatario;
    @OneToOne
    private Carga carga;
    @ManyToOne
    private Carro carro;
}
