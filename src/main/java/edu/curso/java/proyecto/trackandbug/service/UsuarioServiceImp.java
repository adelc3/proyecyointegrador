package edu.curso.java.proyecto.trackandbug.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.curso.java.proyecto.trackandbug.bo.Usuario;
import edu.curso.java.proyecto.trackandbug.repository.UsuarioRepository;

@Service
public abstract class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioRepository usuariosRepository;
	
	@Override
	public List<Usuario> buscarUsuarios() {
		return usuariosRepository.buscarUsuarios();
	}

	@Override
	public Long altaUsuarios(Usuario usuarios) {
		usuariosRepository.save(usuarios);
		return usuarios.getId();
	}

	@Override
	public Usuario buscarUsuariosPorId(Long id) {
		Optional<Usuario> usuario = usuariosRepository.findById(id);
		if(usuario.isEmpty()){
			return null;
		}
		
		return usuario.get();
	}

	@Override
	public List<Usuario> buscarUsuarios(String nombre) {
		return usuariosRepository.buscarUsuario(nombre);
	}

	@Override
	public void borrarUsuarios(Long id) {
		usuariosRepository.deleteById(id);
	}

	@Override
	public void actualizarUsuarios(Usuario usuarios) {
		usuariosRepository.save(usuarios);
	}
}