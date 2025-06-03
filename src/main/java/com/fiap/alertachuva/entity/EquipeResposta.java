package com.fiap.alertachuva.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "equipe_resposta")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipeResposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_equipe")
    private String nomeEquipe;

    @Column(name = "base_operacao")
    private String baseOperacao;
}
