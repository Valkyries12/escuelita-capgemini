package com.escuela.escuela.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "cursos")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty
	private String nombre_curso;

	public Curso() {
		super();
	}

	public Curso(Long id, @NotEmpty String nombreCurso) {
		super();
		this.id = id;
		this.nombre_curso = nombreCurso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreCurso() {
		return nombre_curso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombre_curso = nombreCurso;
	}

}
