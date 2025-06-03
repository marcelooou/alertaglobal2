package com.fiap.alertachuva.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "leitura_sensor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeituraSensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;

    @Column(name = "timestamp_leitura")
    private Timestamp timestampLeitura;

    @Column(name = "tipo_medicao")
    private String tipoMedicao;

    @Column(name = "valor_medicao")
    private Double valorMedicao;
}
