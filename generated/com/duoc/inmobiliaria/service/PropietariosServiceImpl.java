package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.dao.PropiedadesDAO;
import com.duoc.inmobiliaria.dao.PropietariosDAO;

import com.duoc.inmobiliaria.domain.Propiedades;
import com.duoc.inmobiliaria.domain.Propietarios;

import java.math.BigDecimal;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Propietarios entities
 * 
 */

@Service("PropietariosService")
@Transactional
public class PropietariosServiceImpl implements PropietariosService {

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
	 * Instantiates a new PropietariosServiceImpl.
	 *
	 */
	public PropietariosServiceImpl() {
	}

	/**
	 * Save an existing Propietarios entity
	 * 
	 */
	@Transactional
	public void savePropietarios(Propietarios propietarios) {
		Propietarios existingPropietarios = propietariosDAO.findPropietariosByPrimaryKey(propietarios.getNumpropietario());

		if (existingPropietarios != null) {
			if (existingPropietarios != propietarios) {
				existingPropietarios.setNumpropietario(propietarios.getNumpropietario());
				existingPropietarios.setNombre(propietarios.getNombre());
				existingPropietarios.setApellido(propietarios.getApellido());
				existingPropietarios.setDireccion(propietarios.getDireccion());
				existingPropietarios.setTelefono(propietarios.getTelefono());
			}
			propietarios = propietariosDAO.store(existingPropietarios);
		} else {
			propietarios = propietariosDAO.store(propietarios);
		}
		propietariosDAO.flush();
	}

	/**
	 */
	@Transactional
	public Propietarios findPropietariosByPrimaryKey(BigDecimal numpropietario) {
		return propietariosDAO.findPropietariosByPrimaryKey(numpropietario);
	}

	/**
	 * Delete an existing Propietarios entity
	 * 
	 */
	@Transactional
	public void deletePropietarios(Propietarios propietarios) {
		propietariosDAO.remove(propietarios);
		propietariosDAO.flush();
	}

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	@Transactional
	public Propietarios deletePropietariosPropiedadeses(BigDecimal propietarios_numpropietario, BigDecimal related_propiedadeses_numpropiedad) {
		Propiedades related_propiedadeses = propiedadesDAO.findPropiedadesByPrimaryKey(related_propiedadeses_numpropiedad, -1, -1);

		Propietarios propietarios = propietariosDAO.findPropietariosByPrimaryKey(propietarios_numpropietario, -1, -1);

		related_propiedadeses.setPropietarios(null);
		propietarios.getPropiedadeses().remove(related_propiedadeses);

		propiedadesDAO.remove(related_propiedadeses);
		propiedadesDAO.flush();

		return propietarios;
	}

	/**
	 * Return a count of all Propietarios entity
	 * 
	 */
	@Transactional
	public Integer countPropietarioss() {
		return ((Long) propietariosDAO.createQuerySingleResult("select count(o) from Propietarios o").getSingleResult()).intValue();
	}

	/**
	 * Return all Propietarios entity
	 * 
	 */
	@Transactional
	public List<Propietarios> findAllPropietarioss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Propietarios>(propietariosDAO.findAllPropietarioss(startResult, maxRows));
	}

	/**
	 * Load an existing Propietarios entity
	 * 
	 */
	@Transactional
	public Set<Propietarios> loadPropietarioss() {
		return propietariosDAO.findAllPropietarioss();
	}

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	@Transactional
	public Propietarios savePropietariosPropiedadeses(BigDecimal numpropietario, Propiedades related_propiedadeses) {
		Propietarios propietarios = propietariosDAO.findPropietariosByPrimaryKey(numpropietario, -1, -1);
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

		related_propiedadeses.setPropietarios(propietarios);
		propietarios.getPropiedadeses().add(related_propiedadeses);
		related_propiedadeses = propiedadesDAO.store(related_propiedadeses);
		propiedadesDAO.flush();

		propietarios = propietariosDAO.store(propietarios);
		propietariosDAO.flush();

		return propietarios;
	}
}
