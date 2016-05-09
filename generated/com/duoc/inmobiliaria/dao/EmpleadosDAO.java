package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Empleados;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Empleados entities.
 * 
 */
public interface EmpleadosDAO extends JpaDao<Empleados> {

	/**
	 * JPQL Query - findEmpleadosByApellido
	 *
	 */
	public Set<Empleados> findEmpleadosByApellido(String apellido) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByApellido
	 *
	 */
	public Set<Empleados> findEmpleadosByApellido(String apellido, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByPrimaryKey
	 *
	 */
	public Empleados findEmpleadosByPrimaryKey(java.math.BigDecimal numempleado) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByPrimaryKey
	 *
	 */
	public Empleados findEmpleadosByPrimaryKey(BigDecimal numempleado, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByNumempleado
	 *
	 */
	public Empleados findEmpleadosByNumempleado(java.math.BigDecimal numempleado_1) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByNumempleado
	 *
	 */
	public Empleados findEmpleadosByNumempleado(BigDecimal numempleado_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosBySexo
	 *
	 */
	public Set<Empleados> findEmpleadosBySexo(String sexo) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosBySexo
	 *
	 */
	public Set<Empleados> findEmpleadosBySexo(String sexo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllEmpleadoss
	 *
	 */
	public Set<Empleados> findAllEmpleadoss() throws DataAccessException;

	/**
	 * JPQL Query - findAllEmpleadoss
	 *
	 */
	public Set<Empleados> findAllEmpleadoss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByApellidoContaining
	 *
	 */
	public Set<Empleados> findEmpleadosByApellidoContaining(String apellido_1) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByApellidoContaining
	 *
	 */
	public Set<Empleados> findEmpleadosByApellidoContaining(String apellido_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosBySalario
	 *
	 */
	public Set<Empleados> findEmpleadosBySalario(java.math.BigDecimal salario) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosBySalario
	 *
	 */
	public Set<Empleados> findEmpleadosBySalario(BigDecimal salario, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByFechanac
	 *
	 */
	public Set<Empleados> findEmpleadosByFechanac(java.util.Calendar fechanac) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByFechanac
	 *
	 */
	public Set<Empleados> findEmpleadosByFechanac(Calendar fechanac, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByNombre
	 *
	 */
	public Set<Empleados> findEmpleadosByNombre(String nombre) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByNombre
	 *
	 */
	public Set<Empleados> findEmpleadosByNombre(String nombre, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosBySexoContaining
	 *
	 */
	public Set<Empleados> findEmpleadosBySexoContaining(String sexo_1) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosBySexoContaining
	 *
	 */
	public Set<Empleados> findEmpleadosBySexoContaining(String sexo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByCargoContaining
	 *
	 */
	public Set<Empleados> findEmpleadosByCargoContaining(String cargo) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByCargoContaining
	 *
	 */
	public Set<Empleados> findEmpleadosByCargoContaining(String cargo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByNombreContaining
	 *
	 */
	public Set<Empleados> findEmpleadosByNombreContaining(String nombre_1) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByNombreContaining
	 *
	 */
	public Set<Empleados> findEmpleadosByNombreContaining(String nombre_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByCargo
	 *
	 */
	public Set<Empleados> findEmpleadosByCargo(String cargo_1) throws DataAccessException;

	/**
	 * JPQL Query - findEmpleadosByCargo
	 *
	 */
	public Set<Empleados> findEmpleadosByCargo(String cargo_1, int startResult, int maxRows) throws DataAccessException;

}