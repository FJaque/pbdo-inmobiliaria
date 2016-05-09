package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Visitas;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Visitas entities.
 * 
 */
public interface VisitasDAO extends JpaDao<Visitas> {

	/**
	 * JPQL Query - findAllVisitass
	 *
	 */
	public Set<Visitas> findAllVisitass() throws DataAccessException;

	/**
	 * JPQL Query - findAllVisitass
	 *
	 */
	public Set<Visitas> findAllVisitass(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVisitasByComentario
	 *
	 */
	public Set<Visitas> findVisitasByComentario(String comentario) throws DataAccessException;

	/**
	 * JPQL Query - findVisitasByComentario
	 *
	 */
	public Set<Visitas> findVisitasByComentario(String comentario, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVisitasByNumpropiedad
	 *
	 */
	public Set<Visitas> findVisitasByNumpropiedad(java.math.BigDecimal numpropiedad) throws DataAccessException;

	/**
	 * JPQL Query - findVisitasByNumpropiedad
	 *
	 */
	public Set<Visitas> findVisitasByNumpropiedad(BigDecimal numpropiedad, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVisitasByFecha
	 *
	 */
	public Set<Visitas> findVisitasByFecha(java.util.Calendar fecha) throws DataAccessException;

	/**
	 * JPQL Query - findVisitasByFecha
	 *
	 */
	public Set<Visitas> findVisitasByFecha(Calendar fecha, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVisitasByComentarioContaining
	 *
	 */
	public Set<Visitas> findVisitasByComentarioContaining(String comentario_1) throws DataAccessException;

	/**
	 * JPQL Query - findVisitasByComentarioContaining
	 *
	 */
	public Set<Visitas> findVisitasByComentarioContaining(String comentario_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVisitasByNumcliente
	 *
	 */
	public Set<Visitas> findVisitasByNumcliente(java.math.BigDecimal numcliente) throws DataAccessException;

	/**
	 * JPQL Query - findVisitasByNumcliente
	 *
	 */
	public Set<Visitas> findVisitasByNumcliente(BigDecimal numcliente, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findVisitasByPrimaryKey
	 *
	 */
	public Visitas findVisitasByPrimaryKey(java.math.BigDecimal numcliente_1, java.util.Calendar fecha_1, java.math.BigDecimal numpropiedad_1) throws DataAccessException;

	/**
	 * JPQL Query - findVisitasByPrimaryKey
	 *
	 */
	public Visitas findVisitasByPrimaryKey(BigDecimal numcliente_1, Calendar fecha_1, BigDecimal numpropiedad_1, int startResult, int maxRows) throws DataAccessException;

}