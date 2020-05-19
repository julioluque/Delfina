package ar.jl.delfina.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import ar.jl.delfina.dto.UsuarioDto;

@Component
public class UsuarioDao {

	public String save(UsuarioDto usuario) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UsuarioDto.class).buildSessionFactory();
		Session ss = sf.openSession();

		try {
			ss.beginTransaction();
			ss.save(usuario);
			ss.getTransaction().commit();
			System.out.println("+ Guardado en base de datos OK!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ss.close();
			sf.close();
		}

		return "Se ha creado un nuevo usuario";
	}
	
	public UsuarioDto read(int id) {
		UsuarioDto usuario  = null;
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UsuarioDto.class).buildSessionFactory();
		Session ss = sf.openSession();
		
		try {
			ss.beginTransaction();
			usuario = ss.get(UsuarioDto.class, id);
			ss.getTransaction().commit();
			System.out.println("| Recuperado de base de datos OK!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ss.close();
			sf.close();
		}

		return usuario;
	}
	public String update(UsuarioDto usuario) {
		UsuarioDto usuarioDB  = null;
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UsuarioDto.class).buildSessionFactory();
		Session ss = sf.openSession();
		
		try {
			ss.beginTransaction();
			usuarioDB = ss.get(UsuarioDto.class, usuario.getId());
			usuarioDB.setNombre(usuario.getNombre());
			usuarioDB.setUsuario(usuario.getUsuario());
			usuarioDB.setEmail(usuario.getEmail());
			usuarioDB.setTelefono(usuario.getTelefono());
			usuarioDB.setClave(usuario.getClave());
			
			ss.getTransaction().commit();
			System.out.println("+ Guardado en base de datos OK!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ss.close();
			sf.close();
		}

		return "Usuario Actualizado : " + usuarioDB.getNombre();
	}
	
	public String delete(int id) {
		UsuarioDto usuario  = null;

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UsuarioDto.class).buildSessionFactory();
		Session ss = sf.openSession();
		
		try {
			ss.beginTransaction();
			usuario = ss.get(UsuarioDto.class, id);
			ss.remove(usuario);
			ss.getTransaction().commit();
			System.out.println("+ Eliminado de base de datos OK!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ss.close();
			sf.close();
		}

		return "Usuario eliminado : " + usuario.getNombre() + usuario.getUsuario() + usuario.getEmail();
	}
}
