package edu.curso.java.proyecto.trackandbug.rest;

import java.util.Date;

import edu.curso.java.proyecto.trackandbug.bo.Comentario;

public class ComentarioDTO {
	private Long id;
	private String observacion;
	private Long creadoPor;
	private Date fechaCreacion;
	
	public ComentarioDTO() {}
	
	public ComentarioDTO(Comentario comentario) {
		this.id = comentario.getId();
		this.observacion = comentario.getObservacion();
		this.creadoPor = comentario.getCreadoPor().getId();
		this.fechaCreacion = comentario.getFechaCreacion();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescripcion() {
		return observacion;
	}

	public void setDescripcion(String observacion) {
		this.observacion = observacion;
	}

	public Long getCreadoPor() {
		return creadoPor;
	}

	public void setCreadoPor(Long creadoPor) {
		this.creadoPor = creadoPor;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
