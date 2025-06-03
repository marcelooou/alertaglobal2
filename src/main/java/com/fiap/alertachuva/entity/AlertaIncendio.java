package com.fiap.alertachuva.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "alerta_incendio")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlertaIncendio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "leitura_id")
    private LeituraSensor leituraGatilho;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private EquipeResposta equipeDesignada;

    @Column(name = "nivel_severidade")
    private String nivelSeveridade;

    @Column(name = "status_alerta")
    private String statusAlerta;
}
