package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Empleados;
import com.duoc.inmobiliaria.domain.Oficinas;

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
public class OficinasServiceTest {

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
	protected OficinasService service;

	/**
	 * Instantiates a new OficinasServiceTest.
	 *
	 */
	public OficinasServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Empleados entity
	 * 
	 */
	@Test
	public void deleteOficinasEmpleadoses() {
		// TODO: JUnit - Populate test inputs for operation: deleteOficinasEmpleadoses 
		BigDecimal oficinas_numoficina = new BigDecimal(0);
		BigDecimal related_empleadoses_numempleado = new BigDecimal(0);
		Oficinas response = null;
		response = service.deleteOficinasEmpleadoses(oficinas_numoficina, related_empleadoses_numempleado);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteOficinasEmpleadoses
	}

	/**
	 * Operation Unit Test
	 * Return all Oficinas entity
	 * 
	 */
	@Test
	public void findAllOficinass() {
		// TODO: JUnit - Populate test inputs for operation: findAllOficinass 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Oficinas> response = null;
		response = service.findAllOficinass(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllOficinass
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Oficinas entity
	 * 
	 */
	@Test
	public void countOficinass() {
		Integer response = null;
		response = service.countOficinass();
		// TODO: JUnit - Add assertions to test outputs of operation: countOficinass
	}

	/**
	 * Operation Unit Test
	 * Save an existing Empleados entity
	 * 
	 */
	@Test
	public void saveOficinasEmpleadoses() {
		// TODO: JUnit - Populate test inputs for operation: saveOficinasEmpleadoses 
		BigDecimal numoficina = new BigDecimal(0);
		Empleados related_empleadoses = new com.duoc.inmobiliaria.domain.Empleados();
		Oficinas response = null;
		response = service.saveOficinasEmpleadoses(numoficina, related_empleadoses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveOficinasEmpleadoses
	}

	/**
	 * Operation Unit Test
	 * Load an existing Oficinas entity
	 * 
	 */
	@Test
	public void loadOficinass() {
		Set<Oficinas> response = null;
		response = service.loadOficinass();
		// TODO: JUnit - Add assertions to test outputs of operation: loadOficinass
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findOficinasByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findOficinasByPrimaryKey 
		BigDecimal numoficina_1 = new BigDecimal(0);
		Oficinas response = null;
		response = service.findOficinasByPrimaryKey(numoficina_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findOficinasByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Oficinas entity
	 * 
	 */
	@Test
	public void saveOficinas() {
		// TODO: JUnit - Populate test inputs for operation: saveOficinas 
		Oficinas oficinas = new com.duoc.inmobiliaria.domain.Oficinas();
		service.saveOficinas(oficinas);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Oficinas entity
	 * 
	 */
	@Test
	public void deleteOficinas() {
		// TODO: JUnit - Populate test inputs for operation: deleteOficinas 
		Oficinas oficinas_1 = new com.duoc.inmobiliaria.domain.Oficinas();
		service.deleteOficinas(oficinas_1);
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
