package com.duoc.inmobiliaria.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllPropiedadess", query = "select myPropiedades from Propiedades myPropiedades"),
		@NamedQuery(name = "findPropiedadesByCalle", query = "select myPropiedades from Propiedades myPropiedades where myPropiedades.calle = ?1"),
		@NamedQuery(name = "findPropiedadesByCalleContaining", query = "select myPropiedades from Propiedades myPropiedades where myPropiedades.calle like ?1"),
		@NamedQuery(name = "findPropiedadesByCiudad", query = "select myPropiedades from Propiedades myPropiedades where myPropiedades.ciudad = ?1"),
		@NamedQuery(name = "findPropiedadesByCiudadContaining", query = "select myPropiedades from Propiedades myPropiedades where myPropiedades.ciudad like ?1"),
		@NamedQuery(name = "findPropiedadesByCodigopostal", query = "select myPropiedades from Propiedades myPropiedades where myPropiedades.codigopostal = ?1"),
		@NamedQuery(name = "findPropiedadesByHabitaciones", query = "select myPropiedades from Propiedades myPropiedades where myPropiedades.habitaciones = ?1"),
		@NamedQuery(name = "findPropiedadesByNumpropiedad", query = "select myPropiedades from Propiedades myPropiedades where myPropiedades.numpropiedad = ?1"),
		@NamedQuery(name = "findPropiedadesByPrimaryKey", query = "select myPropiedades from Propiedades myPropiedades where myPropiedades.numpropiedad = ?1"),
		@NamedQuery(name = "findPropiedadesByRenta", query = "select myPropiedades from Propiedades myPropiedades where myPropiedades.renta = ?1"),
		@NamedQuery(name = "findPropiedadesByTipo", query = "select myPropiedades from Propiedades myPropiedades where myPropiedades.tipo = ?1"),
		@NamedQuery(name = "findPropiedadesByTipoContaining", query = "select myPropiedades from Propiedades myPropiedades where myPropiedades.tipo like ?1") })
@Table(schema = "USUARIO", name = "PROPIEDADES")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "AplicacionInmobiliaria/com/duoc/inmobiliaria/domain", name = "Propiedades")
@XmlRootElement(namespace = "AplicacionInmobiliaria/com/duoc/inmobiliaria/domain")
public class Propiedades implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "NUMPROPIEDAD", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	BigDecimal numpropiedad;
	/**
	 */

	@Column(name = "CALLE", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String calle;
	/**
	 */

	@Column(name = "CIUDAD", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String ciudad;
	/**
	 */

	@Column(name = "CODIGOPOSTAL", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal codigopostal;
	/**
	 */

	@Column(name = "TIPO", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String tipo;
	/**
	 */

	@Column(name = "HABITACIONES", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal habitaciones;
	/**
	 */

	@Column(name = "RENTA", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal renta;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "NUMEMPLEADO", referencedColumnName = "NUMEMPLEADO", nullable = false) })
	@XmlTransient
	Empleados empleados;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "NUMPROPIETARIOS", referencedColumnName = "NUMPROPIETARIO", nullable = false) })
	@XmlTransient
	Propietarios propietarios;
	/**
	 */
	@OneToMany(mappedBy = "propiedades", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.duoc.inmobiliaria.domain.Visitas> visitases;
	/**
	 */
	@OneToMany(mappedBy = "propiedades", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.duoc.inmobiliaria.domain.Arriendos> arriendoses;

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
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 */
	public String getCalle() {
		return this.calle;
	}

	/**
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 */
	public String getCiudad() {
		return this.ciudad;
	}

	/**
	 */
	public void setCodigopostal(BigDecimal codigopostal) {
		this.codigopostal = codigopostal;
	}

	/**
	 */
	public BigDecimal getCodigopostal() {
		return this.codigopostal;
	}

	/**
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 */
	public String getTipo() {
		return this.tipo;
	}

	/**
	 */
	public void setHabitaciones(BigDecimal habitaciones) {
		this.habitaciones = habitaciones;
	}

	/**
	 */
	public BigDecimal getHabitaciones() {
		return this.habitaciones;
	}

	/**
	 */
	public void setRenta(BigDecimal renta) {
		this.renta = renta;
	}

	/**
	 */
	public BigDecimal getRenta() {
		return this.renta;
	}

	/**
	 */
	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	/**
	 */
	public Empleados getEmpleados() {
		return empleados;
	}

	/**
	 */
	public void setPropietarios(Propietarios propietarios) {
		this.propietarios = propietarios;
	}

	/**
	 */
	public Propietarios getPropietarios() {
		return propietarios;
	}

	/**
	 */
	public void setVisitases(Set<Visitas> visitases) {
		this.visitases = visitases;
	}

	/**
	 */
	public Set<Visitas> getVisitases() {
		if (visitases == null) {
			visitases = new java.util.LinkedHashSet<com.duoc.inmobiliaria.domain.Visitas>();
		}
		return visitases;
	}

	/**
	 */
	public void setArriendoses(Set<Arriendos> arriendoses) {
		this.arriendoses = arriendoses;
	}

	/**
	 */
	public Set<Arriendos> getArriendoses() {
		if (arriendoses == null) {
			arriendoses = new java.util.LinkedHashSet<com.duoc.inmobiliaria.domain.Arriendos>();
		}
		return arriendoses;
	}

	/**
	 */
	public Propiedades() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Propiedades that) {
		setNumpropiedad(that.getNumpropiedad());
		setCalle(that.getCalle());
		setCiudad(that.getCiudad());
		setCodigopostal(that.getCodigopostal());
		setTipo(that.getTipo());
		setHabitaciones(that.getHabitaciones());
		setRenta(that.getRenta());
		setEmpleados(that.getEmpleados());
		setPropietarios(that.getPropietarios());
		setVisitases(new java.util.LinkedHashSet<com.duoc.inmobiliaria.domain.Visitas>(that.getVisitases()));
		setArriendoses(new java.util.LinkedHashSet<com.duoc.inmobiliaria.domain.Arriendos>(that.getArriendoses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("numpropiedad=[").append(numpropiedad).append("] ");
		buffer.append("calle=[").append(calle).append("] ");
		buffer.append("ciudad=[").append(ciudad).append("] ");
		buffer.append("codigopostal=[").append(codigopostal).append("] ");
		buffer.append("tipo=[").append(tipo).append("] ");
		buffer.append("habitaciones=[").append(habitaciones).append("] ");
		buffer.append("renta=[").append(renta).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((numpropiedad == null) ? 0 : numpropiedad.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Propiedades))
			return false;
		Propiedades equalCheck = (Propiedades) obj;
		if ((numpropiedad == null && equalCheck.numpropiedad != null) || (numpropiedad != null && equalCheck.numpropiedad == null))
			return false;
		if (numpropiedad != null && !numpropiedad.equals(equalCheck.numpropiedad))
			return false;
		return true;
	}
}
