package edu.curso.java.proyecto.trackandbug.rest;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.java.proyecto.trackandbug.bo.Proyecto;
import edu.curso.java.proyecto.trackandbug.bo.Usuario;
import edu.curso.java.proyecto.trackandbug.service.ProyectoService;
import edu.curso.java.proyecto.trackandbug.service.UsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioRestController {
	
}

	