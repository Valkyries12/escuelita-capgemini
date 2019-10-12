package com.escuela.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escuela.escuela.model.Curso;

@Repository
public interface ICursoRepository extends JpaRepository <Curso, Long> {

	
}
