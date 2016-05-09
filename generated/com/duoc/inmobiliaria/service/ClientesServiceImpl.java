package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.dao.ArriendosDAO;
import com.duoc.inmobiliaria.dao.ClientesDAO;
import com.duoc.inmobiliaria.dao.VisitasDAO;

import com.duoc.inmobiliaria.domain.Arriendos;
import com.duoc.inmobiliaria.domain.Clientes;
import com.duoc.inmobiliaria.domain.Visitas;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Clientes entities
 * 
 */

@Service("ClientesService")
@Transactional
public class ClientesServiceImpl implements ClientesService {

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
	 * DAO injected by Spring that manages Visitas entities
	 * 
	 */
	@Autowired
	private VisitasDAO visitasDAO;

	/**
	 * Instantiates a new ClientesServiceImpl.
	 *
	 */
	public ClientesServiceImpl() {
	}

	/**
	 * Save an existing Arriendos entity
	 * 
	 */
	@Transactional
	public Clientes saveClientesArriendoses(BigDecimal numcliente, Arriendos related_arriendoses) {
		Clientes clientes = clientesDAO.findClientesByPrimaryKey(numcliente, -1, -1);
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

		related_arriendoses.setClientes(clientes);
		clientes.getArriendoses().add(related_arriendoses);
		related_arriendoses = arriendosDAO.store(related_arriendoses);
		arriendosDAO.flush();

		clientes = clientesDAO.store(clientes);
		clientesDAO.flush();

		return clientes;
	}

	/**
	 * Load an existing Clientes entity
	 * 
	 */
	@Transactional
	public Set<Clientes> loadClientess() {
		return clientesDAO.findAllClientess();
	}

	/**
	 * Delete an existing Visitas entity
	 * 
	 */
	@Transactional
	public Clientes deleteClientesVisitases(BigDecimal clientes_numcliente, BigDecimal related_visitases_numcliente, Calendar related_visitases_fecha, BigDecimal related_visitases_numpropiedad) {
		Visitas related_visitases = visitasDAO.findVisitasByPrimaryKey(related_visitases_numcliente, related_visitases_fecha, related_visitases_numpropiedad, -1, -1);

		Clientes clientes = clientesDAO.findClientesByPrimaryKey(clientes_numcliente, -1, -1);

		related_visitases.setClientes(null);
		clientes.getVisitases().remove(related_visitases);

		visitasDAO.remove(related_visitases);
		visitasDAO.flush();

		return clientes;
	}

	/**
	 * Return a count of all Clientes entity
	 * 
	 */
	@Transactional
	public Integer countClientess() {
		return ((Long) clientesDAO.createQuerySingleResult("select count(o) from Clientes o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Clientes entity
	 * 
	 */
	@Transactional
	public void deleteClientes(Clientes clientes) {
		clientesDAO.remove(clientes);
		clientesDAO.flush();
	}

	/**
	 * Save an existing Visitas entity
	 * 
	 */
	@Transactional
	public Clientes saveClientesVisitases(BigDecimal numcliente, Visitas related_visitases) {
		Clientes clientes = clientesDAO.findClientesByPrimaryKey(numcliente, -1, -1);
		Visitas existingvisitases = visitasDAO.findVisitasByPrimaryKey(related_visitases.getNumcliente(), related_visitases.getFecha(), related_visitases.getNumpropiedad());

		// copy into the existing record to preserve existing relationships
		if (existingvisitases != null) {
			existingvisitases.setNumcliente(related_visitases.getNumcliente());
			existingvisitases.setFecha(related_visitases.getFecha());
			existingvisitases.setNumpropiedad(related_visitases.getNumpropiedad());
			existingvisitases.setComentario(related_visitases.getComentario());
			related_visitases = existingvisitases;
		}

		related_visitases.setClientes(clientes);
		clientes.getVisitases().add(related_visitases);
		related_visitases = visitasDAO.store(related_visitases);
		visitasDAO.flush();

		clientes = clientesDAO.store(clientes);
		clientesDAO.flush();

		return clientes;
	}

	/**
	 * Delete an existing Arriendos entity
	 * 
	 */
	@Transactional
	public Clientes deleteClientesArriendoses(BigDecimal clientes_numcliente, BigDecimal related_arriendoses_numarriendo) {
		Arriendos related_arriendoses = arriendosDAO.findArriendosByPrimaryKey(related_arriendoses_numarriendo, -1, -1);

		Clientes clientes = clientesDAO.findClientesByPrimaryKey(clientes_numcliente, -1, -1);

		related_arriendoses.setClientes(null);
		clientes.getArriendoses().remove(related_arriendoses);

		arriendosDAO.remove(related_arriendoses);
		arriendosDAO.flush();

		return clientes;
	}

	/**
	 * Save an existing Clientes entity
	 * 
	 */
	@Transactional
	public void saveClientes(Clientes clientes) {
		Clientes existingClientes = clientesDAO.findClientesByPrimaryKey(clientes.getNumcliente());

		if (existingClientes != null) {
			if (existingClientes != clientes) {
				existingClientes.setNumcliente(clientes.getNumcliente());
				existingClientes.setNombre(clientes.getNombre());
				existingClientes.setApellido(clientes.getApellido());
				existingClientes.setDireccion(clientes.getDireccion());
			}
			clientes = clientesDAO.store(existingClientes);
		} else {
			clientes = clientesDAO.store(clientes);
		}
		clientesDAO.flush();
	}

	/**
	 */
	@Transactional
	public Clientes findClientesByPrimaryKey(BigDecimal numcliente) {
		return clientesDAO.findClientesByPrimaryKey(numcliente);
	}

	/**
	 * Return all Clientes entity
	 * 
	 */
	@Transactional
	public List<Clientes> findAllClientess(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Clientes>(clientesDAO.findAllClientess(startResult, maxRows));
	}
}
