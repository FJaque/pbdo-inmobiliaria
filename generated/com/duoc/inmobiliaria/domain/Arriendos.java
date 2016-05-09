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

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllArriendoss", query = "select myArriendos from Arriendos myArriendos"),
		@NamedQuery(name = "findArriendosByFinrenta", query = "select myArriendos from Arriendos myArriendos where myArriendos.finrenta = ?1"),
		@NamedQuery(name = "findArriendosByFormapago", query = "select myArriendos from Arriendos myArriendos where myArriendos.formapago = ?1"),
		@NamedQuery(name = "findArriendosByFormapagoContaining", query = "select myArriendos from Arriendos myArriendos where myArriendos.formapago like ?1"),
		@NamedQuery(name = "findArriendosByIniciorenta", query = "select myArriendos from Arriendos myArriendos where myArriendos.iniciorenta = ?1"),
		@NamedQuery(name = "findArriendosByMespago", query = "select myArriendos from Arriendos myArriendos where myArriendos.mespago = ?1"),
		@NamedQuery(name = "findArriendosByNumarriendo", query = "select myArriendos from Arriendos myArriendos where myArriendos.numarriendo = ?1"),
		@NamedQuery(name = "findArriendosByPagado", query = "select myArriendos from Arriendos myArriendos where myArriendos.pagado = ?1"),
		@NamedQuery(name = "findArriendosByPrimaryKey", query = "select myArriendos from Arriendos myArriendos where myArriendos.numarriendo = ?1"),
		@NamedQuery(name = "findArriendosByRenta", query = "select myArriendos from Arriendos myArriendos where myArriendos.renta = ?1") })
@Table(schema = "USUARIO", name = "ARRIENDOS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "AplicacionInmobiliaria/com/duoc/inmobiliaria/domain", name = "Arriendos")
public class Arriendos implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "NUMARRIENDO", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	BigDecimal numarriendo;
	/**
	 */

	@Column(name = "RENTA", scale = 2, precision = 8, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal renta;
	/**
	 */

	@Column(name = "FORMAPAGO", length = 50, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String formapago;
	/**
	 */

	@Column(name = "PAGADO", scale = 2, precision = 1, nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal pagado;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INICIORENTA", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar iniciorenta;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FINRENTA", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar finrenta;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MESPAGO", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar mespago;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "NUMPROPIEDAD", referencedColumnName = "NUMPROPIEDAD", nullable = false) })
	@XmlTransient
	Propiedades propiedades;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "NUMCLIENTE", referencedColumnName = "NUMCLIENTE", nullable = false) })
	@XmlTransient
	Clientes clientes;

	/**
	 */
	public void setNumarriendo(BigDecimal numarriendo) {
		this.numarriendo = numarriendo;
	}

	/**
	 */
	public BigDecimal getNumarriendo() {
		return this.numarriendo;
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
	public void setFormapago(String formapago) {
		this.formapago = formapago;
	}

	/**
	 */
	public String getFormapago() {
		return this.formapago;
	}

	/**
	 */
	public void setPagado(BigDecimal pagado) {
		this.pagado = pagado;
	}

	/**
	 */
	public BigDecimal getPagado() {
		return this.pagado;
	}

	/**
	 */
	public void setIniciorenta(Calendar iniciorenta) {
		this.iniciorenta = iniciorenta;
	}

	/**
	 */
	public Calendar getIniciorenta() {
		return this.iniciorenta;
	}

	/**
	 */
	public void setFinrenta(Calendar finrenta) {
		this.finrenta = finrenta;
	}

	/**
	 */
	public Calendar getFinrenta() {
		return this.finrenta;
	}

	/**
	 */
	public void setMespago(Calendar mespago) {
		this.mespago = mespago;
	}

	/**
	 */
	public Calendar getMespago() {
		return this.mespago;
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
	public Arriendos() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Arriendos that) {
		setNumarriendo(that.getNumarriendo());
		setRenta(that.getRenta());
		setFormapago(that.getFormapago());
		setPagado(that.getPagado());
		setIniciorenta(that.getIniciorenta());
		setFinrenta(that.getFinrenta());
		setMespago(that.getMespago());
		setPropiedades(that.getPropiedades());
		setClientes(that.getClientes());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("numarriendo=[").append(numarriendo).append("] ");
		buffer.append("renta=[").append(renta).append("] ");
		buffer.append("formapago=[").append(formapago).append("] ");
		buffer.append("pagado=[").append(pagado).append("] ");
		buffer.append("iniciorenta=[").append(iniciorenta).append("] ");
		buffer.append("finrenta=[").append(finrenta).append("] ");
		buffer.append("mespago=[").append(mespago).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((numarriendo == null) ? 0 : numarriendo.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Arriendos))
			return false;
		Arriendos equalCheck = (Arriendos) obj;
		if ((numarriendo == null && equalCheck.numarriendo != null) || (numarriendo != null && equalCheck.numarriendo == null))
			return false;
		if (numarriendo != null && !numarriendo.equals(equalCheck.numarriendo))
			return false;
		return true;
	}
}
