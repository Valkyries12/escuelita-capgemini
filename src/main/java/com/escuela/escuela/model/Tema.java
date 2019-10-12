package com.escuela.escuela.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name = "temas")
public class Tema {
	
	@Id
	private Long id;
	
	@NotEmpty
	private String tema;
	
	
	private Long cursosid;
	



	public Long getCursosid() {
		return cursosid;
	}

	

	public Tema(Long id, @NotEmpty String tema, Long cursosid) {
		super();
		this.id = id;
		this.tema = tema;
		this.cursosid = cursosid;
	}



	public void setCursos_id(Long cursosid) {
		this.cursosid = cursosid;
	}



	public Tema() {
		super();
	}

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	

}
