package com.idat.BackendDAM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AZ_CONSIGNADO")
public class Consignado {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idConsignado;
	private String nombre;
	private String apellido;
	private String telefono;
	private String dni;
	private String direccion;
	private String distrito;
	
	@OneToOne
	@JoinColumn(name = "id_paquete")
	private Paquete paquete;
	
	public Integer getIdConsignado() {
		return idConsignado;
	}
	public void setIdConsignado(Integer idConsignado) {
		this.idConsignado = idConsignado;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
}
