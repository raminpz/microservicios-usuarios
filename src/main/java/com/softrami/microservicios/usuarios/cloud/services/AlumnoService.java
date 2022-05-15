package com.softrami.microservicios.usuarios.cloud.services;

import com.softrami.microservicios.usuarios.cloud.models.Alumno;

import java.util.Optional;

public interface AlumnoService {

    public Iterable<Alumno> findAll();

    public Optional<Alumno> findById(Long id);

    public Alumno save(Alumno alumno);

    public void deleteById(Long id);
}
