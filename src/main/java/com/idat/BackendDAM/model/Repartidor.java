package com.idat.BackendDAM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AZ_REPARTIDOR")
public class Repartidor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRepartidor;
	private String correo;
	private String telefono;
	private String nombre;
	private String apellido;
	
	@OneToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Integer getIdRepartidor() {
		return idRepartidor;
	}

	public void setIdRepartidor(Integer idRepartidor) {
		this.idRepartidor = idRepartidor;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	

}
