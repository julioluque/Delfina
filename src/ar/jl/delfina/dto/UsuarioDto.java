package ar.jl.delfina.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "USUARIO")
public class UsuarioDto {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOMBRE")
	@NotNull
	@Size(min = 2, message = "Campo requerido")
	private String nombre;

	@Column(name = "USUARIO")
	@NotNull
	@Size(min = 2, message = "Campo requerido")
	private String usuario;

	@Column(name = "EMAIL")
	@Email(message = "El formato de mail no es correcto")
	private String email;

	@Column(name = "TELEFONO")
	private String telefono;

	@NotNull
	@Size(min = 4, message = "Campo requerido (4)")
	@Column(name = "CLAVE")
	private String clave;

	public UsuarioDto() {
		// TODO Auto-generated constructor stub
	}

	public UsuarioDto(String nombre, String usuario, String email, String telefono, String clave) {
		this.nombre = nombre;
		this.usuario = usuario;
		this.email = email;
		this.telefono = telefono;
		this.clave = clave;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", usuario=" + usuario + ", email=" + email + ", telefono="
				+ telefono + ", clave=" + clave + "]";
	}

}
