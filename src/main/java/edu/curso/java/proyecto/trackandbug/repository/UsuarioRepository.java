package edu.curso.java.proyecto.trackandbug.repository;

import org.springframework.data.repository.CrudRepository;

import edu.curso.java.proyecto.trackandbug.bo.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}