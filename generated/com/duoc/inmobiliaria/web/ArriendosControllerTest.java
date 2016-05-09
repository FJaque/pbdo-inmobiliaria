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
 * Unit test for the <code>ArriendosController</code> controller.
 *
 * @see com.duoc.inmobiliaria.web.ArriendosController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/AplicacionInmobiliaria-security-context.xml",
		"file:./resources/AplicacionInmobiliaria-service-context.xml",
		"file:./resources/AplicacionInmobiliaria-dao-context.xml",
		"file:./resources/AplicacionInmobiliaria-web-context.xml" })
public class ArriendosControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editArriendosPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditArriendosPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editArriendosPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newArriendosPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewArriendosPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newArriendosPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveArriendosPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveArriendosPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveArriendosPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteArriendosPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteArriendosPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteArriendosPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteArriendosPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteArriendosPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteArriendosPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectArriendosPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectArriendosPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectArriendosPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listArriendosPropiedades()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistArriendosPropiedades() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listArriendosPropiedades");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editArriendosClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditArriendosClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editArriendosClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newArriendosClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewArriendosClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newArriendosClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveArriendosClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveArriendosClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveArriendosClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteArriendosClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteArriendosClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteArriendosClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteArriendosClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteArriendosClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteArriendosClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectArriendosClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectArriendosClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectArriendosClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listArriendosClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistArriendosClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listArriendosClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexArriendos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexArriendos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexArriendos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectArriendos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectArriendos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectArriendos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editArriendos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditArriendos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editArriendos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveArriendos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveArriendos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveArriendos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newArriendos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewArriendos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newArriendos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteArriendos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteArriendos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteArriendos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteArriendos()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteArriendos() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteArriendos");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>arriendosControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetarriendosControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/arriendosController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ArriendosController controller = (ArriendosController) context.getBean("ArriendosController");

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