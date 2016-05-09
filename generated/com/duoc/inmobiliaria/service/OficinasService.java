package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Empleados;
import com.duoc.inmobiliaria.domain.Oficinas;

import java.math.BigDecimal;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Oficinas entities
 * 
 */
public interface OficinasService {

	/**
	 * Delete an existing Empleados entity
	 * 
	 */
	public Oficinas deleteOficinasEmpleadoses(BigDecimal oficinas_numoficina, BigDecimal related_empleadoses_numempleado);

	/**
	 * Return all Oficinas entity
	 * 
	 */
	public List<Oficinas> findAllOficinass(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Oficinas entity
	 * 
	 */
	public Integer countOficinass();

	/**
	 * Save an existing Empleados entity
	 * 
	 */
	public Oficinas saveOficinasEmpleadoses(BigDecimal numoficina, Empleados related_empleadoses);

	/**
	 * Load an existing Oficinas entity
	 * 
	 */
	public Set<Oficinas> loadOficinass();

	/**
	 */
	public Oficinas findOficinasByPrimaryKey(BigDecimal numoficina_1);

	/**
	 * Save an existing Oficinas entity
	 * 
	 */
	public void saveOficinas(Oficinas oficinas);

	/**
	 * Delete an existing Oficinas entity
	 * 
	 */
	public void deleteOficinas(Oficinas oficinas_1);
}