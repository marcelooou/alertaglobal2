package com.fiap.alertachuva;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.fiap.alertachuva")
public class WebSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebSecurityApplication.class, args);
    }
}
