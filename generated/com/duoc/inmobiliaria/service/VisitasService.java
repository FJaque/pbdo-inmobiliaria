package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Clientes;
import com.duoc.inmobiliaria.domain.Propiedades;
import com.duoc.inmobiliaria.domain.Visitas;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Visitas entities
 * 
 */
public interface VisitasService {

	/**
	 * Return a count of all Visitas entity
	 * 
	 */
	public Integer countVisitass();

	/**
	 * Save an existing Visitas entity
	 * 
	 */
	public void saveVisitas(Visitas visitas);

	/**
	 * Save an existing Clientes entity
	 * 
	 */
	public Visitas saveVisitasClientes(BigDecimal numcliente, Calendar fecha, BigDecimal numpropiedad, Clientes related_clientes);

	/**
	 */
	public Visitas findVisitasByPrimaryKey(BigDecimal numcliente_1, Calendar fecha_1, BigDecimal numpropiedad_1);

	/**
	 * Return all Visitas entity
	 * 
	 */
	public List<Visitas> findAllVisitass(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Clientes entity
	 * 
	 */
	public Visitas deleteVisitasClientes(BigDecimal visitas_numcliente, Calendar visitas_fecha, BigDecimal visitas_numpropiedad, BigDecimal related_clientes_numcliente);

	/**
	 * Load an existing Visitas entity
	 * 
	 */
	public Set<Visitas> loadVisitass();

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	public Visitas saveVisitasPropiedades(BigDecimal numcliente_2, Calendar fecha_2, BigDecimal numpropiedad_2, Propiedades related_propiedades);

	/**
	 * Delete an existing Visitas entity
	 * 
	 */
	public void deleteVisitas(Visitas visitas_1);

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	public Visitas deleteVisitasPropiedades(BigDecimal visitas_numcliente_1, Calendar visitas_fecha_1, BigDecimal visitas_numpropiedad_1, BigDecimal related_propiedades_numpropiedad);
}