package edu.curso.java.proyecto.trackandbug.service;

import java.util.List;

import edu.curso.java.proyecto.trackandbug.bo.Proyecto;

public interface ProyectoService {
	public List<Proyecto> buscarProyectos();
	public Long altaProyectos(Proyecto	proyectos);
	public Proyecto buscarProyectosPorId(Long id);
	public List<Proyecto> buscarProyectos(String nombre);
	public void borrarProyectos(Long id);
	public void actualizarProyectos(Proyecto proyectos);

}
