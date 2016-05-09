package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Clientes;
import com.duoc.inmobiliaria.domain.Propiedades;
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
public class VisitasServiceTest {

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
	protected VisitasService service;

	/**
	 * Instantiates a new VisitasServiceTest.
	 *
	 */
	public VisitasServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Visitas entity
	 * 
	 */
	@Test
	public void countVisitass() {
		Integer response = null;
		response = service.countVisitass();
		// TODO: JUnit - Add assertions to test outputs of operation: countVisitass
	}

	/**
	 * Operation Unit Test
	 * Save an existing Visitas entity
	 * 
	 */
	@Test
	public void saveVisitas() {
		// TODO: JUnit - Populate test inputs for operation: saveVisitas 
		Visitas visitas = new com.duoc.inmobiliaria.domain.Visitas();
		service.saveVisitas(visitas);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Clientes entity
	 * 
	 */
	@Test
	public void saveVisitasClientes() {
		// TODO: JUnit - Populate test inputs for operation: saveVisitasClientes 
		BigDecimal numcliente = new BigDecimal(0);
		Calendar fecha = null;
		BigDecimal numpropiedad = new BigDecimal(0);
		Clientes related_clientes = new com.duoc.inmobiliaria.domain.Clientes();
		Visitas response = null;
		response = service.saveVisitasClientes(numcliente, fecha, numpropiedad, related_clientes);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVisitasClientes
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findVisitasByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findVisitasByPrimaryKey 
		BigDecimal numcliente_1 = new BigDecimal(0);
		Calendar fecha_1 = null;
		BigDecimal numpropiedad_1 = new BigDecimal(0);
		Visitas response = null;
		response = service.findVisitasByPrimaryKey(numcliente_1, fecha_1, numpropiedad_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findVisitasByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all Visitas entity
	 * 
	 */
	@Test
	public void findAllVisitass() {
		// TODO: JUnit - Populate test inputs for operation: findAllVisitass 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Visitas> response = null;
		response = service.findAllVisitass(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllVisitass
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Clientes entity
	 * 
	 */
	@Test
	public void deleteVisitasClientes() {
		// TODO: JUnit - Populate test inputs for operation: deleteVisitasClientes 
		BigDecimal visitas_numcliente = new BigDecimal(0);
		Calendar visitas_fecha = null;
		BigDecimal visitas_numpropiedad = new BigDecimal(0);
		BigDecimal related_clientes_numcliente = new BigDecimal(0);
		Visitas response = null;
		response = service.deleteVisitasClientes(visitas_numcliente, visitas_fecha, visitas_numpropiedad, related_clientes_numcliente);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVisitasClientes
	}

	/**
	 * Operation Unit Test
	 * Load an existing Visitas entity
	 * 
	 */
	@Test
	public void loadVisitass() {
		Set<Visitas> response = null;
		response = service.loadVisitass();
		// TODO: JUnit - Add assertions to test outputs of operation: loadVisitass
	}

	/**
	 * Operation Unit Test
	 * Save an existing Propiedades entity
	 * 
	 */
	@Test
	public void saveVisitasPropiedades() {
		// TODO: JUnit - Populate test inputs for operation: saveVisitasPropiedades 
		BigDecimal numcliente_2 = new BigDecimal(0);
		Calendar fecha_2 = null;
		BigDecimal numpropiedad_2 = new BigDecimal(0);
		Propiedades related_propiedades = new com.duoc.inmobiliaria.domain.Propiedades();
		Visitas response = null;
		response = service.saveVisitasPropiedades(numcliente_2, fecha_2, numpropiedad_2, related_propiedades);
		// TODO: JUnit - Add assertions to test outputs of operation: saveVisitasPropiedades
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Visitas entity
	 * 
	 */
	@Test
	public void deleteVisitas() {
		// TODO: JUnit - Populate test inputs for operation: deleteVisitas 
		Visitas visitas_1 = new com.duoc.inmobiliaria.domain.Visitas();
		service.deleteVisitas(visitas_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Propiedades entity
	 * 
	 */
	@Test
	public void deleteVisitasPropiedades() {
		// TODO: JUnit - Populate test inputs for operation: deleteVisitasPropiedades 
		BigDecimal visitas_numcliente_1 = new BigDecimal(0);
		Calendar visitas_fecha_1 = null;
		BigDecimal visitas_numpropiedad_1 = new BigDecimal(0);
		BigDecimal related_propiedades_numpropiedad = new BigDecimal(0);
		Visitas response = null;
		response = service.deleteVisitasPropiedades(visitas_numcliente_1, visitas_fecha_1, visitas_numpropiedad_1, related_propiedades_numpropiedad);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteVisitasPropiedades
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
