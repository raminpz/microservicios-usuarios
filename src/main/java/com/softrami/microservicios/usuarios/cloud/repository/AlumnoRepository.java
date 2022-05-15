package com.softrami.microservicios.usuarios.cloud.repository;

import com.softrami.microservicios.usuarios.cloud.models.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
