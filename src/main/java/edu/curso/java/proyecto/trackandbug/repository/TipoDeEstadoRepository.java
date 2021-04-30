package edu.curso.java.proyecto.trackandbug.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.curso.java.proyecto.trackandbug.bo.TipoDeEstado;

@Repository
public interface TipoDeEstadoRepository extends CrudRepository<TipoDeEstado, String> {
	@Query(value = "select t from TipoDeEstado t")
	public List<TipoDeEstado> buscarTipoDeEstado();
	
	@Query(value = "select t from TipoDeEstado t where t.nombre like %:nombre%")
	public List<TipoDeEstado> buscarTipoDeEstado(@Param("nombre") String nombre);
	
}


