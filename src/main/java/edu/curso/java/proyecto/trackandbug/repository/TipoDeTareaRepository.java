package edu.curso.java.proyecto.trackandbug.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.curso.java.proyecto.trackandbug.bo.TipoDeTarea;

@Repository
public interface TipoDeTareaRepository extends CrudRepository<TipoDeTarea, Long> {
	@Query(value = "select t from TipoDeTarea t")
	public List<TipoDeTarea> buscarTipoDeTarea();
	
	@Query(value = "select t from TipoDeTarea t where t.nombre like %:nombre%")
	public List<TipoDeTarea> buscarTipoDeTarea(@Param("nombre") String nombre);
	
}


