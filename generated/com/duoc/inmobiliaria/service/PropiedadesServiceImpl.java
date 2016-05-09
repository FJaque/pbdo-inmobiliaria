package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.dao.ArriendosDAO;
import com.duoc.inmobiliaria.dao.EmpleadosDAO;
import com.duoc.inmobiliaria.dao.PropiedadesDAO;
import com.duoc.inmobiliaria.dao.PropietariosDAO;
import com.duoc.inmobiliaria.dao.VisitasDAO;

import com.duoc.inmobiliaria.domain.Arriendos;
import com.duoc.inmobiliaria.domain.Empleados;
import com.duoc.inmobiliaria.domain.Propiedades;
import com.duoc.inmobiliaria.domain.Propietarios;
import com.duoc.inmobiliaria.domain.Visitas;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Propiedades entities
 * 
 */

@Service("PropiedadesService")
@Transactional
public class PropiedadesServiceImpl implements PropiedadesService {

	/**
	 * DAO injected by Spring that manages Arriendos entities
	 * 
	 */
	@Autowired
	private ArriendosDAO arriendosDAO;

	/**
	 * DAO injected by Spring that manages Empleados entities
	 * 
	 */
	@Autowired
	private EmpleadosDAO empleadosDAO;

	/**
	 * DAO injected by Spring that manages Propiedades entities
	 * 
	 */
	@Autowired
	private PropiedadesDAO propiedadesDAO;

	/**
	 * DAO injected by Spring that manages Propietarios entities
	 * 
	 */
	@Autowired
	private PropietariosDAO propietariosDAO;

	/**
	 * DAO injected by Spring that manages Visitas entities
	 * 
	 */
	@Autowired
	private VisitasDAO visitasDAO;

	/**
	 * Instantiates a new PropiedadesServiceImpl.
	 *
	 */
	public PropiedadesServiceImpl() {
	}

