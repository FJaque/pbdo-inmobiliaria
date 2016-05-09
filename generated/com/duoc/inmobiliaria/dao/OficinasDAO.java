package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Oficinas;

import java.math.BigDecimal;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Oficinas entities.
 * 
 */
public interface OficinasDAO extends JpaDao<Oficinas> {

	/**
	 * JPQL Query - findOficinasByNumoficina
	 *
	 */
	public Oficinas findOficinasByNumoficina(java.math.BigDecimal numoficina) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByNumoficina
	 *
	 */
	public Oficinas findOficinasByNumoficina(BigDecimal numoficina, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByCodigopostal
	 *
	 */
	public Set<Oficinas> findOficinasByCodigopostal(java.math.BigDecimal codigopostal) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByCodigopostal
	 *
	 */
	public Set<Oficinas> findOficinasByCodigopostal(BigDecimal codigopostal, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByCiudadContaining
	 *
	 */
	public Set<Oficinas> findOficinasByCiudadContaining(String ciudad) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByCiudadContaining
	 *
	 */
	public Set<Oficinas> findOficinasByCiudadContaining(String ciudad, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByCalle
	 *
	 */
	public Set<Oficinas> findOficinasByCalle(String calle) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByCalle
	 *
	 */
	public Set<Oficinas> findOficinasByCalle(String calle, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByCalleContaining
	 *
	 */
	public Set<Oficinas> findOficinasByCalleContaining(String calle_1) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByCalleContaining
	 *
	 */
	public Set<Oficinas> findOficinasByCalleContaining(String calle_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByCiudad
	 *
	 */
	public Set<Oficinas> findOficinasByCiudad(String ciudad_1) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByCiudad
	 *
	 */
	public Set<Oficinas> findOficinasByCiudad(String ciudad_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByPrimaryKey
	 *
	 */
	public Oficinas findOficinasByPrimaryKey(java.math.BigDecimal numoficina_1) throws DataAccessException;

	/**
	 * JPQL Query - findOficinasByPrimaryKey
	 *
	 */
	public Oficinas findOficinasByPrimaryKey(BigDecimal numoficina_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllOficinass
	 *
	 */
	public Set<Oficinas> findAllOficinass() throws DataAccessException;

	/**
	 * JPQL Query - findAllOficinass
	 *
	 */
	public Set<Oficinas> findAllOficinass(int startResult, int maxRows) throws DataAccessException;

}