package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Empleados;
import com.duoc.inmobiliaria.domain.Oficinas;
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
public class EmpleadosServiceTest {

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
	protected EmpleadosService service;

	/**
	 * Instantiates a new EmpleadosServiceTest.
	 *
	 */
	public EmpleadosServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Propiedades entity
	 * 
	 */
	@Test
	public void saveEmpleadosPropiedadeses() {
		// TODO: JUnit - Populate test inputs for operation: saveEmpleadosPropiedadeses 
		BigDecimal numempleado = new BigDecimal(0);
		Propiedades related_propiedadeses = new com.duoc.inmobiliaria.domain.Propiedades();
		Empleados response = null;
		response = service.saveEmpleadosPropiedadeses(numempleado, related_propiedadeses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveEmpleadosPropiedadeses
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Empleados entity
	 * 
	 */
	@Test
	public void countEmpleadoss() {
		Integer response = null;
		response = service.countEmpleadoss();
		// TODO: JUnit - Add assertions to test outputs of operation: countEmpleadoss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Empleados entity
	 * 
	 */
	@Test
	public void deleteEmpleados() {
		// TODO: JUnit - Populate test inputs for operation: deleteEmpleados 
		Empleados empleados = new com.duoc.inmobiliaria.domain.Empleados();
		service.deleteEmpleados(empleados);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Oficinas entity
	 * 
	 */
	@Test
	public void deleteEmpleadosOficinas() {
		// TODO: JUnit - Populate test inputs for operation: deleteEmpleadosOficinas 
		BigDecimal empleados_numempleado = new BigDecimal(0);
		BigDecimal related_oficinas_numoficina = new BigDecimal(0);
		Empleados response = null;
		response = service.deleteEmpleadosOficinas(empleados_numempleado, related_oficinas_numoficina);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteEmpleadosOficinas
	}

	/**
	 * Operation Unit Test
	 * Save an existing Oficinas entity
	 * 
	 */
	@Test
	public void saveEmpleadosOficinas() {
		// TODO: JUnit - Populate test inputs for operation: saveEmpleadosOficinas 
		BigDecimal numempleado_1 = new BigDecimal(0);
		Oficinas related_oficinas = new com.duoc.inmobiliaria.domain.Oficinas();
		Empleados response = null;
		response = service.saveEmpleadosOficinas(numempleado_1, related_oficinas);
		// TODO: JUnit - Add assertions to test outputs of operation: saveEmpleadosOficinas
	}

	/**
	 * Operation Unit Test
	 * Return all Empleados entity
	 * 
	 */
	@Test
	public void findAllEmpleadoss() {
		// TODO: JUnit - Populate test inputs for operation: findAllEmpleadoss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Empleados> response = null;
		response = service.findAllEmpleadoss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllEmpleadoss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Propiedades entity
	 * 
	 */
	@Test
	public void deleteEmpleadosPropiedadeses() {
		// TODO: JUnit - Populate test inputs for operation: deleteEmpleadosPropiedadeses 
		BigDecimal empleados_numempleado_1 = new BigDecimal(0);
		BigDecimal related_propiedadeses_numpropiedad = new BigDecimal(0);
		Empleados response = null;
		response = service.deleteEmpleadosPropiedadeses(empleados_numempleado_1, related_propiedadeses_numpropiedad);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteEmpleadosPropiedadeses
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findEmpleadosByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findEmpleadosByPrimaryKey 
		BigDecimal numempleado_2 = new BigDecimal(0);
		Empleados response = null;
		response = service.findEmpleadosByPrimaryKey(numempleado_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findEmpleadosByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Empleados entity
	 * 
	 */
	@Test
	public void saveEmpleados() {
		// TODO: JUnit - Populate test inputs for operation: saveEmpleados 
		Empleados empleados_1 = new com.duoc.inmobiliaria.domain.Empleados();
		service.saveEmpleados(empleados_1);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Empleados entity
	 * 
	 */
	@Test
	public void loadEmpleadoss() {
		Set<Empleados> response = null;
		response = service.loadEmpleadoss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadEmpleadoss
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
