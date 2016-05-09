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
		@NamedQuery(name = "findAllClientess", query = "select myClientes from Clientes myClientes"),
		@NamedQuery(name = "findClientesByApellido", query = "select myClientes from Clientes myClientes where myClientes.apellido = ?1"),
		@NamedQuery(name = "findClientesByApellidoContaining", query = "select myClientes from Clientes myClientes where myClientes.apellido like ?1"),
		@NamedQuery(name = "findClientesByDireccion", query = "select myClientes from Clientes myClientes where myClientes.direccion = ?1"),
		@NamedQuery(name = "findClientesByDireccionContaining", query = "select myClientes from Clientes myClientes where myClientes.direccion like ?1"),
		@NamedQuery(name = "findClientesByNombre", query = "select myClientes from Clientes myClientes where myClientes.nombre = ?1"),
		@NamedQuery(name = "findClientesByNombreContaining", query = "select myClientes from Clientes myClientes where myClientes.nombre like ?1"),
		@NamedQuery(name = "findClientesByNumcliente", query = "select myClientes from Clientes myClientes where myClientes.numcliente = ?1"),
		@NamedQuery(name = "findClientesByPrimaryKey", query = "select myClientes from Clientes myClientes where myClientes.numcliente = ?1") })
@Table(schema = "USUARIO", name = "CLIENTES")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "AplicacionInmobiliaria/com/duoc/inmobiliaria/domain", name = "Clientes")
@XmlRootElement(namespace = "AplicacionInmobiliaria/com/duoc/inmobiliaria/domain")
public class Clientes implements Serializable {
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
	@OneToMany(mappedBy = "clientes", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.duoc.inmobiliaria.domain.Visitas> visitases;
	/**
	 */
	@OneToMany(mappedBy = "clientes", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.duoc.inmobiliaria.domain.Arriendos> arriendoses;

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
	public Clientes() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Clientes that) {
		setNumcliente(that.getNumcliente());
		setNombre(that.getNombre());
		setApellido(that.getApellido());
		setDireccion(that.getDireccion());
		setVisitases(new java.util.LinkedHashSet<com.duoc.inmobiliaria.domain.Visitas>(that.getVisitases()));
		setArriendoses(new java.util.LinkedHashSet<com.duoc.inmobiliaria.domain.Arriendos>(that.getArriendoses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("numcliente=[").append(numcliente).append("] ");
		buffer.append("nombre=[").append(nombre).append("] ");
		buffer.append("apellido=[").append(apellido).append("] ");
		buffer.append("direccion=[").append(direccion).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((numcliente == null) ? 0 : numcliente.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Clientes))
			return false;
		Clientes equalCheck = (Clientes) obj;
		if ((numcliente == null && equalCheck.numcliente != null) || (numcliente != null && equalCheck.numcliente == null))
			return false;
		if (numcliente != null && !numcliente.equals(equalCheck.numcliente))
			return false;
		return true;
	}
}
