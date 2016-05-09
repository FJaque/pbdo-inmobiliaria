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
 * Unit test for the <code>PropiedadesController</code> controller.
 *
 * @see com.duoc.inmobiliaria.web.PropiedadesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/AplicacionInmobiliaria-security-context.xml",
		"file:./resources/AplicacionInmobiliaria-service-context.xml",
		"file:./resources/AplicacionInmobiliaria-dao-context.xml",
		"file:./resources/AplicacionInmobiliaria-web-context.xml" })
public class PropiedadesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editPropiedadesEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPropiedadesEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPropiedadesEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPropiedadesEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPropiedadesEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPropiedadesEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePropiedadesEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePropiedadesEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePropiedadesEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePropiedadesEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePropiedadesEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePropiedadesEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePropiedadesEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePropiedadesEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePropiedadesEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPropiedadesEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPropiedadesEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPropiedadesEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listPropiedadesEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistPropiedadesEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listPropiedadesEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editPropiedadesPropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPropiedadesPropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPropiedadesPropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPropiedadesPropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPropiedadesPropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPropiedadesPropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePropiedadesPropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePropiedadesPropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePropiedadesPropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePropiedadesPropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePropiedadesPropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePropiedadesPropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePropiedadesPropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePropiedadesPropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePropiedadesPropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPropiedadesPropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPropiedadesPropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPropiedadesPropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listPropiedadesPropietarios()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistPropiedadesPropietarios() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listPropiedadesPropietarios");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editPropiedadesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPropiedadesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPropiedadesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPropiedadesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPropiedadesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPropiedadesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePropiedadesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePropiedadesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePropiedadesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePropiedadesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePropiedadesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePropiedadesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePropiedadesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePropiedadesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePropiedadesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPropiedadesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPropiedadesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPropiedadesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listPropiedadesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistPropiedadesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listPropiedadesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editPropiedadesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPropiedadesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPropiedadesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPropiedadesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPropiedadesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPropiedadesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePropiedadesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePropiedadesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePropiedadesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePropiedadesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePropiedadesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePropiedadesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePropiedadesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePropiedadesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePropiedadesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPropiedadesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPropiedadesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPropiedadesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listPropiedadesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistPropiedadesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listPropiedadesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>propiedadesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetpropiedadesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/propiedadesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PropiedadesController controller = (PropiedadesController) context.getBean("PropiedadesController");

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