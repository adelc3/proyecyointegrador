package edu.curso.java.proyecto.trackandbug.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.curso.java.proyecto.trackandbug.bo.Tarea;

@Repository
public interface TareaRepository extends CrudRepository<Tarea, Long> {
	
	@Query(value = "select t from Tarea t")
	public List<Tarea> buscarTareas();
	
	@Query(value = "select t from Tarea t where t.nombre like %:nombre%")
	public List<Tarea> buscarTareas(@Param("nombre") String nombre);
	
}
