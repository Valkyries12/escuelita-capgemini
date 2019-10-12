package com.escuela.escuela.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.escuela.escuela.model.Alumno;
import com.escuela.escuela.repository.IAlumnoRepository;

@Controller
public class AlumnoController {

	@Autowired
	private IAlumnoRepository alumnorepository;
	
	//trae todos los alumnos
	@GetMapping("/")
	public String listarAlumnos(Model model) {
		
		List<Alumno> alumnos =  alumnorepository.findAll();
		model.addAttribute("alumnos",alumnos);
		
		return "listar-alumnos";
	}
	
	//creaa un alumno vacio y lo llena con los datos del form
	@GetMapping("/nuevo-alumno")
	public String nuevoAlumnoForm(Model model) {
		Alumno nuevoAlumno = new Alumno();
		model.addAttribute("nuevoAlumno", nuevoAlumno);
		return "nuevo-alumno";
	}
	
	//persiste un alumno en la BD con los datos enviados
	@PostMapping("/alumno-guardado")
	public String guardarAlumno(@ModelAttribute("nuevoAlumno") Alumno nuevoAlumno) {
		
		this.alumnorepository.save(nuevoAlumno);
		return "alumno-guardado";
	}
	
	
	//pido el id del alumno que envio desde el modelo por url GET y actualizo
	@GetMapping("/actualizar-alumno")
	//le pide el long id a la vista
	public String actualizarAlumno(@RequestParam("alumnoId") long alumnoId , Model model) {
		Optional<Alumno> alumno = this.alumnorepository.findById(alumnoId);
		model.addAttribute("alumno", alumno);
		return "actualizar-alumno";
	}
	
	//borro un alumno con el id enviado por url
	@GetMapping("/borrar-alumno")
	public String borrarAlumno(@RequestParam("alumnoId") long id) {
		this.alumnorepository.deleteById(id);
		return "redirect:/";
	}
	
	
}
