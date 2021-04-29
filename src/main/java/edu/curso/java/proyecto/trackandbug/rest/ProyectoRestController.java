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

	@RestController
	@RequestMapping("/proyectos")
	public class ProyectoRestController {

		@Autowired
		private ProyectoService proyectoService;
		
		@GetMapping(path = "/{id}")
		public ResponseEntity<ProyectoDTO> recuperarProyectoPorId(@PathVariable Long id) {
			Proyecto proyectos = proyectoService.buscarProyectosPorId(id);
			ProyectoDTO proyectoDTO = new ProyectoDTO(proyectos);
			return ResponseEntity.ok(proyectoDTO);
		}
		
		@GetMapping
		public ResponseEntity<List<ProyectoDTO>> buscarProyectos(){
		
			List<Proyecto> proyectos = proyectoService.buscarProyectos();
			List<ProyectoDTO> proyectoDTO = new ArrayList<ProyectoDTO>();
			for(Proyecto p :  proyectos) {
				proyectoDTO.add(new ProyectoDTO(p));
			}
			
			return ResponseEntity.ok(proyectoDTO);
		}
		
		@PostMapping
		public ResponseEntity<ProyectoDTO> altaProyectos(@Valid @RequestBody ProyectoDTO proyectoDTO){
			Proyecto proyectos = new Proyecto();
			proyectos.setNombre(proyectoDTO.getNombre());
			proyectos.setHorasAsignadas(proyectoDTO.getHorasAsignadas());
			/*
			Usuario usuario = new Usuario();
			usuario.setId(proyectoDTO.getResponsable());
			proyectos.setResponsable(usuario);
			*/
			System.out.println(proyectos.getResponsable());
			
			Long idGenerado = proyectoService.altaProyectos(proyectos);
			proyectoDTO.setId(idGenerado);
			return ResponseEntity.status(HttpStatus.CREATED).body(proyectoDTO);
		}
		
		@PutMapping(path = "/{id}/usuarioresponsable?usuario/")
		public ResponseEntity actualizarProyectos(@PathVariable Long id, @RequestBody ProyectoDTO proyectoDTO){
			Proyecto proyectos = proyectoService.buscarProyectosPorId(id);
			proyectos.setNombre(proyectoDTO.getNombre());
			proyectoService.actualizarProyectos(proyectos);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		
		@DeleteMapping(path = "/{id}")
		public ResponseEntity borrarProyectos(@PathVariable Long id){
			proyectoService.borrarProyectos(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}

}
