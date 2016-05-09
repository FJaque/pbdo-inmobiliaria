package com.duoc.inmobiliaria.service;

import com.duoc.inmobiliaria.domain.Arriendos;
import com.duoc.inmobiliaria.domain.Empleados;
import com.duoc.inmobiliaria.domain.Propiedades;
import com.duoc.inmobiliaria.domain.Propietarios;
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
public class PropiedadesServiceTest {

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
	protected PropiedadesService service;

	/**
	 * Instantiates a new PropiedadesServiceTest.
	 *
	 */
	public PropiedadesServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Propietarios entity
	 * 
	 */
	@Test
	public void deletePropiedadesPropietarios() {
		// TODO: JUnit - Populate test inputs for operation: deletePropiedadesPropietarios 
		BigDecimal propiedades_numpropiedad = new BigDecimal(0);
		BigDecimal related_propietarios_numpropietario = new BigDecimal(0);
		Propiedades response = null;
		response = service.deletePropiedadesPropietarios(propiedades_numpropiedad, related_propietarios_numpropietario);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePropiedadesPropietarios
	}

	/**
	 * Operation Unit Test
	 * Save an existing Propietarios entity
	 * 
	 */
	@Test
	public void savePropiedadesPropietarios() {
		// TODO: JUnit - Populate test inputs for operation: savePropiedadesPropietarios 
		BigDecimal numpropiedad = new BigDecimal(0);
		Propietarios related_propietarios = new com.duoc.inmobiliaria.domain.Propietarios();
		Propiedades response = null;
		response = service.savePropiedadesPropietarios(numpropiedad, related_propietarios);
		// TODO: JUnit - Add assertions to test outputs of operation: savePropiedadesPropietarios
	}

	/**
	 * Operation Unit Test
	 * Return all Propiedades entity
	 * 
	 */
	@Test
	public void findAllPropiedadess() {
		// TODO: JUnit - Populate test inputs for operation: findAllPropiedadess 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Propiedades> response = null;
		response = service.findAllPropiedadess(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllPropiedadess
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findPropiedadesByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findPropiedadesByPrimaryKey 
		BigDecimal numpropiedad_1 = new BigDecimal(0);
		Propiedades response = null;
		response = service.findPropiedadesByPrimaryKey(numpropiedad_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findPropiedadesByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Propiedades entity
	 * 
	 */
	@Test
	public void savePropiedades() {
		// TODO: JUnit - Populate test inputs for operation: savePropiedades 
		Propiedades propiedades = new com.duoc.inmobiliaria.domain.Propiedades();
		service.savePropiedades(propiedades);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Propiedades entity
	 * 
	 */
	@Test
	public void countPropiedadess() {
		Integer response = null;
		response = service.countPropiedadess();
		// TODO: JUnit - Add assertions to test outputs of operation: countPropiedadess
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Empleados entity
	 * 
	 */
	@Test
	public void deletePropiedadesEmpleados() {
		// TODO: JUnit - Populate test inputs for operation: deletePropiedadesEmpleados 
		BigDecimal propiedades_numpropiedad_1 = new BigDecimal(0);
		BigDecimal related_empleados_numempleado = new BigDecimal(0);
		Propiedades response = null;
		response = service.deletePropiedadesEmpleados(propiedades_numpropiedad_1, related_empleados_numempleado);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePropiedadesEmpleados
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Arriendos entity
	 * 
	 */
	@Test
	public void deletePropiedadesArriendoses() {
		// TODO: JUnit - Populate test inputs for operation: deletePropiedadesArriendoses 
		BigDecimal propiedades_numpropiedad_2 = new BigDecimal(0);
		BigDecimal related_arriendoses_numarriendo = new BigDecimal(0);
		Propiedades response = null;
		response = service.deletePropiedadesArriendoses(propiedades_numpropiedad_2, related_arriendoses_numarriendo);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePropiedadesArriendoses
	}

	/**
	 * Operation Unit Test
	 * Save an existing Empleados entity
	 * 
	 */
	@Test
	public void savePropiedadesEmpleados() {
		// TODO: JUnit - Populate test inputs for operation: savePropiedadesEmpleados 
		BigDecimal numpropiedad_2 = new BigDecimal(0);
		Empleados related_empleados = new com.duoc.inmobiliaria.domain.Empleados();
		Propiedades response = null;
		response = service.savePropiedadesEmpleados(numpropiedad_2, related_empleados);
		// TODO: JUnit - Add assertions to test outputs of operation: savePropiedadesEmpleados
	}

	/**
	 * Operation Unit Test
	 * Save an existing Visitas entity
	 * 
	 */
	@Test
	public void savePropiedadesVisitases() {
		// TODO: JUnit - Populate test inputs for operation: savePropiedadesVisitases 
		BigDecimal numpropiedad_3 = new BigDecimal(0);
		Visitas related_visitases = new com.duoc.inmobiliaria.domain.Visitas();
		Propiedades response = null;
		response = service.savePropiedadesVisitases(numpropiedad_3, related_visitases);
		// TODO: JUnit - Add assertions to test outputs of operation: savePropiedadesVisitases
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Visitas entity
	 * 
	 */
	@Test
	public void deletePropiedadesVisitases() {
		// TODO: JUnit - Populate test inputs for operation: deletePropiedadesVisitases 
		BigDecimal propiedades_numpropiedad_3 = new BigDecimal(0);
		BigDecimal related_visitases_numcliente = new BigDecimal(0);
		Calendar related_visitases_fecha = null;
		BigDecimal related_visitases_numpropiedad = new BigDecimal(0);
		Propiedades response = null;
		response = service.deletePropiedadesVisitases(propiedades_numpropiedad_3, related_visitases_numcliente, related_visitases_fecha, related_visitases_numpropiedad);
		// TODO: JUnit - Add assertions to test outputs of operation: deletePropiedadesVisitases
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Propiedades entity
	 * 
	 */
	@Test
	public void deletePropiedades() {
		// TODO: JUnit - Populate test inputs for operation: deletePropiedades 
		Propiedades propiedades_1 = new com.duoc.inmobiliaria.domain.Propiedades();
		service.deletePropiedades(propiedades_1);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Propiedades entity
	 * 
	 */
	@Test
	public void loadPropiedadess() {
		Set<Propiedades> response = null;
		response = service.loadPropiedadess();
		// TODO: JUnit - Add assertions to test outputs of operation: loadPropiedadess
	}

	/**
	 * Operation Unit Test
	 * Save an existing Arriendos entity
	 * 
	 */
	@Test
	public void savePropiedadesArriendoses() {
		// TODO: JUnit - Populate test inputs for operation: savePropiedadesArriendoses 
		BigDecimal numpropiedad_4 = new BigDecimal(0);
		Arriendos related_arriendoses = new com.duoc.inmobiliaria.domain.Arriendos();
		Propiedades response = null;
		response = service.savePropiedadesArriendoses(numpropiedad_4, related_arriendoses);
		// TODO: JUnit - Add assertions to test outputs of operation: savePropiedadesArriendoses
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
