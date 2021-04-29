package edu.curso.java.proyecto.trackandbug.rest;

import edu.curso.java.proyecto.trackandbug.bo.Proyecto;

public class ProyectoDTO {
	private Long id;
	private String nombre;
	private Long responsable;
	private Long horasAsignadas;
	
	public ProyectoDTO() {}
	
	public ProyectoDTO(Proyecto proyectos) {
		this.id = proyectos.getId();
		this.nombre = proyectos.getNombre();
		this.horasAsignadas = proyectos.getHorasAsignadas();
		this.responsable = proyectos.getResponsable().getId();
	
	}

	public Long getResponsable() {
		return responsable;
	}

	public void setResponsable(Long responsable) {
		this.responsable = responsable;
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


	public Long getHorasAsignadas() {
		return horasAsignadas;
	}

	public void setHorasAsignadas(Long horasAsignadas) {
		this.horasAsignadas = horasAsignadas;
	}

}
