package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.dao.EmpleadosDAO;
import com.duoc.inmobiliaria.dao.OficinasDAO;

import com.duoc.inmobiliaria.domain.Empleados;
import com.duoc.inmobiliaria.domain.Oficinas;

import java.math.BigDecimal;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Oficinas entities
 * 
 */

@Service("OficinasService")
@Transactional
public class OficinasServiceImpl implements OficinasService {

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
	 * Instantiates a new OficinasServiceImpl.
	 *
	 */
	public OficinasServiceImpl() {
	}

	/**
	 * Delete an existing Empleados entity
	 * 
	 */
	@Transactional
	public Oficinas deleteOficinasEmpleadoses(BigDecimal oficinas_numoficina, BigDecimal related_empleadoses_numempleado) {
		Empleados related_empleadoses = empleadosDAO.findEmpleadosByPrimaryKey(related_empleadoses_numempleado, -1, -1);

		Oficinas oficinas = oficinasDAO.findOficinasByPrimaryKey(oficinas_numoficina, -1, -1);

		related_empleadoses.setOficinas(null);
		oficinas.getEmpleadoses().remove(related_empleadoses);

		empleadosDAO.remove(related_empleadoses);
		empleadosDAO.flush();

		return oficinas;
	}

	/**
	 * Return all Oficinas entity
	 * 
	 */
	@Transactional
	public List<Oficinas> findAllOficinass(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Oficinas>(oficinasDAO.findAllOficinass(startResult, maxRows));
	}

	/**
	 * Return a count of all Oficinas entity
	 * 
	 */
	@Transactional
	public Integer countOficinass() {
		return ((Long) oficinasDAO.createQuerySingleResult("select count(o) from Oficinas o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Empleados entity
	 * 
	 */
	@Transactional
	public Oficinas saveOficinasEmpleadoses(BigDecimal numoficina, Empleados related_empleadoses) {
		Oficinas oficinas = oficinasDAO.findOficinasByPrimaryKey(numoficina, -1, -1);
		Empleados existingempleadoses = empleadosDAO.findEmpleadosByPrimaryKey(related_empleadoses.getNumempleado());

		// copy into the existing record to preserve existing relationships
		if (existingempleadoses != null) {
			existingempleadoses.setNumempleado(related_empleadoses.getNumempleado());
			existingempleadoses.setNombre(related_empleadoses.getNombre());
			existingempleadoses.setApellido(related_empleadoses.getApellido());
			existingempleadoses.setCargo(related_empleadoses.getCargo());
			existingempleadoses.setSexo(related_empleadoses.getSexo());
			existingempleadoses.setFechanac(related_empleadoses.getFechanac());
			existingempleadoses.setSalario(related_empleadoses.getSalario());
			related_empleadoses = existingempleadoses;
		}

		related_empleadoses.setOficinas(oficinas);
		oficinas.getEmpleadoses().add(related_empleadoses);
		related_empleadoses = empleadosDAO.store(related_empleadoses);
		empleadosDAO.flush();

		oficinas = oficinasDAO.store(oficinas);
		oficinasDAO.flush();

		return oficinas;
	}

	/**
	 * Load an existing Oficinas entity
	 * 
	 */
	@Transactional
	public Set<Oficinas> loadOficinass() {
		return oficinasDAO.findAllOficinass();
	}

	/**
	 */
	@Transactional
	public Oficinas findOficinasByPrimaryKey(BigDecimal numoficina) {
		return oficinasDAO.findOficinasByPrimaryKey(numoficina);
	}

	/**
	 * Save an existing Oficinas entity
	 * 
	 */
	@Transactional
	public void saveOficinas(Oficinas oficinas) {
		Oficinas existingOficinas = oficinasDAO.findOficinasByPrimaryKey(oficinas.getNumoficina());

		if (existingOficinas != null) {
			if (existingOficinas != oficinas) {
				existingOficinas.setNumoficina(oficinas.getNumoficina());
				existingOficinas.setCalle(oficinas.getCalle());
				existingOficinas.setCiudad(oficinas.getCiudad());
				existingOficinas.setCodigopostal(oficinas.getCodigopostal());
			}
			oficinas = oficinasDAO.store(existingOficinas);
		} else {
			oficinas = oficinasDAO.store(oficinas);
		}
		oficinasDAO.flush();
	}

	/**
	 * Delete an existing Oficinas entity
	 * 
	 */
	@Transactional
	public void deleteOficinas(Oficinas oficinas) {
		oficinasDAO.remove(oficinas);
		oficinasDAO.flush();
	}
}
