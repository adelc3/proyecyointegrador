package edu.curso.java.proyecto.trackandbug.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.curso.java.proyecto.trackandbug.bo.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
