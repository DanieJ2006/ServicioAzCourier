package com.idat.BackendDAM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AZ_ENTREGA")
public class Entrega {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEntrega;

	private String estado;

	private String fecha;
	
	@OneToOne
	@JoinColumn(name = "id_repartidor")
	private Repartidor repartidor;

	@OneToOne
	@JoinColumn(name = "id_paquete")
	private Paquete paquete;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Integer getIdEntrega() {
		return idEntrega;
	}

	public void setIdEntrega(Integer idEntrega) {
		this.idEntrega = idEntrega;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Repartidor getRepartidor() {
		return repartidor;
	}

	public void setRepartidor(Repartidor repartidor) {
		this.repartidor = repartidor;
	}

	public Paquete getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}
}
