package com.idat.BackendDAM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AZ_REMITENTE")
public class Remitente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRemitente;
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	
	@OneToOne
	@JoinColumn(name = "id_paquete")
	private Paquete paquete;
	
	public Integer getIdRemitente() {
		return idRemitente;
	}
	public void setIdRemitente(Integer idRemitente) {
		this.idRemitente = idRemitente;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
