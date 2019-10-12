package com.escuela.escuela.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.escuela.escuela.repository.IProfesorRepository;

@Controller
public class LoginController {

	
	
	@GetMapping("/login")
	public String login(@RequestParam(value="error", required=false) String error,
			Model model, Principal principal, RedirectAttributes flash) {
		
		
		
		if(error != null) {
			model.addAttribute("error", "Error en el login: usuario o contraseña incorrecto por favor vuelva a intentarlo");
		}
		return "login";
	}
	
	
}
