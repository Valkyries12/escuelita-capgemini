package com.escuela.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escuela.escuela.model.Profesor;

public interface IProfesorRepository extends JpaRepository<Profesor, Long>{
	
	public Profesor findByMail (String mail);
	
	public Profesor findByPassword (String password);
}
