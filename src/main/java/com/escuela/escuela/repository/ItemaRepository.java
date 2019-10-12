package com.escuela.escuela.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escuela.escuela.model.Tema;

@Repository
public interface ItemaRepository extends JpaRepository <Tema, Long>{

	List<Tema> findAllById(Long listaCursos);
	
	List<Tema> findAllByCursosid(Long cursosid);

}
