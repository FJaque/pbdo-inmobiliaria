package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Empleados;
import com.duoc.inmobiliaria.domain.Oficinas;
import com.duoc.inmobiliaria.domain.Propiedades;

import java.math.BigDecimal;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Empleados entities
 * 
 */
public interface EmpleadosService {

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	public Empleados saveEmpleadosPropiedadeses(BigDecimal numempleado, Propiedades related_propiedadeses);

	/**
	 * Return a count of all Empleados entity
	 * 
	 */
	public Integer countEmpleadoss();

	/**
	 * Delete an existing Empleados entity
	 * 
	 */
	public void deleteEmpleados(Empleados empleados);

	/**
	 * Delete an existing Oficinas entity
	 * 
	 */
	public Empleados deleteEmpleadosOficinas(BigDecimal empleados_numempleado, BigDecimal related_oficinas_numoficina);

	/**
	 * Save an existing Oficinas entity
	 * 
	 */
	public Empleados saveEmpleadosOficinas(BigDecimal numempleado_1, Oficinas related_oficinas);

	/**
	 * Return all Empleados entity
	 * 
	 */
	public List<Empleados> findAllEmpleadoss(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	public Empleados deleteEmpleadosPropiedadeses(BigDecimal empleados_numempleado_1, BigDecimal related_propiedadeses_numpropiedad);

	/**
	 */
	public Empleados findEmpleadosByPrimaryKey(BigDecimal numempleado_2);

	/**
	 * Save an existing Empleados entity
	 * 
	 */
	public void saveEmpleados(Empleados empleados_1);

	/**
	 * Load an existing Empleados entity
	 * 
	 */
	public Set<Empleados> loadEmpleadoss();
}