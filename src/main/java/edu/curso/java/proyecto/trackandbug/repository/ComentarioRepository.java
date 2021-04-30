package edu.curso.java.proyecto.trackandbug.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.curso.java.proyecto.trackandbug.bo.Comentario;

@Repository
public interface ComentarioRepository extends CrudRepository<Comentario, Long> {
	
	@Query(value = "select p from Comentario p")
	public List<Comentario> buscarComentarios();
	
	@Query(value = "select p from Comentario p where p.nombre like %:observacion%")
	public List<Comentario> buscarComentarios(@Param("observacion") String observacion);
	

}
