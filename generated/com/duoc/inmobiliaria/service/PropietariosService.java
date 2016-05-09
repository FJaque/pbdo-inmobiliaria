package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Propiedades;
import com.duoc.inmobiliaria.domain.Propietarios;

import java.math.BigDecimal;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Propietarios entities
 * 
 */
public interface PropietariosService {

	/**
	 * Save an existing Propietarios entity
	 * 
	 */
	public void savePropietarios(Propietarios propietarios);

	/**
	 */
	public Propietarios findPropietariosByPrimaryKey(BigDecimal numpropietario);

	/**
	 * Delete an existing Propietarios entity
	 * 
	 */
	public void deletePropietarios(Propietarios propietarios_1);

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	public Propietarios deletePropietariosPropiedadeses(BigDecimal propietarios_numpropietario, BigDecimal related_propiedadeses_numpropiedad);

	/**
	 * Return a count of all Propietarios entity
	 * 
	 */
	public Integer countPropietarioss();

	/**
	 * Return all Propietarios entity
	 * 
	 */
	public List<Propietarios> findAllPropietarioss(Integer startResult, Integer maxRows);

	/**
	 * Load an existing Propietarios entity
	 * 
	 */
	public Set<Propietarios> loadPropietarioss();

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	public Propietarios savePropietariosPropiedadeses(BigDecimal numpropietario_1, Propiedades related_propiedadeses);
}