package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Arriendos;
import com.duoc.inmobiliaria.domain.Clientes;
import com.duoc.inmobiliaria.domain.Propiedades;

import java.math.BigDecimal;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Arriendos entities
 * 
 */
public interface ArriendosService {

	/**
	 * Load an existing Arriendos entity
	 * 
	 */
	public Set<Arriendos> loadArriendoss();

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	public Arriendos saveArriendosPropiedades(BigDecimal numarriendo, Propiedades related_propiedades);

	/**
	 * Save an existing Clientes entity
	 * 
	 */
	public Arriendos saveArriendosClientes(BigDecimal numarriendo_1, Clientes related_clientes);

	/**
	 */
	public Arriendos findArriendosByPrimaryKey(BigDecimal numarriendo_2);

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	public Arriendos deleteArriendosPropiedades(BigDecimal arriendos_numarriendo, BigDecimal related_propiedades_numpropiedad);

	/**
	 * Save an existing Arriendos entity
	 * 
	 */
	public void saveArriendos(Arriendos arriendos);

	/**
	 * Delete an existing Arriendos entity
	 * 
	 */
	public void deleteArriendos(Arriendos arriendos_1);

	/**
	 * Delete an existing Clientes entity
	 * 
	 */
	public Arriendos deleteArriendosClientes(BigDecimal arriendos_numarriendo_1, BigDecimal related_clientes_numcliente);

	/**
	 * Return a count of all Arriendos entity
	 * 
	 */
	public Integer countArriendoss();

	/**
	 * Return all Arriendos entity
	 * 
	 */
	public List<Arriendos> findAllArriendoss(Integer startResult, Integer maxRows);
}