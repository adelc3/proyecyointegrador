package edu.curso.java.proyecto.trackandbug.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.curso.java.proyecto.trackandbug.bo.Proyecto;
import edu.curso.java.proyecto.trackandbug.repository.ProyectoRepository;
import edu.curso.java.proyecto.trackandbug.repository.UsuarioRepository;
@Service
public class ProyectoServiceImp implements ProyectoService {
	@Autowired
	private ProyectoRepository proyectosRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Proyecto> buscarProyectos() {
		return proyectosRepository.buscarProyectos();
	}
	
	@Override
	public Long altaProyectos(Proyecto proyectos){
		//Optional<Usuario> usuario = usuarioRepository.findById(proyectos.getResponsable().getId());
		proyectosRepository.save(proyectos);
		return proyectos.getId();
	}

	@Override
	public Proyecto buscarProyectosPorId(Long id) {
		return proyectosRepository.findById(id).get();
	}

	@Override
	public List<Proyecto> buscarProyectos(String nombre) {
		return proyectosRepository.buscarProyectos(nombre);
	}

	@Override
	public void borrarProyectos(Long id) {
		proyectosRepository.deleteById(id);		
	}

	@Override
	public void actualizarProyectos(Proyecto proyectos) {
		proyectosRepository.save(proyectos);	
	}
}

	