package com.duoc.inmobiliaria.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */
@IdClass(com.duoc.inmobiliaria.domain.VisitasPK.class)
@Entity
@NamedQueries({
		@NamedQuery(name = "findAllVisitass", query = "select myVisitas from Visitas myVisitas"),
		@NamedQuery(name = "findVisitasByComentario", query = "select myVisitas from Visitas myVisitas where myVisitas.comentario = ?1"),
		@NamedQuery(name = "findVisitasByComentarioContaining", query = "select myVisitas from Visitas myVisitas where myVisitas.comentario like ?1"),
		@NamedQuery(name = "findVisitasByFecha", query = "select myVisitas from Visitas myVisitas where myVisitas.fecha = ?1"),
		@NamedQuery(name = "findVisitasByNumcliente", query = "select myVisitas from Visitas myVisitas where myVisitas.numcliente = ?1"),
		@NamedQuery(name = "findVisitasByNumpropiedad", query = "select myVisitas from Visitas myVisitas where myVisitas.numpropiedad = ?1"),
		@NamedQuery(name = "findVisitasByPrimaryKey", query = "select myVisitas from Visitas myVisitas where myVisitas.numcliente = ?1 and myVisitas.fecha = ?2 and myVisitas.numpropiedad = ?3") })
@Table(schema = "USUARIO", name = "VISITAS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "AplicacionInmobiliaria/com/duoc/inmobiliaria/domain", name = "Visitas")
public class Visitas implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "NUMCLIENTE", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	BigDecimal numcliente;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Calendar fecha;
	/**
	 */

	@Column(name = "NUMPROPIEDAD", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	BigDecimal numpropiedad;
	/**
	 */

	@Column(name = "COMENTARIO", length = 250)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String comentario;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "NUMPROPIEDAD", referencedColumnName = "NUMPROPIEDAD", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Propiedades propiedades;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "NUMCLIENTE", referencedColumnName = "NUMCLIENTE", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Clientes clientes;

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
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	/**
	 */
	public String getComentario() {
		return this.comentario;
	}

	/**
	 */
	public void setPropiedades(Propiedades propiedades) {
		this.propiedades = propiedades;
	}

	/**
	 */
	public Propiedades getPropiedades() {
		return propiedades;
	}

	/**
	 */
	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	/**
	 */
	public Clientes getClientes() {
		return clientes;
	}

	/**
	 */
	public Visitas() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Visitas that) {
		setNumcliente(that.getNumcliente());
		setFecha(that.getFecha());
		setNumpropiedad(that.getNumpropiedad());
		setComentario(that.getComentario());
		setPropiedades(that.getPropiedades());
		setClientes(that.getClientes());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("numcliente=[").append(numcliente).append("] ");
		buffer.append("fecha=[").append(fecha).append("] ");
		buffer.append("numpropiedad=[").append(numpropiedad).append("] ");
		buffer.append("comentario=[").append(comentario).append("] ");

		return buffer.toString();
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
		if (!(obj instanceof Visitas))
			return false;
		Visitas equalCheck = (Visitas) obj;
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
}
