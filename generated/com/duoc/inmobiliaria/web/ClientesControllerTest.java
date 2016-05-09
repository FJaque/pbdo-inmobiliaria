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
 * Unit test for the <code>ClientesController</code> controller.
 *
 * @see com.duoc.inmobiliaria.web.ClientesController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/AplicacionInmobiliaria-security-context.xml",
		"file:./resources/AplicacionInmobiliaria-service-context.xml",
		"file:./resources/AplicacionInmobiliaria-dao-context.xml",
		"file:./resources/AplicacionInmobiliaria-web-context.xml" })
public class ClientesControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editClientesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditClientesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editClientesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newClientesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewClientesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newClientesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveClientesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveClientesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveClientesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteClientesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteClientesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteClientesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteClientesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteClientesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteClientesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectClientesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectClientesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectClientesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listClientesVisitases()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistClientesVisitases() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listClientesVisitases");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editClientesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditClientesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editClientesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newClientesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewClientesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newClientesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveClientesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveClientesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveClientesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteClientesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteClientesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteClientesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteClientesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteClientesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteClientesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectClientesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectClientesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectClientesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listClientesArriendoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistClientesArriendoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listClientesArriendoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteClientes()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteClientes() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteClientes");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>clientesControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetclientesControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/clientesController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ClientesController controller = (ClientesController) context.getBean("ClientesController");

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