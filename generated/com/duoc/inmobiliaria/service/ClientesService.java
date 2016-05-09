package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Arriendos;
import com.duoc.inmobiliaria.domain.Clientes;
import com.duoc.inmobiliaria.domain.Visitas;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Clientes entities
 * 
 */
public interface ClientesService {

	/**
	 * Save an existing Arriendos entity
	 * 
	 */
	public Clientes saveClientesArriendoses(BigDecimal numcliente, Arriendos related_arriendoses);

	/**
	 * Load an existing Clientes entity
	 * 
	 */
	public Set<Clientes> loadClientess();

	/**
	 * Delete an existing Visitas entity
	 * 
	 */
	public Clientes deleteClientesVisitases(BigDecimal clientes_numcliente, BigDecimal related_visitases_numcliente, Calendar related_visitases_fecha, BigDecimal related_visitases_numpropiedad);

	/**
	 * Return a count of all Clientes entity
	 * 
	 */
	public Integer countClientess();

	/**
	 * Delete an existing Clientes entity
	 * 
	 */
	public void deleteClientes(Clientes clientes);

	/**
	 * Save an existing Visitas entity
	 * 
	 */
	public Clientes saveClientesVisitases(BigDecimal numcliente_1, Visitas related_visitases);

	/**
	 * Delete an existing Arriendos entity
	 * 
	 */
	public Clientes deleteClientesArriendoses(BigDecimal clientes_numcliente_1, BigDecimal related_arriendoses_numarriendo);

	/**
	 * Save an existing Clientes entity
	 * 
	 */
	public void saveClientes(Clientes clientes_1);

	/**
	 */
	public Clientes findClientesByPrimaryKey(BigDecimal numcliente_2);

	/**
	 * Return all Clientes entity
	 * 
	 */
	public List<Clientes> findAllClientess(Integer startResult, Integer maxRows);
}