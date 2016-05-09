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
		@NamedQuery(name = "findAllOficinass", query = "select myOficinas from Oficinas myOficinas"),
		@NamedQuery(name = "findOficinasByCalle", query = "select myOficinas from Oficinas myOficinas where myOficinas.calle = ?1"),
		@NamedQuery(name = "findOficinasByCalleContaining", query = "select myOficinas from Oficinas myOficinas where myOficinas.calle like ?1"),
		@NamedQuery(name = "findOficinasByCiudad", query = "select myOficinas from Oficinas myOficinas where myOficinas.ciudad = ?1"),
		@NamedQuery(name = "findOficinasByCiudadContaining", query = "select myOficinas from Oficinas myOficinas where myOficinas.ciudad like ?1"),
		@NamedQuery(name = "findOficinasByCodigopostal", query = "select myOficinas from Oficinas myOficinas where myOficinas.codigopostal = ?1"),
		@NamedQuery(name = "findOficinasByNumoficina", query = "select myOficinas from Oficinas myOficinas where myOficinas.numoficina = ?1"),
		@NamedQuery(name = "findOficinasByPrimaryKey", query = "select myOficinas from Oficinas myOficinas where myOficinas.numoficina = ?1") })
@Table(schema = "USUARIO", name = "OFICINAS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "AplicacionInmobiliaria/com/duoc/inmobiliaria/domain", name = "Oficinas")
@XmlRootElement(namespace = "AplicacionInmobiliaria/com/duoc/inmobiliaria/domain")
public class Oficinas implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "NUMOFICINA", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	BigDecimal numoficina;
	/**
	 */

	@Column(name = "CALLE", length = 100, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String calle;
	/**
	 */

	@Column(name = "CIUDAD", length = 100, nullable = false)
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
	@OneToMany(mappedBy = "oficinas", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.duoc.inmobiliaria.domain.Empleados> empleadoses;

	/**
	 */
	public void setNumoficina(BigDecimal numoficina) {
		this.numoficina = numoficina;
	}

	/**
	 */
	public BigDecimal getNumoficina() {
		return this.numoficina;
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
	public void setEmpleadoses(Set<Empleados> empleadoses) {
		this.empleadoses = empleadoses;
	}

	/**
	 */
	public Set<Empleados> getEmpleadoses() {
		if (empleadoses == null) {
			empleadoses = new java.util.LinkedHashSet<com.duoc.inmobiliaria.domain.Empleados>();
		}
		return empleadoses;
	}

	/**
	 */
	public Oficinas() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Oficinas that) {
		setNumoficina(that.getNumoficina());
		setCalle(that.getCalle());
		setCiudad(that.getCiudad());
		setCodigopostal(that.getCodigopostal());
		setEmpleadoses(new java.util.LinkedHashSet<com.duoc.inmobiliaria.domain.Empleados>(that.getEmpleadoses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("numoficina=[").append(numoficina).append("] ");
		buffer.append("calle=[").append(calle).append("] ");
		buffer.append("ciudad=[").append(ciudad).append("] ");
		buffer.append("codigopostal=[").append(codigopostal).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((numoficina == null) ? 0 : numoficina.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Oficinas))
			return false;
		Oficinas equalCheck = (Oficinas) obj;
		if ((numoficina == null && equalCheck.numoficina != null) || (numoficina != null && equalCheck.numoficina == null))
			return false;
		if (numoficina != null && !numoficina.equals(equalCheck.numoficina))
			return false;
		return true;
	}
}
