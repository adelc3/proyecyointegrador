package edu.curso.java.proyecto.trackandbug.rest;

import edu.curso.java.proyecto.trackandbug.bo.Tarea;

public class TareaDTO {
	private Long id;
	private String nombre;
	private String tipoDeEstado;	
	private Long tipoDeTarea;
	private Integer horasAsignadas;
	private Long proyecto;
	
	
	public Long getProyecto() {
		return proyecto;
	}

	public void setProyecto(Long proyecto) {
		this.proyecto = proyecto;
	}

	public TareaDTO() {}
	
	public TareaDTO(Tarea tareas) {
		this.id = tareas.getId();
		this.nombre = tareas.getNombre();
		this.horasAsignadas = tareas.getHorasAsignadas();
		this.tipoDeEstado = tareas.getTipoDeEstado().getNombre();
		this.proyecto = tareas.getProyecto().getId();
	}

	public Integer getHorasAsignadas() {
		return horasAsignadas;
	}

	public void setHorasAsignadas(Integer horasAsignadas) {
		this.horasAsignadas = horasAsignadas;
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

	public String getTipoDeEstado() {
		return tipoDeEstado;
	}

	public void setTipoDeEstado(String tipoDeEstado) {
		this.tipoDeEstado = tipoDeEstado;
	}

	public Long getTipoDeTarea() {
		return tipoDeTarea;
	}

	public void setTipoDeTarea(Long tipoDeTarea) {
		this.tipoDeTarea = tipoDeTarea;
	}

}
