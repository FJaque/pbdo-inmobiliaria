package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.dao.ClientesDAO;
import com.duoc.inmobiliaria.dao.PropiedadesDAO;
import com.duoc.inmobiliaria.dao.VisitasDAO;

import com.duoc.inmobiliaria.domain.Clientes;
import com.duoc.inmobiliaria.domain.Propiedades;
import com.duoc.inmobiliaria.domain.Visitas;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Visitas entities
 * 
 */

@Service("VisitasService")
@Transactional
public class VisitasServiceImpl implements VisitasService {

	/**
	 * DAO injected by Spring that manages Clientes entities
	 * 
	 */
	@Autowired
	private ClientesDAO clientesDAO;

	/**
	 * DAO injected by Spring that manages Propiedades entities
	 * 
	 */
	@Autowired
	private PropiedadesDAO propiedadesDAO;

	/**
	 * DAO injected by Spring that manages Visitas entities
	 * 
	 */
	@Autowired
	private VisitasDAO visitasDAO;

	/**
	 * Instantiates a new VisitasServiceImpl.
	 *
	 */
	public VisitasServiceImpl() {
	}

	/**
	 * Return a count of all Visitas entity
	 * 
	 */
	@Transactional
	public Integer countVisitass() {
		return ((Long) visitasDAO.createQuerySingleResult("select count(*) from Visitas o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Visitas entity
	 * 
	 */
	@Transactional
	public void saveVisitas(Visitas visitas) {
		Visitas existingVisitas = visitasDAO.findVisitasByPrimaryKey(visitas.getNumcliente(), visitas.getFecha(), visitas.getNumpropiedad());

		if (existingVisitas != null) {
			if (existingVisitas != visitas) {
				existingVisitas.setNumcliente(visitas.getNumcliente());
				existingVisitas.setFecha(visitas.getFecha());
				existingVisitas.setNumpropiedad(visitas.getNumpropiedad());
				existingVisitas.setComentario(visitas.getComentario());
			}
			visitas = visitasDAO.store(existingVisitas);
		} else {
			visitas = visitasDAO.store(visitas);
		}
		visitasDAO.flush();
	}

	/**
	 * Save an existing Clientes entity
	 * 
	 */
	@Transactional
	public Visitas saveVisitasClientes(BigDecimal numcliente, Calendar fecha, BigDecimal numpropiedad, Clientes related_clientes) {
		Visitas visitas = visitasDAO.findVisitasByPrimaryKey(numcliente, fecha, numpropiedad, -1, -1);
		Clientes existingclientes = clientesDAO.findClientesByPrimaryKey(related_clientes.getNumcliente());

		// copy into the existing record to preserve existing relationships
		if (existingclientes != null) {
			existingclientes.setNumcliente(related_clientes.getNumcliente());
			existingclientes.setNombre(related_clientes.getNombre());
			existingclientes.setApellido(related_clientes.getApellido());
			existingclientes.setDireccion(related_clientes.getDireccion());
			related_clientes = existingclientes;
		}

		visitas.setClientes(related_clientes);
		related_clientes.getVisitases().add(visitas);
		visitas = visitasDAO.store(visitas);
		visitasDAO.flush();

		related_clientes = clientesDAO.store(related_clientes);
		clientesDAO.flush();

		return visitas;
	}

	/**
	 */
	@Transactional
	public Visitas findVisitasByPrimaryKey(BigDecimal numcliente, Calendar fecha, BigDecimal numpropiedad) {
		return visitasDAO.findVisitasByPrimaryKey(numcliente, fecha, numpropiedad);
	}

	/**
	 * Return all Visitas entity
	 * 
	 */
	@Transactional
	public List<Visitas> findAllVisitass(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Visitas>(visitasDAO.findAllVisitass(startResult, maxRows));
	}

	/**
	 * Delete an existing Clientes entity
	 * 
	 */
	@Transactional
	public Visitas deleteVisitasClientes(BigDecimal visitas_numcliente, Calendar visitas_fecha, BigDecimal visitas_numpropiedad, BigDecimal related_clientes_numcliente) {
		Visitas visitas = visitasDAO.findVisitasByPrimaryKey(visitas_numcliente, visitas_fecha, visitas_numpropiedad, -1, -1);
		Clientes related_clientes = clientesDAO.findClientesByPrimaryKey(related_clientes_numcliente, -1, -1);

		visitas.setClientes(null);
		related_clientes.getVisitases().remove(visitas);
		visitas = visitasDAO.store(visitas);
		visitasDAO.flush();

		related_clientes = clientesDAO.store(related_clientes);
		clientesDAO.flush();

		clientesDAO.remove(related_clientes);
		clientesDAO.flush();

		return visitas;
	}

	/**
	 * Load an existing Visitas entity
	 * 
	 */
	@Transactional
	public Set<Visitas> loadVisitass() {
		return visitasDAO.findAllVisitass();
	}

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	@Transactional
	public Visitas saveVisitasPropiedades(BigDecimal numcliente, Calendar fecha, BigDecimal numpropiedad, Propiedades related_propiedades) {
		Visitas visitas = visitasDAO.findVisitasByPrimaryKey(numcliente, fecha, numpropiedad, -1, -1);
		Propiedades existingpropiedades = propiedadesDAO.findPropiedadesByPrimaryKey(related_propiedades.getNumpropiedad());

		// copy into the existing record to preserve existing relationships
		if (existingpropiedades != null) {
			existingpropiedades.setNumpropiedad(related_propiedades.getNumpropiedad());
			existingpropiedades.setCalle(related_propiedades.getCalle());
			existingpropiedades.setCiudad(related_propiedades.getCiudad());
			existingpropiedades.setCodigopostal(related_propiedades.getCodigopostal());
			existingpropiedades.setTipo(related_propiedades.getTipo());
			existingpropiedades.setHabitaciones(related_propiedades.getHabitaciones());
			existingpropiedades.setRenta(related_propiedades.getRenta());
			related_propiedades = existingpropiedades;
		}

		visitas.setPropiedades(related_propiedades);
		related_propiedades.getVisitases().add(visitas);
		visitas = visitasDAO.store(visitas);
		visitasDAO.flush();

		related_propiedades = propiedadesDAO.store(related_propiedades);
		propiedadesDAO.flush();

		return visitas;
	}

	/**
	 * Delete an existing Visitas entity
	 * 
	 */
	@Transactional
	public void deleteVisitas(Visitas visitas) {
		visitasDAO.remove(visitas);
		visitasDAO.flush();
	}

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	@Transactional
	public Visitas deleteVisitasPropiedades(BigDecimal visitas_numcliente, Calendar visitas_fecha, BigDecimal visitas_numpropiedad, BigDecimal related_propiedades_numpropiedad) {
		Visitas visitas = visitasDAO.findVisitasByPrimaryKey(visitas_numcliente, visitas_fecha, visitas_numpropiedad, -1, -1);
		Propiedades related_propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(related_propiedades_numpropiedad, -1, -1);

		visitas.setPropiedades(null);
		related_propiedades.getVisitases().remove(visitas);
		visitas = visitasDAO.store(visitas);
		visitasDAO.flush();

		related_propiedades = propiedadesDAO.store(related_propiedades);
		propiedadesDAO.flush();

		propiedadesDAO.remove(related_propiedades);
		propiedadesDAO.flush();

		return visitas;
	}
}
