package com.escuela.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escuela.escuela.model.Alumno;

@Repository
public interface IAlumnoRepository extends JpaRepository <Alumno, Long>{

	
}
