package com.duoc.inmobiliaria.domain;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.Calendar;

import javax.persistence.Id;

import javax.persistence.*;

/**
 */
public class VisitasPK implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
	public VisitasPK() {
	}

	/**
	 */

	@Column(name = "NUMCLIENTE", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	public BigDecimal numcliente;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Calendar fecha;
	/**
	 */

	@Column(name = "NUMPROPIEDAD", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	public BigDecimal numpropiedad;

	/**
	 */
	public void setNumcliente(BigDecimal numcliente) {
		this.numcliente = numcliente;
	}

	/**
	 */
	public BigDecimal getNumcliente() {
		return this.numcliente;
	}

	/**
	 */
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	/**
	 */
	public Calendar getFecha() {
		return this.fecha;
	}

	/**
	 */
	public void setNumpropiedad(BigDecimal numpropiedad) {
		this.numpropiedad = numpropiedad;
	}

	/**
	 */
	public BigDecimal getNumpropiedad() {
		return this.numpropiedad;
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((numcliente == null) ? 0 : numcliente.hashCode()));
		result = (int) (prime * result + ((fecha == null) ? 0 : fecha.hashCode()));
		result = (int) (prime * result + ((numpropiedad == null) ? 0 : numpropiedad.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof VisitasPK))
			return false;
		VisitasPK equalCheck = (VisitasPK) obj;
		if ((numcliente == null && equalCheck.numcliente != null) || (numcliente != null && equalCheck.numcliente == null))
			return false;
		if (numcliente != null && !numcliente.equals(equalCheck.numcliente))
			return false;
		if ((fecha == null && equalCheck.fecha != null) || (fecha != null && equalCheck.fecha == null))
			return false;
		if (fecha != null && !fecha.equals(equalCheck.fecha))
			return false;
		if ((numpropiedad == null && equalCheck.numpropiedad != null) || (numpropiedad != null && equalCheck.numpropiedad == null))
			return false;
		if (numpropiedad != null && !numpropiedad.equals(equalCheck.numpropiedad))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("VisitasPK");
		sb.append(" numcliente: ").append(getNumcliente());
		sb.append(" fecha: ").append(getFecha());
		sb.append(" numpropiedad: ").append(getNumpropiedad());
		return sb.toString();
	}
}
