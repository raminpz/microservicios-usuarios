package com.softrami.microservicios.usuarios.cloud.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidos;
    private String email;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @PrePersist
    public void prePersist(){
        this.createAt = LocalDateTime.now();
    }


}
