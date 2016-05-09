package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Arriendos;
import com.duoc.inmobiliaria.domain.Empleados;
import com.duoc.inmobiliaria.domain.Propiedades;
import com.duoc.inmobiliaria.domain.Propietarios;
import com.duoc.inmobiliaria.domain.Visitas;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Propiedades entities
 * 
 */
public interface PropiedadesService {

	/**
	 * Delete an existing Propietarios entity
	 * 
	 */
	public Propiedades deletePropiedadesPropietarios(BigDecimal propiedades_numpropiedad, BigDecimal related_propietarios_numpropietario);

	/**
	 * Save an existing Propietarios entity
	 * 
	 */
	public Propiedades savePropiedadesPropietarios(BigDecimal numpropiedad, Propietarios related_propietarios);

	/**
	 * Return all Propiedades entity
	 * 
	 */
	public List<Propiedades> findAllPropiedadess(Integer startResult, Integer maxRows);

	/**
	 */
	public Propiedades findPropiedadesByPrimaryKey(BigDecimal numpropiedad_1);

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	public void savePropiedades(Propiedades propiedades);

	/**
	 * Return a count of all Propiedades entity
	 * 
	 */
	public Integer countPropiedadess();

	/**
	 * Delete an existing Empleados entity
	 * 
	 */
	public Propiedades deletePropiedadesEmpleados(BigDecimal propiedades_numpropiedad_1, BigDecimal related_empleados_numempleado);

	/**
	 * Delete an existing Arriendos entity
	 * 
	 */
	public Propiedades deletePropiedadesArriendoses(BigDecimal propiedades_numpropiedad_2, BigDecimal related_arriendoses_numarriendo);

	/**
	 * Save an existing Empleados entity
	 * 
	 */
	public Propiedades savePropiedadesEmpleados(BigDecimal numpropiedad_2, Empleados related_empleados);

	/**
	 * Save an existing Visitas entity
	 * 
	 */
	public Propiedades savePropiedadesVisitases(BigDecimal numpropiedad_3, Visitas related_visitases);

	/**
	 * Delete an existing Visitas entity
	 * 
	 */
	public Propiedades deletePropiedadesVisitases(BigDecimal propiedades_numpropiedad_3, BigDecimal related_visitases_numcliente, Calendar related_visitases_fecha, BigDecimal related_visitases_numpropiedad);

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	public void deletePropiedades(Propiedades propiedades_1);

	/**
	 * Load an existing Propiedades entity
	 * 
	 */
	public Set<Propiedades> loadPropiedadess();

	/**
	 * Save an existing Arriendos entity
	 * 
	 */
	public Propiedades savePropiedadesArriendoses(BigDecimal numpropiedad_4, Arriendos related_arriendoses);
}