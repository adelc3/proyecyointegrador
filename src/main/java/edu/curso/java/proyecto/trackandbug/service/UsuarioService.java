package edu.curso.java.proyecto.trackandbug.service;

import java.util.List;

import edu.curso.java.proyecto.trackandbug.bo.Usuario;

public interface UsuarioService {

	public Usuario buscarPorId(Long id);

	public List<Usuario> buscarUsuario();

	public Long altaUsuarios(Usuario usuarios);

	public List<Usuario> buscarUsuariosPorId(Object id);


}
