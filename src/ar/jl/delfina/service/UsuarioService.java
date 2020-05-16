package ar.jl.delfina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.jl.delfina.dao.UsuarioDao;
import ar.jl.delfina.dto.UsuarioDto;

@Component
public class UsuarioService {

	@Autowired
	UsuarioDao dao;
	
	public String save(UsuarioDto usuario) {
		return dao.save(usuario);
	}
	
}
