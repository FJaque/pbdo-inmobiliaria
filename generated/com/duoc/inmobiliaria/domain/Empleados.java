package com.duoc.inmobiliaria.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.math.BigDecimal;

import java.util.Calendar;
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
		@NamedQuery(name = "findAllEmpleadoss", query = "select myEmpleados from Empleados myEmpleados"),
		@NamedQuery(name = "findEmpleadosByApellido", query = "select myEmpleados from Empleados myEmpleados where myEmpleados.apellido = ?1"),
		@NamedQuery(name = "findEmpleadosByApellidoContaining", query = "select myEmpleados from Empleados myEmpleados where myEmpleados.apellido like ?1"),
		@NamedQuery(name = "findEmpleadosByCargo", query = "select myEmpleados from Empleados myEmpleados where myEmpleados.cargo = ?1"),
		@NamedQuery(name = "findEmpleadosByCargoContaining", query = "select myEmpleados from Empleados myEmpleados where myEmpleados.cargo like ?1"),
		@NamedQuery(name = "findEmpleadosByFechanac", query = "select myEmpleados from Empleados myEmpleados where myEmpleados.fechanac = ?1"),
		@NamedQuery(name = "findEmpleadosByNombre", query = "select myEmpleados from Empleados myEmpleados where myEmpleados.nombre = ?1"),
		@NamedQuery(name = "findEmpleadosByNombreContaining", query = "select myEmpleados from Empleados myEmpleados where myEmpleados.nombre like ?1"),
		@NamedQuery(name = "findEmpleadosByNumempleado", query = "select myEmpleados from Empleados myEmpleados where myEmpleados.numempleado = ?1"),
		@NamedQuery(name = "findEmpleadosByPrimaryKey", query = "select myEmpleados from Empleados myEmpleados where myEmpleados.numempleado = ?1"),
		@NamedQuery(name = "findEmpleadosBySalario", query = "select myEmpleados from Empleados myEmpleados where myEmpleados.salario = ?1"),
		@NamedQuery(name = "findEmpleadosBySexo", query = "select myEmpleados from Empleados myEmpleados where myEmpleados.sexo = ?1"),
		@NamedQuery(name = "findEmpleadosBySexoContaining", query = "select myEmpleados from Empleados myEmpleados where myEmpleados.sexo like ?1") })
@Table(schema = "USUARIO", name = "EMPLEADOS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "AplicacionInmobiliaria/com/duoc/inmobiliaria/domain", name = "Empleados")
@XmlRootElement(namespace = "AplicacionInmobiliaria/com/duoc/inmobiliaria/domain")
public class Empleados implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "NUMEMPLEADO", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	BigDecimal numempleado;
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

	@Column(name = "CARGO", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String cargo;
	/**
	 */

	@Column(name = "SEXO", length = 1, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String sexo;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHANAC", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar fechanac;
	/**
	 */

	@Column(name = "SALARIO", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal salario;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "NUMOFICINA", referencedColumnName = "NUMOFICINA", nullable = false) })
	@XmlTransient
	Oficinas oficinas;
	/**
	 */
	@OneToMany(mappedBy = "empleados", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<com.duoc.inmobiliaria.domain.Propiedades> propiedadeses;

	/**
	 */
	public void setNumempleado(BigDecimal numempleado) {
		this.numempleado = numempleado;
	}

	/**
	 */
	public BigDecimal getNumempleado() {
		return this.numempleado;
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
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 */
	public String getCargo() {
		return this.cargo;
	}

	/**
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 */
	public String getSexo() {
		return this.sexo;
	}

	/**
	 */
	public void setFechanac(Calendar fechanac) {
		this.fechanac = fechanac;
	}

	/**
	 */
	public Calendar getFechanac() {
		return this.fechanac;
	}

	/**
	 */
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	/**
	 */
	public BigDecimal getSalario() {
		return this.salario;
	}

	/**
	 */
	public void setOficinas(Oficinas oficinas) {
		this.oficinas = oficinas;
	}

	/**
	 */
	public Oficinas getOficinas() {
		return oficinas;
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
	public Empleados() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Empleados that) {
		setNumempleado(that.getNumempleado());
		setNombre(that.getNombre());
		setApellido(that.getApellido());
		setCargo(that.getCargo());
		setSexo(that.getSexo());
		setFechanac(that.getFechanac());
		setSalario(that.getSalario());
		setOficinas(that.getOficinas());
		setPropiedadeses(new java.util.LinkedHashSet<com.duoc.inmobiliaria.domain.Propiedades>(that.getPropiedadeses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("numempleado=[").append(numempleado).append("] ");
		buffer.append("nombre=[").append(nombre).append("] ");
		buffer.append("apellido=[").append(apellido).append("] ");
		buffer.append("cargo=[").append(cargo).append("] ");
		buffer.append("sexo=[").append(sexo).append("] ");
		buffer.append("fechanac=[").append(fechanac).append("] ");
		buffer.append("salario=[").append(salario).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((numempleado == null) ? 0 : numempleado.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Empleados))
			return false;
		Empleados equalCheck = (Empleados) obj;
		if ((numempleado == null && equalCheck.numempleado != null) || (numempleado != null && equalCheck.numempleado == null))
			return false;
		if (numempleado != null && !numempleado.equals(equalCheck.numempleado))
			return false;
		return true;
	}
}
