package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Oficinas;

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
 * DAO to manage Oficinas entities.
 * 
 */
@Repository("OficinasDAO")
@Transactional
public class OficinasDAOImpl extends AbstractJpaDao<Oficinas> implements
		OficinasDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Oficinas.class }));

	/**
	 * EntityManager injected by Spring for persistence unit orcl
	 *
	 */
	@PersistenceContext(unitName = "orcl")
	private EntityManager entityManager;

	/**
	 * Instantiates a new OficinasDAOImpl
	 *
	 */
	public OficinasDAOImpl() {
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
	 * JPQL Query - findOficinasByNumoficina
	 *
	 */
	@Transactional
	public Oficinas findOficinasByNumoficina(java.math.BigDecimal numoficina) throws DataAccessException {

		return findOficinasByNumoficina(numoficina, -1, -1);
	}

	/**
	 * JPQL Query - findOficinasByNumoficina
	 *
	 */

	@Transactional
	public Oficinas findOficinasByNumoficina(java.math.BigDecimal numoficina, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOficinasByNumoficina", startResult, maxRows, numoficina);
			return (com.duoc.inmobiliaria.domain.Oficinas) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findOficinasByCodigopostal
	 *
	 */
	@Transactional
	public Set<Oficinas> findOficinasByCodigopostal(java.math.BigDecimal codigopostal) throws DataAccessException {

		return findOficinasByCodigopostal(codigopostal, -1, -1);
	}

	/**
	 * JPQL Query - findOficinasByCodigopostal
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Oficinas> findOficinasByCodigopostal(java.math.BigDecimal codigopostal, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOficinasByCodigopostal", startResult, maxRows, codigopostal);
		return new LinkedHashSet<Oficinas>(query.getResultList());
	}

	/**
	 * JPQL Query - findOficinasByCiudadContaining
	 *
	 */
	@Transactional
	public Set<Oficinas> findOficinasByCiudadContaining(String ciudad) throws DataAccessException {

		return findOficinasByCiudadContaining(ciudad, -1, -1);
	}

	/**
	 * JPQL Query - findOficinasByCiudadContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Oficinas> findOficinasByCiudadContaining(String ciudad, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOficinasByCiudadContaining", startResult, maxRows, ciudad);
		return new LinkedHashSet<Oficinas>(query.getResultList());
	}

	/**
	 * JPQL Query - findOficinasByCalle
	 *
	 */
	@Transactional
	public Set<Oficinas> findOficinasByCalle(String calle) throws DataAccessException {

		return findOficinasByCalle(calle, -1, -1);
	}

	/**
	 * JPQL Query - findOficinasByCalle
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Oficinas> findOficinasByCalle(String calle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOficinasByCalle", startResult, maxRows, calle);
		return new LinkedHashSet<Oficinas>(query.getResultList());
	}

	/**
	 * JPQL Query - findOficinasByCalleContaining
	 *
	 */
	@Transactional
	public Set<Oficinas> findOficinasByCalleContaining(String calle) throws DataAccessException {

		return findOficinasByCalleContaining(calle, -1, -1);
	}

	/**
	 * JPQL Query - findOficinasByCalleContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Oficinas> findOficinasByCalleContaining(String calle, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOficinasByCalleContaining", startResult, maxRows, calle);
		return new LinkedHashSet<Oficinas>(query.getResultList());
	}

	/**
	 * JPQL Query - findOficinasByCiudad
	 *
	 */
	@Transactional
	public Set<Oficinas> findOficinasByCiudad(String ciudad) throws DataAccessException {

		return findOficinasByCiudad(ciudad, -1, -1);
	}

	/**
	 * JPQL Query - findOficinasByCiudad
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Oficinas> findOficinasByCiudad(String ciudad, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findOficinasByCiudad", startResult, maxRows, ciudad);
		return new LinkedHashSet<Oficinas>(query.getResultList());
	}

	/**
	 * JPQL Query - findOficinasByPrimaryKey
	 *
	 */
	@Transactional
	public Oficinas findOficinasByPrimaryKey(java.math.BigDecimal numoficina) throws DataAccessException {

		return findOficinasByPrimaryKey(numoficina, -1, -1);
	}

	/**
	 * JPQL Query - findOficinasByPrimaryKey
	 *
	 */

	@Transactional
	public Oficinas findOficinasByPrimaryKey(java.math.BigDecimal numoficina, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findOficinasByPrimaryKey", startResult, maxRows, numoficina);
			return (com.duoc.inmobiliaria.domain.Oficinas) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllOficinass
	 *
	 */
	@Transactional
	public Set<Oficinas> findAllOficinass() throws DataAccessException {

		return findAllOficinass(-1, -1);
	}

	/**
	 * JPQL Query - findAllOficinass
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Oficinas> findAllOficinass(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllOficinass", startResult, maxRows);
		return new LinkedHashSet<Oficinas>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Oficinas entity) {
		return true;
	}
}
