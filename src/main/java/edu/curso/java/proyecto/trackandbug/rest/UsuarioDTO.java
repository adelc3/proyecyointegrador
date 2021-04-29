package edu.curso.java.proyecto.trackandbug.rest;

import edu.curso.java.proyecto.trackandbug.bo.Usuario;

public class UsuarioDTO {
	private Long id;
	private String nombre;
	private String apellido;
	
	public UsuarioDTO() {}
	
	public UsuarioDTO(Usuario usuarios) {
		this.id = usuarios.getId();
		this.nombre = usuarios.getNombre();
		this.apellido = usuarios.getApellido();
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
