package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Propiedades;
import com.duoc.inmobiliaria.domain.Propietarios;

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
public class PropietariosServiceTest {

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
	protected PropietariosService service;

	/**
	 * Instantiates a new PropietariosServiceTest.
	 *
	 */
	public PropietariosServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Propietarios entity
	 * 
	 */
	@Test
	public void savePropietarios() {
		// TODO: JUnit - Populate test inputs for operation: savePropietarios 
		Propietarios propietarios = new com.duoc.inmobiliaria.domain.Propietarios();
		service.savePropietarios(propietarios);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findPropietariosByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findPropietariosByPrimaryKey 
		BigDecimal numpropietario = new BigDecimal(0);
		Propietarios response = null;
		response = service.findPropietariosByPrimaryKey(numpropietario);
		// TODO: JUnit - Add assertions to test outputs of operation: findPropietariosByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Propietarios entity
	 * 
	 */
	@Test
	public void deletePropietarios() {
		// TODO: JUnit - Populate test inputs for operation: deletePropietarios 
		Propietarios propietarios_1 = new com.duoc.inmobiliaria.domain.Propietarios();
		service.deletePropietarios(propietarios_1);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Propiedades entity
	 * 
	 */
	@Test
	public void deletePropietariosPropiedadeses() {
		// TODO: JUnit - Populate test inputs for operation: deletePropietariosPropiedadeses 
		BigDecimal propietarios_numpropietario = new BigDecimal(0);
		BigDecimal related_propiedadeses_numpropiedad = new BigDecimal(0);
		Propietarios response = null;
		response = service.deletePropietariosPropiedadeses(propietarios_numpropietario, related_propiedadeses_numpropiedad);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePropietariosPropiedadeses
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Propietarios entity
	 * 
	 */
	@Test
	public void countPropietarioss() {
		Integer response = null;
		response = service.countPropietarioss();
		// TODO: JUnit - Add assertions to test outputs of operation: countPropietarioss
	}

	/**
	 * Operation Unit Test
	 * Return all Propietarios entity
	 * 
	 */
	@Test
	public void findAllPropietarioss() {
		// TODO: JUnit - Populate test inputs for operation: findAllPropietarioss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Propietarios> response = null;
		response = service.findAllPropietarioss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllPropietarioss
	}

	/**
	 * Operation Unit Test
	 * Load an existing Propietarios entity
	 * 
	 */
	@Test
	public void loadPropietarioss() {
		Set<Propietarios> response = null;
		response = service.loadPropietarioss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadPropietarioss
	}

	/**
	 * Operation Unit Test
	 * Save an existing Propiedades entity
	 * 
	 */
	@Test
	public void savePropietariosPropiedadeses() {
		// TODO: JUnit - Populate test inputs for operation: savePropietariosPropiedadeses 
		BigDecimal numpropietario_1 = new BigDecimal(0);
		Propiedades related_propiedadeses = new com.duoc.inmobiliaria.domain.Propiedades();
		Propietarios response = null;
		response = service.savePropietariosPropiedadeses(numpropietario_1, related_propiedadeses);
		// TODO: JUnit - Add assertions to test outputs of operation: savePropietariosPropiedadeses
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
