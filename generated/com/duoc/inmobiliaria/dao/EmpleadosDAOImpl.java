package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Empleados;

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
 * DAO to manage Empleados entities.
 * 
 */
@Repository("EmpleadosDAO")
@Transactional
public class EmpleadosDAOImpl extends AbstractJpaDao<Empleados> implements
		EmpleadosDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Empleados.class }));

	/**
	 * EntityManager injected by Spring for persistence unit orcl
	 *
	 */
	@PersistenceContext(unitName = "orcl")
	private EntityManager entityManager;

	/**
	 * Instantiates a new EmpleadosDAOImpl
	 *
	 */
	public EmpleadosDAOImpl() {
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
	 * JPQL Query - findEmpleadosByApellido
	 *
	 */
	@Transactional
	public Set<Empleados> findEmpleadosByApellido(String apellido) throws DataAccessException {

		return findEmpleadosByApellido(apellido, -1, -1);
	}

	/**
	 * JPQL Query - findEmpleadosByApellido
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Empleados> findEmpleadosByApellido(String apellido, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEmpleadosByApellido", startResult, maxRows, apellido);
		return new LinkedHashSet<Empleados>(query.getResultList());
	}

	/**
	 * JPQL Query - findEmpleadosByPrimaryKey
	 *
	 */
	@Transactional
	public Empleados findEmpleadosByPrimaryKey(java.math.BigDecimal numempleado) throws DataAccessException {

		return findEmpleadosByPrimaryKey(numempleado, -1, -1);
	}

	/**
	 * JPQL Query - findEmpleadosByPrimaryKey
	 *
	 */

	@Transactional
	public Empleados findEmpleadosByPrimaryKey(java.math.BigDecimal numempleado, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findEmpleadosByPrimaryKey", startResult, maxRows, numempleado);
			return (com.duoc.inmobiliaria.domain.Empleados) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findEmpleadosByNumempleado
	 *
	 */
	@Transactional
	public Empleados findEmpleadosByNumempleado(java.math.BigDecimal numempleado) throws DataAccessException {

		return findEmpleadosByNumempleado(numempleado, -1, -1);
	}

	/**
	 * JPQL Query - findEmpleadosByNumempleado
	 *
	 */

	@Transactional
	public Empleados findEmpleadosByNumempleado(java.math.BigDecimal numempleado, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findEmpleadosByNumempleado", startResult, maxRows, numempleado);
			return (com.duoc.inmobiliaria.domain.Empleados) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findEmpleadosBySexo
	 *
	 */
	@Transactional
	public Set<Empleados> findEmpleadosBySexo(String sexo) throws DataAccessException {

		return findEmpleadosBySexo(sexo, -1, -1);
	}

	/**
	 * JPQL Query - findEmpleadosBySexo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Empleados> findEmpleadosBySexo(String sexo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEmpleadosBySexo", startResult, maxRows, sexo);
		return new LinkedHashSet<Empleados>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllEmpleadoss
	 *
	 */
	@Transactional
	public Set<Empleados> findAllEmpleadoss() throws DataAccessException {

		return findAllEmpleadoss(-1, -1);
	}

	/**
	 * JPQL Query - findAllEmpleadoss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Empleados> findAllEmpleadoss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllEmpleadoss", startResult, maxRows);
		return new LinkedHashSet<Empleados>(query.getResultList());
	}

	/**
	 * JPQL Query - findEmpleadosByApellidoContaining
	 *
	 */
	@Transactional
	public Set<Empleados> findEmpleadosByApellidoContaining(String apellido) throws DataAccessException {

		return findEmpleadosByApellidoContaining(apellido, -1, -1);
	}

	/**
	 * JPQL Query - findEmpleadosByApellidoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Empleados> findEmpleadosByApellidoContaining(String apellido, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEmpleadosByApellidoContaining", startResult, maxRows, apellido);
		return new LinkedHashSet<Empleados>(query.getResultList());
	}

	/**
	 * JPQL Query - findEmpleadosBySalario
	 *
	 */
	@Transactional
	public Set<Empleados> findEmpleadosBySalario(java.math.BigDecimal salario) throws DataAccessException {

		return findEmpleadosBySalario(salario, -1, -1);
	}

	/**
	 * JPQL Query - findEmpleadosBySalario
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Empleados> findEmpleadosBySalario(java.math.BigDecimal salario, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEmpleadosBySalario", startResult, maxRows, salario);
		return new LinkedHashSet<Empleados>(query.getResultList());
	}

	/**
	 * JPQL Query - findEmpleadosByFechanac
	 *
	 */
	@Transactional
	public Set<Empleados> findEmpleadosByFechanac(java.util.Calendar fechanac) throws DataAccessException {

		return findEmpleadosByFechanac(fechanac, -1, -1);
	}

	/**
	 * JPQL Query - findEmpleadosByFechanac
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Empleados> findEmpleadosByFechanac(java.util.Calendar fechanac, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEmpleadosByFechanac", startResult, maxRows, fechanac);
		return new LinkedHashSet<Empleados>(query.getResultList());
	}

	/**
	 * JPQL Query - findEmpleadosByNombre
	 *
	 */
	@Transactional
	public Set<Empleados> findEmpleadosByNombre(String nombre) throws DataAccessException {

		return findEmpleadosByNombre(nombre, -1, -1);
	}

	/**
	 * JPQL Query - findEmpleadosByNombre
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Empleados> findEmpleadosByNombre(String nombre, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEmpleadosByNombre", startResult, maxRows, nombre);
		return new LinkedHashSet<Empleados>(query.getResultList());
	}

	/**
	 * JPQL Query - findEmpleadosBySexoContaining
	 *
	 */
	@Transactional
	public Set<Empleados> findEmpleadosBySexoContaining(String sexo) throws DataAccessException {

		return findEmpleadosBySexoContaining(sexo, -1, -1);
	}

	/**
	 * JPQL Query - findEmpleadosBySexoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Empleados> findEmpleadosBySexoContaining(String sexo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEmpleadosBySexoContaining", startResult, maxRows, sexo);
		return new LinkedHashSet<Empleados>(query.getResultList());
	}

	/**
	 * JPQL Query - findEmpleadosByCargoContaining
	 *
	 */
	@Transactional
	public Set<Empleados> findEmpleadosByCargoContaining(String cargo) throws DataAccessException {

		return findEmpleadosByCargoContaining(cargo, -1, -1);
	}

	/**
	 * JPQL Query - findEmpleadosByCargoContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Empleados> findEmpleadosByCargoContaining(String cargo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEmpleadosByCargoContaining", startResult, maxRows, cargo);
		return new LinkedHashSet<Empleados>(query.getResultList());
	}

	/**
	 * JPQL Query - findEmpleadosByNombreContaining
	 *
	 */
	@Transactional
	public Set<Empleados> findEmpleadosByNombreContaining(String nombre) throws DataAccessException {

		return findEmpleadosByNombreContaining(nombre, -1, -1);
	}

	/**
	 * JPQL Query - findEmpleadosByNombreContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Empleados> findEmpleadosByNombreContaining(String nombre, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEmpleadosByNombreContaining", startResult, maxRows, nombre);
		return new LinkedHashSet<Empleados>(query.getResultList());
	}

	/**
	 * JPQL Query - findEmpleadosByCargo
	 *
	 */
	@Transactional
	public Set<Empleados> findEmpleadosByCargo(String cargo) throws DataAccessException {

		return findEmpleadosByCargo(cargo, -1, -1);
	}

	/**
	 * JPQL Query - findEmpleadosByCargo
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Empleados> findEmpleadosByCargo(String cargo, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEmpleadosByCargo", startResult, maxRows, cargo);
		return new LinkedHashSet<Empleados>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Empleados entity) {
		return true;
	}
}
