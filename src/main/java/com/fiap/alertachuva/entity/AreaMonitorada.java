
package com.fiap.alertachuva.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "area_monitorada")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AreaMonitorada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome da área é obrigatório")
    @Column(name = "nome_area")
    private String nomeArea;

    @NotNull(message = "Latitude é obrigatória")
    @DecimalMin(value = "-90.0")
    @DecimalMax(value = "90.0")
    @Column(name = "latitude_centro")
    private Double latitudeCentro;

    @NotNull(message = "Longitude é obrigatória")
    @DecimalMin(value = "-180.0")
    @DecimalMax(value = "180.0")
    @Column(name = "longitude_centro")
    private Double longitudeCentro;

    @NotNull(message = "Raio em km é obrigatório")
    @DecimalMin(value = "0.1")
    @Column(name = "raio_km")
    private Double raioKm;
}
