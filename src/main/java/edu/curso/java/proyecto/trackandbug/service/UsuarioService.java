package edu.curso.java.proyecto.trackandbug.service;

import java.util.List;

import edu.curso.java.proyecto.trackandbug.bo.Usuario;

public interface UsuarioService {

	public Usuario buscarUsuarioPorId(Long id);

	List<Usuario> buscarUsuarios();

	Long altaUsuarios(Usuario usuarios);

	Usuario buscarUsuariosPorId(Long id);

	List<Usuario> buscarUsuarios(String nombre);

	void borrarUsuarios(Long id);

	void actualizarUsuarios(Usuario usuarios);




}
