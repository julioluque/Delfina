package ar.jl.delfina.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import ar.jl.delfina.dto.UsuarioDto;

@Component
public class UsuarioDao {

	public String save(UsuarioDto usuario) {

		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UsuarioDto.class)
				.buildSessionFactory();
		Session ss = sf.openSession();

		try {
			ss.beginTransaction();
			ss.save(usuario);
			ss.getTransaction().commit();
			System.out.println("+ Guardado en base de datos OK!");
		} catch (Exception e) {

		} finally {
			ss.close();
			sf.close();
		}

		return "ok";
	}
}
