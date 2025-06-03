package com.fiap.alertachuva.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sensores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Coluna area_id referencia o ID em area_monitorada
    @ManyToOne
    @JoinColumn(name = "area_id")
    private AreaMonitorada area;

    @Column(name = "tipo_sensor")
    private String tipoSensor;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "status")
    private String status;
}
