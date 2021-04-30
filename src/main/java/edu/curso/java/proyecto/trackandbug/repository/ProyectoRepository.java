package edu.curso.java.proyecto.trackandbug.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.curso.java.proyecto.trackandbug.bo.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
	
	@Query(value = "select p from Proyecto p")
	public List<Proyecto> buscarProyectos();
	
	@Query(value = "select p from Proyecto p where p.nombre like %:nombre%")
	public List<Proyecto> buscarProyectos(@Param("nombre") String nombre);
	
}