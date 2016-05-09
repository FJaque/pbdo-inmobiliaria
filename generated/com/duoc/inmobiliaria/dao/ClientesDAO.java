package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Clientes;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Clientes entities.
 * 
 */
public interface ClientesDAO extends JpaDao<Clientes> {

	/**
	 * JPQL Query - findClientesByApellidoContaining
	 *
	 */
	public Set<Clientes> findClientesByApellidoContaining(String apellido) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByApellidoContaining
	 *
	 */
	public Set<Clientes> findClientesByApellidoContaining(String apellido, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllClientess
	 *
	 */
	public Set<Clientes> findAllClientess() throws DataAccessException;

	/**
	 * JPQL Query - findAllClientess
	 *
	 */
	public Set<Clientes> findAllClientess(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByDireccion
	 *
	 */
	public Set<Clientes> findClientesByDireccion(String direccion) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByDireccion
	 *
	 */
	public Set<Clientes> findClientesByDireccion(String direccion, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByNombreContaining
	 *
	 */
	public Set<Clientes> findClientesByNombreContaining(String nombre) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByNombreContaining
	 *
	 */
	public Set<Clientes> findClientesByNombreContaining(String nombre, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByApellido
	 *
	 */
	public Set<Clientes> findClientesByApellido(String apellido_1) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByApellido
	 *
	 */
	public Set<Clientes> findClientesByApellido(String apellido_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByNumcliente
	 *
	 */
	public Clientes findClientesByNumcliente(java.math.BigDecimal numcliente) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByNumcliente
	 *
	 */
	public Clientes findClientesByNumcliente(BigDecimal numcliente, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByNombre
	 *
	 */
	public Set<Clientes> findClientesByNombre(String nombre_1) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByNombre
	 *
	 */
	public Set<Clientes> findClientesByNombre(String nombre_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByDireccionContaining
	 *
	 */
	public Set<Clientes> findClientesByDireccionContaining(String direccion_1) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByDireccionContaining
	 *
	 */
	public Set<Clientes> findClientesByDireccionContaining(String direccion_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByPrimaryKey
	 *
	 */
	public Clientes findClientesByPrimaryKey(java.math.BigDecimal numcliente_1) throws DataAccessException;

	/**
	 * JPQL Query - findClientesByPrimaryKey
	 *
	 */
	public Clientes findClientesByPrimaryKey(BigDecimal numcliente_1, int startResult, int maxRows) throws DataAccessException;

}