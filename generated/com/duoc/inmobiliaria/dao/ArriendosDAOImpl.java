package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Arriendos;

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
 * DAO to manage Arriendos entities.
 * 
 */
@Repository("ArriendosDAO")
@Transactional
public class ArriendosDAOImpl extends AbstractJpaDao<Arriendos> implements
		ArriendosDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Arriendos.class }));

	/**
	 * EntityManager injected by Spring for persistence unit orcl
	 *
	 */
	@PersistenceContext(unitName = "orcl")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ArriendosDAOImpl
	 *
	 */
	public ArriendosDAOImpl() {
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
	 * JPQL Query - findArriendosByFormapago
	 *
	 */
	@Transactional
	public Set<Arriendos> findArriendosByFormapago(String formapago) throws DataAccessException {

		return findArriendosByFormapago(formapago, -1, -1);
	}

	/**
	 * JPQL Query - findArriendosByFormapago
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Arriendos> findArriendosByFormapago(String formapago, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArriendosByFormapago", startResult, maxRows, formapago);
		return new LinkedHashSet<Arriendos>(query.getResultList());
	}

	/**
	 * JPQL Query - findArriendosByFinrenta
	 *
	 */
	@Transactional
	public Set<Arriendos> findArriendosByFinrenta(java.util.Calendar finrenta) throws DataAccessException {

		return findArriendosByFinrenta(finrenta, -1, -1);
	}

	/**
	 * JPQL Query - findArriendosByFinrenta
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Arriendos> findArriendosByFinrenta(java.util.Calendar finrenta, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArriendosByFinrenta", startResult, maxRows, finrenta);
		return new LinkedHashSet<Arriendos>(query.getResultList());
	}

	/**
	 * JPQL Query - findArriendosByNumarriendo
	 *
	 */
	@Transactional
	public Arriendos findArriendosByNumarriendo(java.math.BigDecimal numarriendo) throws DataAccessException {

		return findArriendosByNumarriendo(numarriendo, -1, -1);
	}

	/**
	 * JPQL Query - findArriendosByNumarriendo
	 *
	 */

	@Transactional
	public Arriendos findArriendosByNumarriendo(java.math.BigDecimal numarriendo, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findArriendosByNumarriendo", startResult, maxRows, numarriendo);
			return (com.duoc.inmobiliaria.domain.Arriendos) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findArriendosByPrimaryKey
	 *
	 */
	@Transactional
	public Arriendos findArriendosByPrimaryKey(java.math.BigDecimal numarriendo) throws DataAccessException {

		return findArriendosByPrimaryKey(numarriendo, -1, -1);
	}

	/**
	 * JPQL Query - findArriendosByPrimaryKey
	 *
	 */

	@Transactional
	public Arriendos findArriendosByPrimaryKey(java.math.BigDecimal numarriendo, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findArriendosByPrimaryKey", startResult, maxRows, numarriendo);
			return (com.duoc.inmobiliaria.domain.Arriendos) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findArriendosByRenta
	 *
	 */
	@Transactional
	public Set<Arriendos> findArriendosByRenta(java.math.BigDecimal renta) throws DataAccessException {

		return findArriendosByRenta(renta, -1, -1);
	}

	/**
	 * JPQL Query - findArriendosByRenta
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Arriendos> findArriendosByRenta(java.math.BigDecimal renta, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArriendosByRenta", startResult, maxRows, renta);
		return new LinkedHashSet<Arriendos>(query.getResultList());
	}

	/**
	 * JPQL Query - findArriendosByMespago
	 *
	 */
	@Transactional
	public Set<Arriendos> findArriendosByMespago(java.util.Calendar mespago) throws DataAccessException {

		return findArriendosByMespago(mespago, -1, -1);
	}

	/**
	 * JPQL Query - findArriendosByMespago
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Arriendos> findArriendosByMespago(java.util.Calendar mespago, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArriendosByMespago", startResult, maxRows, mespago);
		return new LinkedHashSet<Arriendos>(query.getResultList());
	}

	/**
	 * JPQL Query - findArriendosByIniciorenta
	 *
	 */
	@Transactional
	public Set<Arriendos> findArriendosByIniciorenta(java.util.Calendar iniciorenta) throws DataAccessException {

		return findArriendosByIniciorenta(iniciorenta, -1, -1);
	}

	/**
	 * JPQL Query - findArriendosByIniciorenta
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Arriendos> findArriendosByIniciorenta(java.util.Calendar iniciorenta, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArriendosByIniciorenta", startResult, maxRows, iniciorenta);
		return new LinkedHashSet<Arriendos>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllArriendoss
	 *
	 */
	@Transactional
	public Set<Arriendos> findAllArriendoss() throws DataAccessException {

		return findAllArriendoss(-1, -1);
	}

	/**
	 * JPQL Query - findAllArriendoss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Arriendos> findAllArriendoss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllArriendoss", startResult, maxRows);
		return new LinkedHashSet<Arriendos>(query.getResultList());
	}

	/**
	 * JPQL Query - findArriendosByPagado
	 *
	 */
	@Transactional
	public Set<Arriendos> findArriendosByPagado(java.math.BigDecimal pagado) throws DataAccessException {

		return findArriendosByPagado(pagado, -1, -1);
	}

	/**
	 * JPQL Query - findArriendosByPagado
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Arriendos> findArriendosByPagado(java.math.BigDecimal pagado, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArriendosByPagado", startResult, maxRows, pagado);
		return new LinkedHashSet<Arriendos>(query.getResultList());
	}

	/**
	 * JPQL Query - findArriendosByFormapagoContaining
	 *
	 */
	@Transactional
	public Set<Arriendos> findArriendosByFormapagoContaining(String formapago) throws DataAccessException {

		return findArriendosByFormapagoContaining(formapago, -1, -1);
	}

	/**
	 * JPQL Query - findArriendosByFormapagoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Arriendos> findArriendosByFormapagoContaining(String formapago, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findArriendosByFormapagoContaining", startResult, maxRows, formapago);
		return new LinkedHashSet<Arriendos>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Arriendos entity) {
		return true;
	}
}
