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
 * Unit test for the <code>VisitasController</code> controller.
 *
 * @see com.duoc.inmobiliaria.web.VisitasController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/AplicacionInmobiliaria-security-context.xml",
		"file:./resources/AplicacionInmobiliaria-service-context.xml",
		"file:./resources/AplicacionInmobiliaria-dao-context.xml",
		"file:./resources/AplicacionInmobiliaria-web-context.xml" })
public class VisitasControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editVisitasPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVisitasPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVisitasPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVisitasPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVisitasPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVisitasPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVisitasPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVisitasPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVisitasPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVisitasPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVisitasPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVisitasPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVisitasPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVisitasPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVisitasPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVisitasPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVisitasPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVisitasPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVisitasPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVisitasPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVisitasPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVisitasClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVisitasClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVisitasClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVisitasClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVisitasClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVisitasClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVisitasClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVisitasClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVisitasClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVisitasClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVisitasClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVisitasClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVisitasClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVisitasClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVisitasClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVisitasClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVisitasClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVisitasClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listVisitasClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistVisitasClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listVisitasClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexVisitas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexVisitas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexVisitas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectVisitas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectVisitas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectVisitas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editVisitas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditVisitas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editVisitas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveVisitas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveVisitas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveVisitas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newVisitas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewVisitas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newVisitas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteVisitas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteVisitas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteVisitas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteVisitas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteVisitas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteVisitas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>visitasControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetvisitasControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/visitasController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		VisitasController controller = (VisitasController) context.getBean("VisitasController");

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