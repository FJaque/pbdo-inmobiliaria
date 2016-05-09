package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Propiedades;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Propiedades entities.
 * 
 */
public interface PropiedadesDAO extends JpaDao<Propiedades> {

	/**
	 * JPQL Query - findPropiedadesByCiudadContaining
	 *
	 */
	public Set<Propiedades> findPropiedadesByCiudadContaining(String ciudad) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByCiudadContaining
	 *
	 */
	public Set<Propiedades> findPropiedadesByCiudadContaining(String ciudad, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByHabitaciones
	 *
	 */
	public Set<Propiedades> findPropiedadesByHabitaciones(java.math.BigDecimal habitaciones) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByHabitaciones
	 *
	 */
	public Set<Propiedades> findPropiedadesByHabitaciones(BigDecimal habitaciones, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllPropiedadess
	 *
	 */
	public Set<Propiedades> findAllPropiedadess() throws DataAccessException;

	/**
	 * JPQL Query - findAllPropiedadess
	 *
	 */
	public Set<Propiedades> findAllPropiedadess(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByTipoContaining
	 *
	 */
	public Set<Propiedades> findPropiedadesByTipoContaining(String tipo) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByTipoContaining
	 *
	 */
	public Set<Propiedades> findPropiedadesByTipoContaining(String tipo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByCodigopostal
	 *
	 */
	public Set<Propiedades> findPropiedadesByCodigopostal(java.math.BigDecimal codigopostal) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByCodigopostal
	 *
	 */
	public Set<Propiedades> findPropiedadesByCodigopostal(BigDecimal codigopostal, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByRenta
	 *
	 */
	public Set<Propiedades> findPropiedadesByRenta(java.math.BigDecimal renta) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByRenta
	 *
	 */
	public Set<Propiedades> findPropiedadesByRenta(BigDecimal renta, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByCalleContaining
	 *
	 */
	public Set<Propiedades> findPropiedadesByCalleContaining(String calle) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByCalleContaining
	 *
	 */
	public Set<Propiedades> findPropiedadesByCalleContaining(String calle, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByNumpropiedad
	 *
	 */
	public Propiedades findPropiedadesByNumpropiedad(java.math.BigDecimal numpropiedad) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByNumpropiedad
	 *
	 */
	public Propiedades findPropiedadesByNumpropiedad(BigDecimal numpropiedad, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByCiudad
	 *
	 */
	public Set<Propiedades> findPropiedadesByCiudad(String ciudad_1) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByCiudad
	 *
	 */
	public Set<Propiedades> findPropiedadesByCiudad(String ciudad_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByTipo
	 *
	 */
	public Set<Propiedades> findPropiedadesByTipo(String tipo_1) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByTipo
	 *
	 */
	public Set<Propiedades> findPropiedadesByTipo(String tipo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByCalle
	 *
	 */
	public Set<Propiedades> findPropiedadesByCalle(String calle_1) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByCalle
	 *
	 */
	public Set<Propiedades> findPropiedadesByCalle(String calle_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByPrimaryKey
	 *
	 */
	public Propiedades findPropiedadesByPrimaryKey(java.math.BigDecimal numpropiedad_1) throws DataAccessException;

	/**
	 * JPQL Query - findPropiedadesByPrimaryKey
	 *
	 */
	public Propiedades findPropiedadesByPrimaryKey(BigDecimal numpropiedad_1, int startResult, int maxRows) throws DataAccessException;

}