package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Clientes;

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
 * DAO to manage Clientes entities.
 * 
 */
@Repository("ClientesDAO")
@Transactional
public class ClientesDAOImpl extends AbstractJpaDao<Clientes> implements
		ClientesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Clientes.class }));

	/**
	 * EntityManager injected by Spring for persistence unit orcl
	 *
	 */
	@PersistenceContext(unitName = "orcl")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ClientesDAOImpl
	 *
	 */
	public ClientesDAOImpl() {
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
	 * JPQL Query - findClientesByApellidoContaining
	 *
	 */
	@Transactional
	public Set<Clientes> findClientesByApellidoContaining(String apellido) throws DataAccessException {

		return findClientesByApellidoContaining(apellido, -1, -1);
	}

	/**
	 * JPQL Query - findClientesByApellidoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Clientes> findClientesByApellidoContaining(String apellido, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findClientesByApellidoContaining", startResult, maxRows, apellido);
		return new LinkedHashSet<Clientes>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllClientess
	 *
	 */
	@Transactional
	public Set<Clientes> findAllClientess() throws DataAccessException {

		return findAllClientess(-1, -1);
	}

	/**
	 * JPQL Query - findAllClientess
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Clientes> findAllClientess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllClientess", startResult, maxRows);
		return new LinkedHashSet<Clientes>(query.getResultList());
	}

	/**
	 * JPQL Query - findClientesByDireccion
	 *
	 */
	@Transactional
	public Set<Clientes> findClientesByDireccion(String direccion) throws DataAccessException {

		return findClientesByDireccion(direccion, -1, -1);
	}

	/**
	 * JPQL Query - findClientesByDireccion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Clientes> findClientesByDireccion(String direccion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findClientesByDireccion", startResult, maxRows, direccion);
		return new LinkedHashSet<Clientes>(query.getResultList());
	}

	/**
	 * JPQL Query - findClientesByNombreContaining
	 *
	 */
	@Transactional
	public Set<Clientes> findClientesByNombreContaining(String nombre) throws DataAccessException {

		return findClientesByNombreContaining(nombre, -1, -1);
	}

	/**
	 * JPQL Query - findClientesByNombreContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Clientes> findClientesByNombreContaining(String nombre, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findClientesByNombreContaining", startResult, maxRows, nombre);
		return new LinkedHashSet<Clientes>(query.getResultList());
	}

	/**
	 * JPQL Query - findClientesByApellido
	 *
	 */
	@Transactional
	public Set<Clientes> findClientesByApellido(String apellido) throws DataAccessException {

		return findClientesByApellido(apellido, -1, -1);
	}

	/**
	 * JPQL Query - findClientesByApellido
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Clientes> findClientesByApellido(String apellido, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findClientesByApellido", startResult, maxRows, apellido);
		return new LinkedHashSet<Clientes>(query.getResultList());
	}

	/**
	 * JPQL Query - findClientesByNumcliente
	 *
	 */
	@Transactional
	public Clientes findClientesByNumcliente(java.math.BigDecimal numcliente) throws DataAccessException {

		return findClientesByNumcliente(numcliente, -1, -1);
	}

	/**
	 * JPQL Query - findClientesByNumcliente
	 *
	 */

	@Transactional
	public Clientes findClientesByNumcliente(java.math.BigDecimal numcliente, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findClientesByNumcliente", startResult, maxRows, numcliente);
			return (com.duoc.inmobiliaria.domain.Clientes) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findClientesByNombre
	 *
	 */
	@Transactional
	public Set<Clientes> findClientesByNombre(String nombre) throws DataAccessException {

		return findClientesByNombre(nombre, -1, -1);
	}

	/**
	 * JPQL Query - findClientesByNombre
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Clientes> findClientesByNombre(String nombre, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findClientesByNombre", startResult, maxRows, nombre);
		return new LinkedHashSet<Clientes>(query.getResultList());
	}

	/**
	 * JPQL Query - findClientesByDireccionContaining
	 *
	 */
	@Transactional
	public Set<Clientes> findClientesByDireccionContaining(String direccion) throws DataAccessException {

		return findClientesByDireccionContaining(direccion, -1, -1);
	}

	/**
	 * JPQL Query - findClientesByDireccionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Clientes> findClientesByDireccionContaining(String direccion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findClientesByDireccionContaining", startResult, maxRows, direccion);
		return new LinkedHashSet<Clientes>(query.getResultList());
	}

	/**
	 * JPQL Query - findClientesByPrimaryKey
	 *
	 */
	@Transactional
	public Clientes findClientesByPrimaryKey(java.math.BigDecimal numcliente) throws DataAccessException {

		return findClientesByPrimaryKey(numcliente, -1, -1);
	}

	/**
	 * JPQL Query - findClientesByPrimaryKey
	 *
	 */

	@Transactional
	public Clientes findClientesByPrimaryKey(java.math.BigDecimal numcliente, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findClientesByPrimaryKey", startResult, maxRows, numcliente);
			return (com.duoc.inmobiliaria.domain.Clientes) query.getSingleResult();
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
	public boolean canBeMerged(Clientes entity) {
		return true;
	}
}
