package edu.curso.java.proyecto.trackandbug.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_DE_ESTADO")
public class TipoDeEstado {

	@Id
	private Long idTipoDeEstado;
	
	private String nombre;
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipoDeEstado == null) ? 0 : idTipoDeEstado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoDeEstado other = (TipoDeEstado) obj;
		
		if (idTipoDeEstado == null) {
			if (other.idTipoDeEstado != null)
				return false;
		} else if (!idTipoDeEstado.equals(other.idTipoDeEstado))
			return false;
		return true;
	}

	public Long getIdTipoDeEstado() {
		return idTipoDeEstado;
	}

	public void setIdTipoDeEstado(Long idTipoDeEstado) {
		this.idTipoDeEstado = idTipoDeEstado;
	}



}
