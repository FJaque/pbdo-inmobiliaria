package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Visitas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Visitas entities.
 * 
 */
@Repository("VisitasDAO")
@Transactional
public class VisitasDAOImpl extends AbstractJpaDao<Visitas> implements
		VisitasDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Visitas.class }));

	/**
	 * EntityManager injected by Spring for persistence unit orcl
	 *
	 */
	@PersistenceContext(unitName = "orcl")
	private EntityManager entityManager;

	/**
	 * Instantiates a new VisitasDAOImpl
	 *
	 */
	public VisitasDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findAllVisitass
	 *
	 */
	@Transactional
	public Set<Visitas> findAllVisitass() throws DataAccessException {

		return findAllVisitass(-1, -1);
	}

	/**
	 * JPQL Query - findAllVisitass
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Visitas> findAllVisitass(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllVisitass", startResult, maxRows);
		return new LinkedHashSet<Visitas>(query.getResultList());
	}

	/**
	 * JPQL Query - findVisitasByComentario
	 *
	 */
	@Transactional
	public Set<Visitas> findVisitasByComentario(String comentario) throws DataAccessException {

		return findVisitasByComentario(comentario, -1, -1);
	}

	/**
	 * JPQL Query - findVisitasByComentario
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Visitas> findVisitasByComentario(String comentario, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVisitasByComentario", startResult, maxRows, comentario);
		return new LinkedHashSet<Visitas>(query.getResultList());
	}

	/**
	 * JPQL Query - findVisitasByNumpropiedad
	 *
	 */
	@Transactional
	public Set<Visitas> findVisitasByNumpropiedad(java.math.BigDecimal numpropiedad) throws DataAccessException {

		return findVisitasByNumpropiedad(numpropiedad, -1, -1);
	}

	/**
	 * JPQL Query - findVisitasByNumpropiedad
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Visitas> findVisitasByNumpropiedad(java.math.BigDecimal numpropiedad, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVisitasByNumpropiedad", startResult, maxRows, numpropiedad);
		return new LinkedHashSet<Visitas>(query.getResultList());
	}

	/**
	 * JPQL Query - findVisitasByFecha
	 *
	 */
	@Transactional
	public Set<Visitas> findVisitasByFecha(java.util.Calendar fecha) throws DataAccessException {

		return findVisitasByFecha(fecha, -1, -1);
	}

	/**
	 * JPQL Query - findVisitasByFecha
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Visitas> findVisitasByFecha(java.util.Calendar fecha, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVisitasByFecha", startResult, maxRows, fecha);
		return new LinkedHashSet<Visitas>(query.getResultList());
	}

	/**
	 * JPQL Query - findVisitasByComentarioContaining
	 *
	 */
	@Transactional
	public Set<Visitas> findVisitasByComentarioContaining(String comentario) throws DataAccessException {

		return findVisitasByComentarioContaining(comentario, -1, -1);
	}

	/**
	 * JPQL Query - findVisitasByComentarioContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Visitas> findVisitasByComentarioContaining(String comentario, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVisitasByComentarioContaining", startResult, maxRows, comentario);
		return new LinkedHashSet<Visitas>(query.getResultList());
	}

	/**
	 * JPQL Query - findVisitasByNumcliente
	 *
	 */
	@Transactional
	public Set<Visitas> findVisitasByNumcliente(java.math.BigDecimal numcliente) throws DataAccessException {

		return findVisitasByNumcliente(numcliente, -1, -1);
	}

	/**
	 * JPQL Query - findVisitasByNumcliente
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Visitas> findVisitasByNumcliente(java.math.BigDecimal numcliente, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findVisitasByNumcliente", startResult, maxRows, numcliente);
		return new LinkedHashSet<Visitas>(query.getResultList());
	}

	/**
	 * JPQL Query - findVisitasByPrimaryKey
	 *
	 */
	@Transactional
	public Visitas findVisitasByPrimaryKey(java.math.BigDecimal numcliente, java.util.Calendar fecha, java.math.BigDecimal numpropiedad) throws DataAccessException {

		return findVisitasByPrimaryKey(numcliente, fecha, numpropiedad, -1, -1);
	}

	/**
	 * JPQL Query - findVisitasByPrimaryKey
	 *
	 */

	@Transactional
	public Visitas findVisitasByPrimaryKey(java.math.BigDecimal numcliente, java.util.Calendar fecha, java.math.BigDecimal numpropiedad, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findVisitasByPrimaryKey", startResult, maxRows, numcliente, fecha, numpropiedad);
			return (com.duoc.inmobiliaria.domain.Visitas) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Visitas entity) {
		return true;
	}
}
