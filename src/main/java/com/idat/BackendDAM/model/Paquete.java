package com.idat.BackendDAM.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="AZ_PAQUETE")
public class Paquete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPaquete;
	
	@OneToOne
	@JoinColumn(name = "id_remitente")
	private Remitente remitente;
	
	@OneToOne
	@JoinColumn(name = "id_consignado")
	private Consignado consignado;
	
	public Integer getIdPaquete() {
		return idPaquete;
	}
	
	public void setIdPaquete(Integer idPaquete) {
		this.idPaquete = idPaquete;
	}

	public Remitente getRemitente() {
		return remitente;
	}

	public void setRemitente(Remitente remitente) {
		this.remitente = remitente;
	}

	public Consignado getConsignado() {
		return consignado;
	}

	public void setConsignado(Consignado consignado) {
		this.consignado = consignado;
	}
}
