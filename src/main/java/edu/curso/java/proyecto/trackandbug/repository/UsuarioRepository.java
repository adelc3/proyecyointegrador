package edu.curso.java.proyecto.trackandbug.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.curso.java.proyecto.trackandbug.bo.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	@Query(value = "select p from Usuario p")
	public List<Usuario> buscarUsuario();
	
	@Query(value = "select p from Usuario p p where p.nombre like %:nombre%")
	public List<Usuario> buscarUsuario(@Param("nombre") String nombre);

}
