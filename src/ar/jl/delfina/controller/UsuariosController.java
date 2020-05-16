package ar.jl.delfina.controller;
import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.jl.delfina.dto.UsuarioDto;
import ar.jl.delfina.service.UsuarioService;

@Controller
public class UsuariosController {
	
	@Autowired
	UsuarioService service;
	
	@RequestMapping
	public String index() {
		return "Index";
	}
	
	@RequestMapping("/registro")
	public String registro(Model model) {
		UsuarioDto usuario1 = new UsuarioDto();
		model.addAttribute("usr", usuario1);
		return "Registro";
	}
	
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		StringTrimmerEditor recortarEspacios = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, recortarEspacios);
	}
	
	@RequestMapping("/perfil")
	public String mostrarAtributosDelModelo(@Valid @ModelAttribute("usr") UsuarioDto usuario,
			BindingResult ResultadoValidacion) {

		System.out.println(usuario);
		
		if (ResultadoValidacion.hasErrors()) {
			return "Registro";
		} else {
			service.save(usuario);
			
			return "Perfil";
		}
	}
}
