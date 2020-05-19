package ar.jl.delfina.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping("/guardarUsuario")
	public String perfilDeUsuarioGuardar(@Valid @ModelAttribute("usr") UsuarioDto usuario, BindingResult ResultadoValidacion) {

		if (ResultadoValidacion.hasErrors()) {
			return "Registro";
		} else {
			service.save(usuario);
			return "Perfil";
		}
	}

	
	@RequestMapping("/buscarUsuario")
	public String perfilDeUsuarioBuscar(@RequestParam ("id") int id, Model model) {
		UsuarioDto usuario = service.read(id);
		model.addAttribute("buscar", usuario);
		return "Perfil";
	}

	
	@RequestMapping("/actualizarUsuario")
	public String perfilDeUsuarioActualizar(@Valid @ModelAttribute("usr") UsuarioDto usuario, BindingResult ResultadoValidacion) {

		if (ResultadoValidacion.hasErrors()) {
			return "Registro";
		} else {
			service.update(usuario);
			return "Perfil";
		}
	}

	
	@RequestMapping("/borrarUsuario")
	public String perfilDeUsuarioBorrar(@RequestParam ("id") int id, Model model) {
		String mensaje = service.delete(id);
		model.addAttribute("eliminado", mensaje);
		return "Perfil";
	}

}