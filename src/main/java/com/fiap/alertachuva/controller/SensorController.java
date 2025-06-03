package com.fiap.alertachuva.controller;

import com.fiap.alertachuva.entity.Sensor;
import com.fiap.alertachuva.repository.SensorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensores")
public class SensorController {

    private final SensorRepository sensorRepo;

    public SensorController(SensorRepository sensorRepo) {
        this.sensorRepo = sensorRepo;
    }

    @GetMapping
    public List<Sensor> listarTodos() {
        return sensorRepo.findAll();
    }

    @PostMapping
    public Sensor criar(@RequestBody Sensor sensor) {
        return sensorRepo.save(sensor);
    }
}
