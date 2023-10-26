package org.markpetplace.mpp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario", unique = true, nullable = false)
	private Integer id;
	private String nombreUsuario;
	private String password;
	private String apellido;
	private String telefono;
	private String correo;
	
	
	//constructor vacío
	public Usuario() {
		
	}

	//constructor
	public Usuario(Integer id, String nombreUsuario, String password, String apellido, String telefono, String correo) {
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	//Getters y Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	//toString
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", password=" + password + ", apellido="
				+ apellido + ", telefono=" + telefono + ", correo=" + correo + "]";
	}
	


}//class
