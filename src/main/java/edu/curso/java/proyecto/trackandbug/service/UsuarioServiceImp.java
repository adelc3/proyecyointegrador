package edu.curso.java.proyecto.trackandbug.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.curso.java.proyecto.trackandbug.bo.Usuario;
import edu.curso.java.proyecto.trackandbug.repository.UsuarioRepository;

@Service
public abstract class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario buscarPorId(Long id) {
		return usuarioRepository.getOne(id);
	}	
}
