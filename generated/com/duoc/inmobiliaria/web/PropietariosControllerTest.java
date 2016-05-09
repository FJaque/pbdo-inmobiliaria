package com.duoc.inmobiliaria.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>PropietariosController</code> controller.
 *
 * @see com.duoc.inmobiliaria.web.PropietariosController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/AplicacionInmobiliaria-security-context.xml",
		"file:./resources/AplicacionInmobiliaria-service-context.xml",
		"file:./resources/AplicacionInmobiliaria-dao-context.xml",
		"file:./resources/AplicacionInmobiliaria-web-context.xml" })
public class PropietariosControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editPropietariosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPropietariosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPropietariosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPropietariosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPropietariosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPropietariosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePropietariosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePropietariosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePropietariosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePropietariosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePropietariosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePropietariosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePropietariosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePropietariosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePropietariosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPropietariosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPropietariosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPropietariosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listPropietariosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistPropietariosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listPropietariosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexPropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexPropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexPropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editPropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>propietariosControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetpropietariosControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/propietariosController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropietariosController controller = (PropietariosController) context.getBean("PropietariosController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}