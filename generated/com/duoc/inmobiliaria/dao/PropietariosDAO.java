package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Propietarios;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Propietarios entities.
 * 
 */
public interface PropietariosDAO extends JpaDao<Propietarios> {

	/**
	 * JPQL Query - findAllPropietarioss
	 *
	 */
	public Set<Propietarios> findAllPropietarioss() throws DataAccessException;

	/**
	 * JPQL Query - findAllPropietarioss
	 *
	 */
	public Set<Propietarios> findAllPropietarioss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByDireccionContaining
	 *
	 */
	public Set<Propietarios> findPropietariosByDireccionContaining(String direccion) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByDireccionContaining
	 *
	 */
	public Set<Propietarios> findPropietariosByDireccionContaining(String direccion, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByNumpropietario
	 *
	 */
	public Propietarios findPropietariosByNumpropietario(java.math.BigDecimal numpropietario) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByNumpropietario
	 *
	 */
	public Propietarios findPropietariosByNumpropietario(BigDecimal numpropietario, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByNombreContaining
	 *
	 */
	public Set<Propietarios> findPropietariosByNombreContaining(String nombre) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByNombreContaining
	 *
	 */
	public Set<Propietarios> findPropietariosByNombreContaining(String nombre, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByPrimaryKey
	 *
	 */
	public Propietarios findPropietariosByPrimaryKey(java.math.BigDecimal numpropietario_1) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByPrimaryKey
	 *
	 */
	public Propietarios findPropietariosByPrimaryKey(BigDecimal numpropietario_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByDireccion
	 *
	 */
	public Set<Propietarios> findPropietariosByDireccion(String direccion_1) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByDireccion
	 *
	 */
	public Set<Propietarios> findPropietariosByDireccion(String direccion_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByTelefonoContaining
	 *
	 */
	public Set<Propietarios> findPropietariosByTelefonoContaining(String telefono) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByTelefonoContaining
	 *
	 */
	public Set<Propietarios> findPropietariosByTelefonoContaining(String telefono, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByApellido
	 *
	 */
	public Set<Propietarios> findPropietariosByApellido(String apellido) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByApellido
	 *
	 */
	public Set<Propietarios> findPropietariosByApellido(String apellido, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByTelefono
	 *
	 */
	public Set<Propietarios> findPropietariosByTelefono(String telefono_1) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByTelefono
	 *
	 */
	public Set<Propietarios> findPropietariosByTelefono(String telefono_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByApellidoContaining
	 *
	 */
	public Set<Propietarios> findPropietariosByApellidoContaining(String apellido_1) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByApellidoContaining
	 *
	 */
	public Set<Propietarios> findPropietariosByApellidoContaining(String apellido_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByNombre
	 *
	 */
	public Set<Propietarios> findPropietariosByNombre(String nombre_1) throws DataAccessException;

	/**
	 * JPQL Query - findPropietariosByNombre
	 *
	 */
	public Set<Propietarios> findPropietariosByNombre(String nombre_1, int startResult, int maxRows) throws DataAccessException;

}