	/**
	 * Delete an existing Propietarios entity
	 * 
	 */
	@Transactional
	public Propiedades deletePropiedadesPropietarios(BigDecimal propiedades_numpropiedad, BigDecimal related_propietarios_numpropietario) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedades_numpropiedad, -1, -1);
		Propietarios related_propietarios = propietariosDAO.findPropietariosByPrimaryKey(related_propietarios_numpropietario, -1, -1);

		propiedades.setPropietarios(null);
		related_propietarios.getPropiedadeses().remove(propiedades);
		propiedades = propiedadesDAO.store(propiedades);
		propiedadesDAO.flush();

		related_propietarios = propietariosDAO.store(related_propietarios);
		propietariosDAO.flush();

		propietariosDAO.remove(related_propietarios);
		propietariosDAO.flush();

		return propiedades;
	}

	/**
	 * Save an existing Propietarios entity
	 * 
	 */
	@Transactional
	public Propiedades savePropiedadesPropietarios(BigDecimal numpropiedad, Propietarios related_propietarios) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedad, -1, -1);
		Propietarios existingpropietarios = propietariosDAO.findPropietariosByPrimaryKey(related_propietarios.getNumpropietario());

		// copy into the existing record to preserve existing relationships
		if (existingpropietarios != null) {
			existingpropietarios.setNumpropietario(related_propietarios.getNumpropietario());
			existingpropietarios.setNombre(related_propietarios.getNombre());
			existingpropietarios.setApellido(related_propietarios.getApellido());
			existingpropietarios.setDireccion(related_propietarios.getDireccion());
			existingpropietarios.setTelefono(related_propietarios.getTelefono());
			related_propietarios = existingpropietarios;
		}

		propiedades.setPropietarios(related_propietarios);
		related_propietarios.getPropiedadeses().add(propiedades);
		propiedades = propiedadesDAO.store(propiedades);
		propiedadesDAO.flush();

		related_propietarios = propietariosDAO.store(related_propietarios);
		propietariosDAO.flush();

		return propiedades;
	}

	/**
	 * Return all Propiedades entity
	 * 
	 */
	@Transactional
	public List<Propiedades> findAllPropiedadess(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Propiedades>(propiedadesDAO.findAllPropiedadess(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Propiedades findPropiedadesByPrimaryKey(BigDecimal numpropiedad) {
		return propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedad);
	}

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	@Transactional
	public void savePropiedades(Propiedades propiedades) {
		Propiedades existingPropiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedades.getNumpropiedad());

		if (existingPropiedades != null) {
			if (existingPropiedades != propiedades) {
				existingPropiedades.setNumpropiedad(propiedades.getNumpropiedad());
				existingPropiedades.setCalle(propiedades.getCalle());
				existingPropiedades.setCiudad(propiedades.getCiudad());
				existingPropiedades.setCodigopostal(propiedades.getCodigopostal());
				existingPropiedades.setTipo(propiedades.getTipo());
				existingPropiedades.setHabitaciones(propiedades.getHabitaciones());
				existingPropiedades.setRenta(propiedades.getRenta());
			}
			propiedades = propiedadesDAO.store(existingPropiedades);
		} else {
			propiedades = propiedadesDAO.store(propiedades);
		}
		propiedadesDAO.flush();
	}

	/**
	 * Return a count of all Propiedades entity
	 * 
	 */
	@Transactional
	public Integer countPropiedadess() {
		return ((Long) propiedadesDAO.createQuerySingleResult("select count(o) from Propiedades o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Empleados entity
	 * 
	 */
	@Transactional
	public Propiedades deletePropiedadesEmpleados(BigDecimal propiedades_numpropiedad, BigDecimal related_empleados_numempleado) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedades_numpropiedad, -1, -1);
		Empleados related_empleados = empleadosDAO.findEmpleadosByPrimaryKey(related_empleados_numempleado, -1, -1);

		propiedades.setEmpleados(null);
		related_empleados.getPropiedadeses().remove(propiedades);
		propiedades = propiedadesDAO.store(propiedades);
		propiedadesDAO.flush();

		related_empleados = empleadosDAO.store(related_empleados);
		empleadosDAO.flush();

		empleadosDAO.remove(related_empleados);
		empleadosDAO.flush();

		return propiedades;
	}

	/**
	 * Delete an existing Arriendos entity
	 * 
	 */
	@Transactional
	public Propiedades deletePropiedadesArriendoses(BigDecimal propiedades_numpropiedad, BigDecimal related_arriendoses_numarriendo) {
		Arriendos related_arriendoses = arriendosDAO.findArriendosByPrimaryKey(related_arriendoses_numarriendo, -1, -1);

		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedades_numpropiedad, -1, -1);

		related_arriendoses.setPropiedades(null);
		propiedades.getArriendoses().remove(related_arriendoses);

		arriendosDAO.remove(related_arriendoses);
		arriendosDAO.flush();

		return propiedades;
	}

	/**
	 * Save an existing Empleados entity
	 * 
	 */
	@Transactional
	public Propiedades savePropiedadesEmpleados(BigDecimal numpropiedad, Empleados related_empleados) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedad, -1, -1);
		Empleados existingempleados = empleadosDAO.findEmpleadosByPrimaryKey(related_empleados.getNumempleado());

		// copy into the existing record to preserve existing relationships
		if (existingempleados != null) {
			existingempleados.setNumempleado(related_empleados.getNumempleado());
			existingempleados.setNombre(related_empleados.getNombre());
			existingempleados.setApellido(related_empleados.getApellido());
			existingempleados.setCargo(related_empleados.getCargo());
			existingempleados.setSexo(related_empleados.getSexo());
			existingempleados.setFechanac(related_empleados.getFechanac());
			existingempleados.setSalario(related_empleados.getSalario());
			related_empleados = existingempleados;
		}

		propiedades.setEmpleados(related_empleados);
		related_empleados.getPropiedadeses().add(propiedades);
		propiedades = propiedadesDAO.store(propiedades);
		propiedadesDAO.flush();

		related_empleados = empleadosDAO.store(related_empleados);
		empleadosDAO.flush();

		return propiedades;
	}

	/**
	 * Save an existing Visitas entity
	 * 
	 */
	@Transactional
	public Propiedades savePropiedadesVisitases(BigDecimal numpropiedad, Visitas related_visitases) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedad, -1, -1);
		Visitas existingvisitases = visitasDAO.findVisitasByPrimaryKey(related_visitases.getNumcliente(), related_visitases.getFecha(), related_visitases.getNumpropiedad());

		// copy into the existing record to preserve existing relationships
		if (existingvisitases != null) {
			existingvisitases.setNumcliente(related_visitases.getNumcliente());
			existingvisitases.setFecha(related_visitases.getFecha());
			existingvisitases.setNumpropiedad(related_visitases.getNumpropiedad());
			existingvisitases.setComentario(related_visitases.getComentario());
			related_visitases = existingvisitases;
		}

		related_visitases.setPropiedades(propiedades);
		propiedades.getVisitases().add(related_visitases);
		related_visitases = visitasDAO.store(related_visitases);
		visitasDAO.flush();

		propiedades = propiedadesDAO.store(propiedades);
		propiedadesDAO.flush();

		return propiedades;
	}

	/**
	 * Delete an existing Visitas entity
	 * 
	 */
	@Transactional
	public Propiedades deletePropiedadesVisitases(BigDecimal propiedades_numpropiedad, BigDecimal related_visitases_numcliente, Calendar related_visitases_fecha, BigDecimal related_visitases_numpropiedad) {
		Visitas related_visitases = visitasDAO.findVisitasByPrimaryKey(related_visitases_numcliente, related_visitases_fecha, related_visitases_numpropiedad, -1, -1);

		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedades_numpropiedad, -1, -1);

		related_visitases.setPropiedades(null);
		propiedades.getVisitases().remove(related_visitases);

		visitasDAO.remove(related_visitases);
		visitasDAO.flush();

		return propiedades;
	}

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	@Transactional
	public void deletePropiedades(Propiedades propiedades) {
		propiedadesDAO.remove(propiedades);
		propiedadesDAO.flush();
	}

	/**
	 * Load an existing Propiedades entity
	 * 
	 */
	@Transactional
	public Set<Propiedades> loadPropiedadess() {
		return propiedadesDAO.findAllPropiedadess();
	}

	/**
	 * Save an existing Arriendos entity
	 * 
	 */
	@Transactional
	public Propiedades savePropiedadesArriendoses(BigDecimal numpropiedad, Arriendos related_arriendoses) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedad, -1, -1);
		Arriendos existingarriendoses = arriendosDAO.findArriendosByPrimaryKey(related_arriendoses.getNumarriendo());

		// copy into the existing record to preserve existing relationships
		if (existingarriendoses != null) {
			existingarriendoses.setNumarriendo(related_arriendoses.getNumarriendo());
			existingarriendoses.setRenta(related_arriendoses.getRenta());
			existingarriendoses.setFormapago(related_arriendoses.getFormapago());
			existingarriendoses.setPagado(related_arriendoses.getPagado());
			existingarriendoses.setIniciorenta(related_arriendoses.getIniciorenta());
			existingarriendoses.setFinrenta(related_arriendoses.getFinrenta());
			existingarriendoses.setMespago(related_arriendoses.getMespago());
			related_arriendoses = existingarriendoses;
		}

		related_arriendoses.setPropiedades(propiedades);
		propiedades.getArriendoses().add(related_arriendoses);
		related_arriendoses = arriendosDAO.store(related_arriendoses);
		arriendosDAO.flush();

		propiedades = propiedadesDAO.store(propiedades);
		propiedadesDAO.flush();

		return propiedades;
	}
}
