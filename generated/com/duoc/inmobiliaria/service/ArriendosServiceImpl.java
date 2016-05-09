package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.dao.ArriendosDAO;
import com.duoc.inmobiliaria.dao.ClientesDAO;
import com.duoc.inmobiliaria.dao.PropiedadesDAO;

import com.duoc.inmobiliaria.domain.Arriendos;
import com.duoc.inmobiliaria.domain.Clientes;
import com.duoc.inmobiliaria.domain.Propiedades;

import java.math.BigDecimal;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Arriendos entities
 * 
 */

@Service("ArriendosService")
@Transactional
public class ArriendosServiceImpl implements ArriendosService {

	/**
	 * DAO injected by Spring that manages Arriendos entities
	 * 
	 */
	@Autowired
	private ArriendosDAO arriendosDAO;

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
	 * Instantiates a new ArriendosServiceImpl.
	 *
	 */
	public ArriendosServiceImpl() {
	}

	/**
	 * Load an existing Arriendos entity
	 * 
	 */
	@Transactional
	public Set<Arriendos> loadArriendoss() {
		return arriendosDAO.findAllArriendoss();
	}

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	@Transactional
	public Arriendos saveArriendosPropiedades(BigDecimal numarriendo, Propiedades related_propiedades) {
		Arriendos arriendos = arriendosDAO.findArriendosByPrimaryKey(numarriendo, -1, -1);
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

		arriendos.setPropiedades(related_propiedades);
		related_propiedades.getArriendoses().add(arriendos);
		arriendos = arriendosDAO.store(arriendos);
		arriendosDAO.flush();

		related_propiedades = propiedadesDAO.store(related_propiedades);
		propiedadesDAO.flush();

		return arriendos;
	}

	/**
	 * Save an existing Clientes entity
	 * 
	 */
	@Transactional
	public Arriendos saveArriendosClientes(BigDecimal numarriendo, Clientes related_clientes) {
		Arriendos arriendos = arriendosDAO.findArriendosByPrimaryKey(numarriendo, -1, -1);
		Clientes existingclientes = clientesDAO.findClientesByPrimaryKey(related_clientes.getNumcliente());

		// copy into the existing record to preserve existing relationships
		if (existingclientes != null) {
			existingclientes.setNumcliente(related_clientes.getNumcliente());
			existingclientes.setNombre(related_clientes.getNombre());
			existingclientes.setApellido(related_clientes.getApellido());
			existingclientes.setDireccion(related_clientes.getDireccion());
			related_clientes = existingclientes;
		}

		arriendos.setClientes(related_clientes);
		related_clientes.getArriendoses().add(arriendos);
		arriendos = arriendosDAO.store(arriendos);
		arriendosDAO.flush();

		related_clientes = clientesDAO.store(related_clientes);
		clientesDAO.flush();

		return arriendos;
	}

	/**
	 */
	@Transactional
	public Arriendos findArriendosByPrimaryKey(BigDecimal numarriendo) {
		return arriendosDAO.findArriendosByPrimaryKey(numarriendo);
	}

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	@Transactional
	public Arriendos deleteArriendosPropiedades(BigDecimal arriendos_numarriendo, BigDecimal related_propiedades_numpropiedad) {
		Arriendos arriendos = arriendosDAO.findArriendosByPrimaryKey(arriendos_numarriendo, -1, -1);
		Propiedades related_propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(related_propiedades_numpropiedad, -1, -1);

		arriendos.setPropiedades(null);
		related_propiedades.getArriendoses().remove(arriendos);
		arriendos = arriendosDAO.store(arriendos);
		arriendosDAO.flush();

		related_propiedades = propiedadesDAO.store(related_propiedades);
		propiedadesDAO.flush();

		propiedadesDAO.remove(related_propiedades);
		propiedadesDAO.flush();

		return arriendos;
	}

	/**
	 * Save an existing Arriendos entity
	 * 
	 */
	@Transactional
	public void saveArriendos(Arriendos arriendos) {
		Arriendos existingArriendos = arriendosDAO.findArriendosByPrimaryKey(arriendos.getNumarriendo());

		if (existingArriendos != null) {
			if (existingArriendos != arriendos) {
				existingArriendos.setNumarriendo(arriendos.getNumarriendo());
				existingArriendos.setRenta(arriendos.getRenta());
				existingArriendos.setFormapago(arriendos.getFormapago());
				existingArriendos.setPagado(arriendos.getPagado());
				existingArriendos.setIniciorenta(arriendos.getIniciorenta());
				existingArriendos.setFinrenta(arriendos.getFinrenta());
				existingArriendos.setMespago(arriendos.getMespago());
			}
			arriendos = arriendosDAO.store(existingArriendos);
		} else {
			arriendos = arriendosDAO.store(arriendos);
		}
		arriendosDAO.flush();
	}

	/**
	 * Delete an existing Arriendos entity
	 * 
	 */
	@Transactional
	public void deleteArriendos(Arriendos arriendos) {
		arriendosDAO.remove(arriendos);
		arriendosDAO.flush();
	}

	/**
	 * Delete an existing Clientes entity
	 * 
	 */
	@Transactional
	public Arriendos deleteArriendosClientes(BigDecimal arriendos_numarriendo, BigDecimal related_clientes_numcliente) {
		Arriendos arriendos = arriendosDAO.findArriendosByPrimaryKey(arriendos_numarriendo, -1, -1);
		Clientes related_clientes = clientesDAO.findClientesByPrimaryKey(related_clientes_numcliente, -1, -1);

		arriendos.setClientes(null);
		related_clientes.getArriendoses().remove(arriendos);
		arriendos = arriendosDAO.store(arriendos);
		arriendosDAO.flush();

		related_clientes = clientesDAO.store(related_clientes);
		clientesDAO.flush();

		clientesDAO.remove(related_clientes);
		clientesDAO.flush();

		return arriendos;
	}

	/**
	 * Return a count of all Arriendos entity
	 * 
	 */
	@Transactional
	public Integer countArriendoss() {
		return ((Long) arriendosDAO.createQuerySingleResult("select count(o) from Arriendos o").getSingleResult()).intValue();
	}

	/**
	 * Return all Arriendos entity
	 * 
	 */
	@Transactional
	public List<Arriendos> findAllArriendoss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Arriendos>(arriendosDAO.findAllArriendoss(startResult, maxRows));
	}
}
