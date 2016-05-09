package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Arriendos;
import com.duoc.inmobiliaria.domain.Clientes;
import com.duoc.inmobiliaria.domain.Propiedades;

import java.math.BigDecimal;

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
public class ArriendosServiceTest {

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
	protected ArriendosService service;

	/**
	 * Instantiates a new ArriendosServiceTest.
	 *
	 */
	public ArriendosServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing Arriendos entity
	 * 
	 */
	@Test
	public void loadArriendoss() {
		Set<Arriendos> response = null;
		response = service.loadArriendoss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadArriendoss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Propiedades entity
	 * 
	 */
	@Test
	public void saveArriendosPropiedades() {
		// TODO: JUnit - Populate test inputs for operation: saveArriendosPropiedades 
		BigDecimal numarriendo = new BigDecimal(0);
		Propiedades related_propiedades = new com.duoc.inmobiliaria.domain.Propiedades();
		Arriendos response = null;
		response = service.saveArriendosPropiedades(numarriendo, related_propiedades);
		// TODO: JUnit - Add assertions to test outputs of operation: saveArriendosPropiedades
	}

	/**
	 * Operation Unit Test
	 * Save an existing Clientes entity
	 * 
	 */
	@Test
	public void saveArriendosClientes() {
		// TODO: JUnit - Populate test inputs for operation: saveArriendosClientes 
		BigDecimal numarriendo_1 = new BigDecimal(0);
		Clientes related_clientes = new com.duoc.inmobiliaria.domain.Clientes();
		Arriendos response = null;
		response = service.saveArriendosClientes(numarriendo_1, related_clientes);
		// TODO: JUnit - Add assertions to test outputs of operation: saveArriendosClientes
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findArriendosByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findArriendosByPrimaryKey 
		BigDecimal numarriendo_2 = new BigDecimal(0);
		Arriendos response = null;
		response = service.findArriendosByPrimaryKey(numarriendo_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findArriendosByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Propiedades entity
	 * 
	 */
	@Test
	public void deleteArriendosPropiedades() {
		// TODO: JUnit - Populate test inputs for operation: deleteArriendosPropiedades 
		BigDecimal arriendos_numarriendo = new BigDecimal(0);
		BigDecimal related_propiedades_numpropiedad = new BigDecimal(0);
		Arriendos response = null;
		response = service.deleteArriendosPropiedades(arriendos_numarriendo, related_propiedades_numpropiedad);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteArriendosPropiedades
	}

	/**
	 * Operation Unit Test
	 * Save an existing Arriendos entity
	 * 
	 */
	@Test
	public void saveArriendos() {
		// TODO: JUnit - Populate test inputs for operation: saveArriendos 
		Arriendos arriendos = new com.duoc.inmobiliaria.domain.Arriendos();
		service.saveArriendos(arriendos);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Arriendos entity
	 * 
	 */
	@Test
	public void deleteArriendos() {
		// TODO: JUnit - Populate test inputs for operation: deleteArriendos 
		Arriendos arriendos_1 = new com.duoc.inmobiliaria.domain.Arriendos();
		service.deleteArriendos(arriendos_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Clientes entity
	 * 
	 */
	@Test
	public void deleteArriendosClientes() {
		// TODO: JUnit - Populate test inputs for operation: deleteArriendosClientes 
		BigDecimal arriendos_numarriendo_1 = new BigDecimal(0);
		BigDecimal related_clientes_numcliente = new BigDecimal(0);
		Arriendos response = null;
		response = service.deleteArriendosClientes(arriendos_numarriendo_1, related_clientes_numcliente);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteArriendosClientes
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Arriendos entity
	 * 
	 */
	@Test
	public void countArriendoss() {
		Integer response = null;
		response = service.countArriendoss();
		// TODO: JUnit - Add assertions to test outputs of operation: countArriendoss
	}

	/**
	 * Operation Unit Test
	 * Return all Arriendos entity
	 * 
	 */
	@Test
	public void findAllArriendoss() {
		// TODO: JUnit - Populate test inputs for operation: findAllArriendoss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Arriendos> response = null;
		response = service.findAllArriendoss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllArriendoss
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
