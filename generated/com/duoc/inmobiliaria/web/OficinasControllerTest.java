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
 * Unit test for the <code>OficinasController</code> controller.
 *
 * @see com.duoc.inmobiliaria.web.OficinasController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/AplicacionInmobiliaria-security-context.xml",
		"file:./resources/AplicacionInmobiliaria-service-context.xml",
		"file:./resources/AplicacionInmobiliaria-dao-context.xml",
		"file:./resources/AplicacionInmobiliaria-web-context.xml" })
public class OficinasControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editOficinasEmpleadoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOficinasEmpleadoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOficinasEmpleadoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOficinasEmpleadoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOficinasEmpleadoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOficinasEmpleadoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOficinasEmpleadoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOficinasEmpleadoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOficinasEmpleadoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOficinasEmpleadoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOficinasEmpleadoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOficinasEmpleadoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOficinasEmpleadoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOficinasEmpleadoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOficinasEmpleadoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOficinasEmpleadoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOficinasEmpleadoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOficinasEmpleadoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listOficinasEmpleadoses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistOficinasEmpleadoses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listOficinasEmpleadoses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>oficinasControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetoficinasControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/oficinasController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		OficinasController controller = (OficinasController) context.getBean("OficinasController");

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