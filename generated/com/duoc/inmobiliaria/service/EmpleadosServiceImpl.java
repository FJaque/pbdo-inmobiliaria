package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.dao.EmpleadosDAO;
import com.duoc.inmobiliaria.dao.OficinasDAO;
import com.duoc.inmobiliaria.dao.PropiedadesDAO;

import com.duoc.inmobiliaria.domain.Empleados;
import com.duoc.inmobiliaria.domain.Oficinas;
import com.duoc.inmobiliaria.domain.Propiedades;

import java.math.BigDecimal;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Empleados entities
 * 
 */

@Service("EmpleadosService")
@Transactional
public class EmpleadosServiceImpl implements EmpleadosService {

	/**
	 * DAO injected by Spring that manages Empleados entities
	 * 
	 */
	@Autowired
	private EmpleadosDAO empleadosDAO;

	/**
	 * DAO injected by Spring that manages Oficinas entities
	 * 
	 */
	@Autowired
	private OficinasDAO oficinasDAO;

	/**
	 * DAO injected by Spring that manages Propiedades entities
	 * 
	 */
	@Autowired
	private PropiedadesDAO propiedadesDAO;

	/**
	 * Instantiates a new EmpleadosServiceImpl.
	 *
	 */
	public EmpleadosServiceImpl() {
	}

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	@Transactional
	public Empleados saveEmpleadosPropiedadeses(BigDecimal numempleado, Propiedades related_propiedadeses) {
		Empleados empleados = empleadosDAO.findEmpleadosByPrimaryKey(numempleado, -1, -1);
		Propiedades existingpropiedadeses = propiedadesDAO.findPropiedadesByPrimaryKey(related_propiedadeses.getNumpropiedad());

		// copy into the existing record to preserve existing relationships
		if (existingpropiedadeses != null) {
			existingpropiedadeses.setNumpropiedad(related_propiedadeses.getNumpropiedad());
			existingpropiedadeses.setCalle(related_propiedadeses.getCalle());
			existingpropiedadeses.setCiudad(related_propiedadeses.getCiudad());
			existingpropiedadeses.setCodigopostal(related_propiedadeses.getCodigopostal());
			existingpropiedadeses.setTipo(related_propiedadeses.getTipo());
			existingpropiedadeses.setHabitaciones(related_propiedadeses.getHabitaciones());
			existingpropiedadeses.setRenta(related_propiedadeses.getRenta());
			related_propiedadeses = existingpropiedadeses;
		}

		related_propiedadeses.setEmpleados(empleados);
		empleados.getPropiedadeses().add(related_propiedadeses);
		related_propiedadeses = propiedadesDAO.store(related_propiedadeses);
		propiedadesDAO.flush();

		empleados = empleadosDAO.store(empleados);
		empleadosDAO.flush();

		return empleados;
	}

	/**
	 * Return a count of all Empleados entity
	 * 
	 */
	@Transactional
	public Integer countEmpleadoss() {
		return ((Long) empleadosDAO.createQuerySingleResult("select count(o) from Empleados o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Empleados entity
	 * 
	 */
	@Transactional
	public void deleteEmpleados(Empleados empleados) {
		empleadosDAO.remove(empleados);
		empleadosDAO.flush();
	}

	/**
	 * Delete an existing Oficinas entity
	 * 
	 */
	@Transactional
	public Empleados deleteEmpleadosOficinas(BigDecimal empleados_numempleado, BigDecimal related_oficinas_numoficina) {
		Empleados empleados = empleadosDAO.findEmpleadosByPrimaryKey(empleados_numempleado, -1, -1);
		Oficinas related_oficinas = oficinasDAO.findOficinasByPrimaryKey(related_oficinas_numoficina, -1, -1);

		empleados.setOficinas(null);
		related_oficinas.getEmpleadoses().remove(empleados);
		empleados = empleadosDAO.store(empleados);
		empleadosDAO.flush();

		related_oficinas = oficinasDAO.store(related_oficinas);
		oficinasDAO.flush();

		oficinasDAO.remove(related_oficinas);
		oficinasDAO.flush();

		return empleados;
	}

	/**
	 * Save an existing Oficinas entity
	 * 
	 */
	@Transactional
	public Empleados saveEmpleadosOficinas(BigDecimal numempleado, Oficinas related_oficinas) {
		Empleados empleados = empleadosDAO.findEmpleadosByPrimaryKey(numempleado, -1, -1);
		Oficinas existingoficinas = oficinasDAO.findOficinasByPrimaryKey(related_oficinas.getNumoficina());

		// copy into the existing record to preserve existing relationships
		if (existingoficinas != null) {
			existingoficinas.setNumoficina(related_oficinas.getNumoficina());
			existingoficinas.setCalle(related_oficinas.getCalle());
			existingoficinas.setCiudad(related_oficinas.getCiudad());
			existingoficinas.setCodigopostal(related_oficinas.getCodigopostal());
			related_oficinas = existingoficinas;
		}

		empleados.setOficinas(related_oficinas);
		related_oficinas.getEmpleadoses().add(empleados);
		empleados = empleadosDAO.store(empleados);
		empleadosDAO.flush();

		related_oficinas = oficinasDAO.store(related_oficinas);
		oficinasDAO.flush();

		return empleados;
	}

	/**
	 * Return all Empleados entity
	 * 
	 */
	@Transactional
	public List<Empleados> findAllEmpleadoss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Empleados>(empleadosDAO.findAllEmpleadoss(startResult, maxRows));
	}

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	@Transactional
	public Empleados deleteEmpleadosPropiedadeses(BigDecimal empleados_numempleado, BigDecimal related_propiedadeses_numpropiedad) {
		Propiedades related_propiedadeses = propiedadesDAO.findPropiedadesByPrimaryKey(related_propiedadeses_numpropiedad, -1, -1);

		Empleados empleados = empleadosDAO.findEmpleadosByPrimaryKey(empleados_numempleado, -1, -1);

		related_propiedadeses.setEmpleados(null);
		empleados.getPropiedadeses().remove(related_propiedadeses);

		propiedadesDAO.remove(related_propiedadeses);
		propiedadesDAO.flush();

		return empleados;
	}

	/**
	 */
	@Transactional
	public Empleados findEmpleadosByPrimaryKey(BigDecimal numempleado) {
		return empleadosDAO.findEmpleadosByPrimaryKey(numempleado);
	}

	/**
	 * Save an existing Empleados entity
	 * 
	 */
	@Transactional
	public void saveEmpleados(Empleados empleados) {
		Empleados existingEmpleados = empleadosDAO.findEmpleadosByPrimaryKey(empleados.getNumempleado());

		if (existingEmpleados != null) {
			if (existingEmpleados != empleados) {
				existingEmpleados.setNumempleado(empleados.getNumempleado());
				existingEmpleados.setNombre(empleados.getNombre());
				existingEmpleados.setApellido(empleados.getApellido());
				existingEmpleados.setCargo(empleados.getCargo());
				existingEmpleados.setSexo(empleados.getSexo());
				existingEmpleados.setFechanac(empleados.getFechanac());
				existingEmpleados.setSalario(empleados.getSalario());
			}
			empleados = empleadosDAO.store(existingEmpleados);
		} else {
			empleados = empleadosDAO.store(empleados);
		}
		empleadosDAO.flush();
	}

	/**
	 * Load an existing Empleados entity
	 * 
	 */
	@Transactional
	public Set<Empleados> loadEmpleadoss() {
		return empleadosDAO.findAllEmpleadoss();
	}
}
