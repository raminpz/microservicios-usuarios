package com.softrami.microservicios.usuarios.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosUsuariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviciosUsuariosApplication.class, args);
    }

}
