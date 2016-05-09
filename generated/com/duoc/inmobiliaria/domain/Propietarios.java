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
		@NamedQuery(name = "findAllPropietarioss", query = "select myPropietarios from Propietarios myPropietarios"),
		@NamedQuery(name = "findPropietariosByApellido", query = "select myPropietarios from Propietarios myPropietarios where myPropietarios.apellido = ?1"),
		@NamedQuery(name = "findPropietariosByApellidoContaining", query = "select myPropietarios from Propietarios myPropietarios where myPropietarios.apellido like ?1"),
		@NamedQuery(name = "findPropietariosByDireccion", query = "select myPropietarios from Propietarios myPropietarios where myPropietarios.direccion = ?1"),
		@NamedQuery(name = "findPropietariosByDireccionContaining", query = "select myPropietarios from Propietarios myPropietarios where myPropietarios.direccion like ?1"),
		@NamedQuery(name = "findPropietariosByNombre", query = "select myPropietarios from Propietarios myPropietarios where myPropietarios.nombre = ?1"),
		@NamedQuery(name = "findPropietariosByNombreContaining", query = "select myPropietarios from Propietarios myPropietarios where myPropietarios.nombre like ?1"),
		@NamedQuery(name = "findPropietariosByNumpropietario", query = "select myPropietarios from Propietarios myPropietarios where myPropietarios.numpropietario = ?1"),
		@NamedQuery(name = "findPropietariosByPrimaryKey", query = "select myPropietarios from Propietarios myPropietarios where myPropietarios.numpropietario = ?1"),
		@NamedQuery(name = "findPropietariosByTelefono", query = "select myPropietarios from Propietarios myPropietarios where myPropietarios.telefono = ?1"),
		@NamedQuery(name = "findPropietariosByTelefonoContaining", query = "select myPropietarios from Propietarios myPropietarios where myPropietarios.telefono like ?1") })
@Table(schema = "USUARIO", name = "PROPIETARIOS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "AplicacionInmobiliaria/com/duoc/inmobiliaria/domain", name = "Propietarios")
@XmlRootElement(namespace = "AplicacionInmobiliaria/com/duoc/inmobiliaria/domain")
public class Propietarios implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "NUMPROPIETARIO", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	BigDecimal numpropietario;
	/**
	 */

	@Column(name = "NOMBRE", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String nombre;
	/**
	 */

	@Column(name = "APELLIDO", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String apellido;
	/**
	 */

	@Column(name = "DIRECCION", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String direccion;
	/**
	 */

	@Column(name = "TELEFONO", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String telefono;

	/**
	 */
	@OneToMany(mappedBy = "propietarios", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.duoc.inmobiliaria.domain.Propiedades> propiedadeses;

	/**
	 */
	public void setNumpropietario(BigDecimal numpropietario) {
		this.numpropietario = numpropietario;
	}

	/**
	 */
	public BigDecimal getNumpropietario() {
		return this.numpropietario;
	}

	/**
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 */
	public String getApellido() {
		return this.apellido;
	}

	/**
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 */
	public String getDireccion() {
		return this.direccion;
	}

	/**
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 */
	public String getTelefono() {
		return this.telefono;
	}

	/**
	 */
	public void setPropiedadeses(Set<Propiedades> propiedadeses) {
		this.propiedadeses = propiedadeses;
	}

	/**
	 */
	public Set<Propiedades> getPropiedadeses() {
		if (propiedadeses == null) {
			propiedadeses = new java.util.LinkedHashSet<com.duoc.inmobiliaria.domain.Propiedades>();
		}
		return propiedadeses;
	}

	/**
	 */
	public Propietarios() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Propietarios that) {
		setNumpropietario(that.getNumpropietario());
		setNombre(that.getNombre());
		setApellido(that.getApellido());
		setDireccion(that.getDireccion());
		setTelefono(that.getTelefono());
		setPropiedadeses(new java.util.LinkedHashSet<com.duoc.inmobiliaria.domain.Propiedades>(that.getPropiedadeses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("numpropietario=[").append(numpropietario).append("] ");
		buffer.append("nombre=[").append(nombre).append("] ");
		buffer.append("apellido=[").append(apellido).append("] ");
		buffer.append("direccion=[").append(direccion).append("] ");
		buffer.append("telefono=[").append(telefono).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((numpropietario == null) ? 0 : numpropietario.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Propietarios))
			return false;
		Propietarios equalCheck = (Propietarios) obj;
		if ((numpropietario == null && equalCheck.numpropietario != null) || (numpropietario != null && equalCheck.numpropietario == null))
			return false;
		if (numpropietario != null && !numpropietario.equals(equalCheck.numpropietario))
			return false;
		return true;
	}
}
