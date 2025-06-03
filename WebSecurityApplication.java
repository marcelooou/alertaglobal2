package com.fiap.alertachuva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // sem scanBasePackages, pois está no pacote raiz
public class WebSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebSecurityApplication.class, args);
    }
}
