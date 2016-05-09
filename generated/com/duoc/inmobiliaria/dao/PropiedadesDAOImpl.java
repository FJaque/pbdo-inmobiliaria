package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Propiedades;

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
 * DAO to manage Propiedades entities.
 * 
 */
@Repository("PropiedadesDAO")
@Transactional
public class PropiedadesDAOImpl extends AbstractJpaDao<Propiedades> implements
		PropiedadesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Propiedades.class }));

	/**
	 * EntityManager injected by Spring for persistence unit orcl
	 *
	 */
	@PersistenceContext(unitName = "orcl")
	private EntityManager entityManager;

	/**
	 * Instantiates a new PropiedadesDAOImpl
	 *
	 */
	public PropiedadesDAOImpl() {
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
	 * JPQL Query - findPropiedadesByCiudadContaining
	 *
	 */
	@Transactional
	public Set<Propiedades> findPropiedadesByCiudadContaining(String ciudad) throws DataAccessException {

		return findPropiedadesByCiudadContaining(ciudad, -1, -1);
	}

	/**
	 * JPQL Query - findPropiedadesByCiudadContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propiedades> findPropiedadesByCiudadContaining(String ciudad, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropiedadesByCiudadContaining", startResult, maxRows, ciudad);
		return new LinkedHashSet<Propiedades>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropiedadesByHabitaciones
	 *
	 */
	@Transactional
	public Set<Propiedades> findPropiedadesByHabitaciones(java.math.BigDecimal habitaciones) throws DataAccessException {

		return findPropiedadesByHabitaciones(habitaciones, -1, -1);
	}

	/**
	 * JPQL Query - findPropiedadesByHabitaciones
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propiedades> findPropiedadesByHabitaciones(java.math.BigDecimal habitaciones, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropiedadesByHabitaciones", startResult, maxRows, habitaciones);
		return new LinkedHashSet<Propiedades>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllPropiedadess
	 *
	 */
	@Transactional
	public Set<Propiedades> findAllPropiedadess() throws DataAccessException {

		return findAllPropiedadess(-1, -1);
	}

	/**
	 * JPQL Query - findAllPropiedadess
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propiedades> findAllPropiedadess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllPropiedadess", startResult, maxRows);
		return new LinkedHashSet<Propiedades>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropiedadesByTipoContaining
	 *
	 */
	@Transactional
	public Set<Propiedades> findPropiedadesByTipoContaining(String tipo) throws DataAccessException {

		return findPropiedadesByTipoContaining(tipo, -1, -1);
	}

	/**
	 * JPQL Query - findPropiedadesByTipoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propiedades> findPropiedadesByTipoContaining(String tipo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropiedadesByTipoContaining", startResult, maxRows, tipo);
		return new LinkedHashSet<Propiedades>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropiedadesByCodigopostal
	 *
	 */
	@Transactional
	public Set<Propiedades> findPropiedadesByCodigopostal(java.math.BigDecimal codigopostal) throws DataAccessException {

		return findPropiedadesByCodigopostal(codigopostal, -1, -1);
	}

	/**
	 * JPQL Query - findPropiedadesByCodigopostal
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propiedades> findPropiedadesByCodigopostal(java.math.BigDecimal codigopostal, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropiedadesByCodigopostal", startResult, maxRows, codigopostal);
		return new LinkedHashSet<Propiedades>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropiedadesByRenta
	 *
	 */
	@Transactional
	public Set<Propiedades> findPropiedadesByRenta(java.math.BigDecimal renta) throws DataAccessException {

		return findPropiedadesByRenta(renta, -1, -1);
	}

	/**
	 * JPQL Query - findPropiedadesByRenta
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propiedades> findPropiedadesByRenta(java.math.BigDecimal renta, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropiedadesByRenta", startResult, maxRows, renta);
		return new LinkedHashSet<Propiedades>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropiedadesByCalleContaining
	 *
	 */
	@Transactional
	public Set<Propiedades> findPropiedadesByCalleContaining(String calle) throws DataAccessException {

		return findPropiedadesByCalleContaining(calle, -1, -1);
	}

	/**
	 * JPQL Query - findPropiedadesByCalleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propiedades> findPropiedadesByCalleContaining(String calle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropiedadesByCalleContaining", startResult, maxRows, calle);
		return new LinkedHashSet<Propiedades>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropiedadesByNumpropiedad
	 *
	 */
	@Transactional
	public Propiedades findPropiedadesByNumpropiedad(java.math.BigDecimal numpropiedad) throws DataAccessException {

		return findPropiedadesByNumpropiedad(numpropiedad, -1, -1);
	}

	/**
	 * JPQL Query - findPropiedadesByNumpropiedad
	 *
	 */

	@Transactional
	public Propiedades findPropiedadesByNumpropiedad(java.math.BigDecimal numpropiedad, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPropiedadesByNumpropiedad", startResult, maxRows, numpropiedad);
			return (com.duoc.inmobiliaria.domain.Propiedades) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPropiedadesByCiudad
	 *
	 */
	@Transactional
	public Set<Propiedades> findPropiedadesByCiudad(String ciudad) throws DataAccessException {

		return findPropiedadesByCiudad(ciudad, -1, -1);
	}

	/**
	 * JPQL Query - findPropiedadesByCiudad
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propiedades> findPropiedadesByCiudad(String ciudad, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropiedadesByCiudad", startResult, maxRows, ciudad);
		return new LinkedHashSet<Propiedades>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropiedadesByTipo
	 *
	 */
	@Transactional
	public Set<Propiedades> findPropiedadesByTipo(String tipo) throws DataAccessException {

		return findPropiedadesByTipo(tipo, -1, -1);
	}

	/**
	 * JPQL Query - findPropiedadesByTipo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propiedades> findPropiedadesByTipo(String tipo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropiedadesByTipo", startResult, maxRows, tipo);
		return new LinkedHashSet<Propiedades>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropiedadesByCalle
	 *
	 */
	@Transactional
	public Set<Propiedades> findPropiedadesByCalle(String calle) throws DataAccessException {

		return findPropiedadesByCalle(calle, -1, -1);
	}

	/**
	 * JPQL Query - findPropiedadesByCalle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propiedades> findPropiedadesByCalle(String calle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropiedadesByCalle", startResult, maxRows, calle);
		return new LinkedHashSet<Propiedades>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropiedadesByPrimaryKey
	 *
	 */
	@Transactional
	public Propiedades findPropiedadesByPrimaryKey(java.math.BigDecimal numpropiedad) throws DataAccessException {

		return findPropiedadesByPrimaryKey(numpropiedad, -1, -1);
	}

	/**
	 * JPQL Query - findPropiedadesByPrimaryKey
	 *
	 */

	@Transactional
	public Propiedades findPropiedadesByPrimaryKey(java.math.BigDecimal numpropiedad, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPropiedadesByPrimaryKey", startResult, maxRows, numpropiedad);
			return (com.duoc.inmobiliaria.domain.Propiedades) query.getSingleResult();
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
	public boolean canBeMerged(Propiedades entity) {
		return true;
	}
}
