package edu.curso.java.proyecto.trackandbug.repository;

import org.springframework.data.repository.CrudRepository;

import edu.curso.java.proyecto.trackandbug.bo.Comentario;

public interface ComentarioRepository extends CrudRepository<Comentario, Long> {

}
