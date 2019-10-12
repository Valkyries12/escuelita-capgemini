package com.escuela.escuela.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.escuela.escuela.model.Curso;
import com.escuela.escuela.model.Tema;
import com.escuela.escuela.repository.ICursoRepository;
import com.escuela.escuela.repository.ItemaRepository;

@Controller
public class CursosController {

	@Autowired
	private ICursoRepository cursorepository;

	@Autowired
	private ItemaRepository temarepository;

	@GetMapping("/lista-cursos")
	public String listarCursos(@RequestParam(value="cursosId" , defaultValue="1") Long cursos_id, Model model) {
		
		List<Tema> temas = this.temarepository.findAll();
		Curso curso = this.cursorepository.getOne(cursos_id);
		model.addAttribute("temas", temas);
		model.addAttribute("curso", curso);

		return "listar-cursos";
	}

}
