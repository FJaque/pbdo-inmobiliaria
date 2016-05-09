package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Propietarios;

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
 * DAO to manage Propietarios entities.
 * 
 */
@Repository("PropietariosDAO")
@Transactional
public class PropietariosDAOImpl extends AbstractJpaDao<Propietarios> implements
		PropietariosDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Propietarios.class }));

	/**
	 * EntityManager injected by Spring for persistence unit orcl
	 *
	 */
	@PersistenceContext(unitName = "orcl")
	private EntityManager entityManager;

	/**
	 * Instantiates a new PropietariosDAOImpl
	 *
	 */
	public PropietariosDAOImpl() {
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
	 * JPQL Query - findAllPropietarioss
	 *
	 */
	@Transactional
	public Set<Propietarios> findAllPropietarioss() throws DataAccessException {

		return findAllPropietarioss(-1, -1);
	}

	/**
	 * JPQL Query - findAllPropietarioss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propietarios> findAllPropietarioss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllPropietarioss", startResult, maxRows);
		return new LinkedHashSet<Propietarios>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropietariosByDireccionContaining
	 *
	 */
	@Transactional
	public Set<Propietarios> findPropietariosByDireccionContaining(String direccion) throws DataAccessException {

		return findPropietariosByDireccionContaining(direccion, -1, -1);
	}

	/**
	 * JPQL Query - findPropietariosByDireccionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propietarios> findPropietariosByDireccionContaining(String direccion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropietariosByDireccionContaining", startResult, maxRows, direccion);
		return new LinkedHashSet<Propietarios>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropietariosByNumpropietario
	 *
	 */
	@Transactional
	public Propietarios findPropietariosByNumpropietario(java.math.BigDecimal numpropietario) throws DataAccessException {

		return findPropietariosByNumpropietario(numpropietario, -1, -1);
	}

	/**
	 * JPQL Query - findPropietariosByNumpropietario
	 *
	 */

	@Transactional
	public Propietarios findPropietariosByNumpropietario(java.math.BigDecimal numpropietario, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPropietariosByNumpropietario", startResult, maxRows, numpropietario);
			return (com.duoc.inmobiliaria.domain.Propietarios) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPropietariosByNombreContaining
	 *
	 */
	@Transactional
	public Set<Propietarios> findPropietariosByNombreContaining(String nombre) throws DataAccessException {

		return findPropietariosByNombreContaining(nombre, -1, -1);
	}

	/**
	 * JPQL Query - findPropietariosByNombreContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propietarios> findPropietariosByNombreContaining(String nombre, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropietariosByNombreContaining", startResult, maxRows, nombre);
		return new LinkedHashSet<Propietarios>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropietariosByPrimaryKey
	 *
	 */
	@Transactional
	public Propietarios findPropietariosByPrimaryKey(java.math.BigDecimal numpropietario) throws DataAccessException {

		return findPropietariosByPrimaryKey(numpropietario, -1, -1);
	}

	/**
	 * JPQL Query - findPropietariosByPrimaryKey
	 *
	 */

	@Transactional
	public Propietarios findPropietariosByPrimaryKey(java.math.BigDecimal numpropietario, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPropietariosByPrimaryKey", startResult, maxRows, numpropietario);
			return (com.duoc.inmobiliaria.domain.Propietarios) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findPropietariosByDireccion
	 *
	 */
	@Transactional
	public Set<Propietarios> findPropietariosByDireccion(String direccion) throws DataAccessException {

		return findPropietariosByDireccion(direccion, -1, -1);
	}

	/**
	 * JPQL Query - findPropietariosByDireccion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propietarios> findPropietariosByDireccion(String direccion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropietariosByDireccion", startResult, maxRows, direccion);
		return new LinkedHashSet<Propietarios>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropietariosByTelefonoContaining
	 *
	 */
	@Transactional
	public Set<Propietarios> findPropietariosByTelefonoContaining(String telefono) throws DataAccessException {

		return findPropietariosByTelefonoContaining(telefono, -1, -1);
	}

	/**
	 * JPQL Query - findPropietariosByTelefonoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propietarios> findPropietariosByTelefonoContaining(String telefono, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropietariosByTelefonoContaining", startResult, maxRows, telefono);
		return new LinkedHashSet<Propietarios>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropietariosByApellido
	 *
	 */
	@Transactional
	public Set<Propietarios> findPropietariosByApellido(String apellido) throws DataAccessException {

		return findPropietariosByApellido(apellido, -1, -1);
	}

	/**
	 * JPQL Query - findPropietariosByApellido
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propietarios> findPropietariosByApellido(String apellido, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropietariosByApellido", startResult, maxRows, apellido);
		return new LinkedHashSet<Propietarios>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropietariosByTelefono
	 *
	 */
	@Transactional
	public Set<Propietarios> findPropietariosByTelefono(String telefono) throws DataAccessException {

		return findPropietariosByTelefono(telefono, -1, -1);
	}

	/**
	 * JPQL Query - findPropietariosByTelefono
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propietarios> findPropietariosByTelefono(String telefono, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropietariosByTelefono", startResult, maxRows, telefono);
		return new LinkedHashSet<Propietarios>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropietariosByApellidoContaining
	 *
	 */
	@Transactional
	public Set<Propietarios> findPropietariosByApellidoContaining(String apellido) throws DataAccessException {

		return findPropietariosByApellidoContaining(apellido, -1, -1);
	}

	/**
	 * JPQL Query - findPropietariosByApellidoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propietarios> findPropietariosByApellidoContaining(String apellido, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropietariosByApellidoContaining", startResult, maxRows, apellido);
		return new LinkedHashSet<Propietarios>(query.getResultList());
	}

	/**
	 * JPQL Query - findPropietariosByNombre
	 *
	 */
	@Transactional
	public Set<Propietarios> findPropietariosByNombre(String nombre) throws DataAccessException {

		return findPropietariosByNombre(nombre, -1, -1);
	}

	/**
	 * JPQL Query - findPropietariosByNombre
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Propietarios> findPropietariosByNombre(String nombre, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPropietariosByNombre", startResult, maxRows, nombre);
		return new LinkedHashSet<Propietarios>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Propietarios entity) {
		return true;
	}
}
