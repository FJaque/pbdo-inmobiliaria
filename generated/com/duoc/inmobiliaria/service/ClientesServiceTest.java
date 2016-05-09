package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Arriendos;
import com.duoc.inmobiliaria.domain.Clientes;
import com.duoc.inmobiliaria.domain.Visitas;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/AplicacionInmobiliaria-security-context.xml",
		"file:./resources/AplicacionInmobiliaria-service-context.xml",
		"file:./resources/AplicacionInmobiliaria-dao-context.xml",
		"file:./resources/AplicacionInmobiliaria-web-context.xml" })
@Transactional
public class ClientesServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected ClientesService service;

	/**
	 * Instantiates a new ClientesServiceTest.
	 *
	 */
	public ClientesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Arriendos entity
	 * 
	 */
	@Test
	public void saveClientesArriendoses() {
		// TODO: JUnit - Populate test inputs for operation: saveClientesArriendoses 
		BigDecimal numcliente = new BigDecimal(0);
		Arriendos related_arriendoses = new com.duoc.inmobiliaria.domain.Arriendos();
		Clientes response = null;
		response = service.saveClientesArriendoses(numcliente, related_arriendoses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveClientesArriendoses
	}

	/**
	 * Operation Unit Test
	 * Load an existing Clientes entity
	 * 
	 */
	@Test
	public void loadClientess() {
		Set<Clientes> response = null;
		response = service.loadClientess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadClientess
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Visitas entity
	 * 
	 */
	@Test
	public void deleteClientesVisitases() {
		// TODO: JUnit - Populate test inputs for operation: deleteClientesVisitases 
		BigDecimal clientes_numcliente = new BigDecimal(0);
		BigDecimal related_visitases_numcliente = new BigDecimal(0);
		Calendar related_visitases_fecha = null;
		BigDecimal related_visitases_numpropiedad = new BigDecimal(0);
		Clientes response = null;
		response = service.deleteClientesVisitases(clientes_numcliente, related_visitases_numcliente, related_visitases_fecha, related_visitases_numpropiedad);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteClientesVisitases
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Clientes entity
	 * 
	 */
	@Test
	public void countClientess() {
		Integer response = null;
		response = service.countClientess();
		// TODO: JUnit - Add assertions to test outputs of operation: countClientess
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Clientes entity
	 * 
	 */
	@Test
	public void deleteClientes() {
		// TODO: JUnit - Populate test inputs for operation: deleteClientes 
		Clientes clientes = new com.duoc.inmobiliaria.domain.Clientes();
		service.deleteClientes(clientes);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Visitas entity
	 * 
	 */
	@Test
	public void saveClientesVisitases() {
		// TODO: JUnit - Populate test inputs for operation: saveClientesVisitases 
		BigDecimal numcliente_1 = new BigDecimal(0);
		Visitas related_visitases = new com.duoc.inmobiliaria.domain.Visitas();
		Clientes response = null;
		response = service.saveClientesVisitases(numcliente_1, related_visitases);
		// TODO: JUnit - Add assertions to test outputs of operation: saveClientesVisitases
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Arriendos entity
	 * 
	 */
	@Test
	public void deleteClientesArriendoses() {
		// TODO: JUnit - Populate test inputs for operation: deleteClientesArriendoses 
		BigDecimal clientes_numcliente_1 = new BigDecimal(0);
		BigDecimal related_arriendoses_numarriendo = new BigDecimal(0);
		Clientes response = null;
		response = service.deleteClientesArriendoses(clientes_numcliente_1, related_arriendoses_numarriendo);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteClientesArriendoses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Clientes entity
	 * 
	 */
	@Test
	public void saveClientes() {
		// TODO: JUnit - Populate test inputs for operation: saveClientes 
		Clientes clientes_1 = new com.duoc.inmobiliaria.domain.Clientes();
		service.saveClientes(clientes_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findClientesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findClientesByPrimaryKey 
		BigDecimal numcliente_2 = new BigDecimal(0);
		Clientes response = null;
		response = service.findClientesByPrimaryKey(numcliente_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findClientesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all Clientes entity
	 * 
	 */
	@Test
	public void findAllClientess() {
		// TODO: JUnit - Populate test inputs for operation: findAllClientess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Clientes> response = null;
		response = service.findAllClientess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllClientess
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
