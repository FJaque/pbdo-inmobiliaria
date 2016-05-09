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
 * Unit test for the <code>EmpleadosController</code> controller.
 *
 * @see com.duoc.inmobiliaria.web.EmpleadosController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/AplicacionInmobiliaria-security-context.xml",
		"file:./resources/AplicacionInmobiliaria-service-context.xml",
		"file:./resources/AplicacionInmobiliaria-dao-context.xml",
		"file:./resources/AplicacionInmobiliaria-web-context.xml" })
public class EmpleadosControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editEmpleadosOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditEmpleadosOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editEmpleadosOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newEmpleadosOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewEmpleadosOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newEmpleadosOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveEmpleadosOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveEmpleadosOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveEmpleadosOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteEmpleadosOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteEmpleadosOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteEmpleadosOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteEmpleadosOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteEmpleadosOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteEmpleadosOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectEmpleadosOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectEmpleadosOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectEmpleadosOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listEmpleadosOficinas()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistEmpleadosOficinas() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listEmpleadosOficinas");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editEmpleadosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditEmpleadosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editEmpleadosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newEmpleadosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewEmpleadosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newEmpleadosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveEmpleadosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveEmpleadosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveEmpleadosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteEmpleadosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteEmpleadosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteEmpleadosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteEmpleadosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteEmpleadosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteEmpleadosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectEmpleadosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectEmpleadosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectEmpleadosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listEmpleadosPropiedadeses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistEmpleadosPropiedadeses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listEmpleadosPropiedadeses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteEmpleados()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteEmpleados() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteEmpleados");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>empleadosControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetempleadosControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/empleadosController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		EmpleadosController controller = (EmpleadosController) context.getBean("EmpleadosController");

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