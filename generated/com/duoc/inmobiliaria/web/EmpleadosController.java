package com.duoc.inmobiliaria.web;

import com.duoc.inmobiliaria.dao.EmpleadosDAO;
import com.duoc.inmobiliaria.dao.OficinasDAO;
import com.duoc.inmobiliaria.dao.PropiedadesDAO;

import com.duoc.inmobiliaria.domain.Empleados;
import com.duoc.inmobiliaria.domain.Oficinas;
import com.duoc.inmobiliaria.domain.Propiedades;

import com.duoc.inmobiliaria.service.EmpleadosService;

import java.math.BigDecimal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Empleados entities
 * 
 */

@Controller("EmpleadosController")
public class EmpleadosController {

	/**
	 * DAO injected by Spring that manages Empleados entities
	 * 
	 */
	@Autowired
	private EmpleadosDAO empleadosDAO;

	/**
	 * DAO injected by Spring that manages Oficinas entities
	 * 
	 */
	@Autowired
	private OficinasDAO oficinasDAO;

	/**
	 * DAO injected by Spring that manages Propiedades entities
	 * 
	 */
	@Autowired
	private PropiedadesDAO propiedadesDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Empleados entities
	 * 
	 */
	@Autowired
	private EmpleadosService empleadosService;

	/**
	 */
	@RequestMapping("/empleadosController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/deleteEmpleadosPropiedadeses")
	public ModelAndView deleteEmpleadosPropiedadeses(@RequestParam BigDecimal empleados_numempleado, @RequestParam BigDecimal related_propiedadeses_numpropiedad) {
		ModelAndView mav = new ModelAndView();

		Empleados empleados = empleadosService.deleteEmpleadosPropiedadeses(empleados_numempleado, related_propiedadeses_numpropiedad);

		mav.addObject("empleados_numempleado", empleados_numempleado);
		mav.addObject("empleados", empleados);
		mav.setViewName("empleados/viewEmpleados.jsp");

		return mav;
	}

	/**
	 * Select the child Propiedades entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteEmpleadosPropiedadeses")
	public ModelAndView confirmDeleteEmpleadosPropiedadeses(@RequestParam BigDecimal empleados_numempleado, @RequestParam BigDecimal related_propiedadeses_numpropiedad) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedades", propiedadesDAO.findPropiedadesByPrimaryKey(related_propiedadeses_numpropiedad));
		mav.addObject("empleados_numempleado", empleados_numempleado);
		mav.setViewName("empleados/propiedadeses/deletePropiedadeses.jsp");

		return mav;
	}

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/saveEmpleadosPropiedadeses")
	public ModelAndView saveEmpleadosPropiedadeses(@RequestParam BigDecimal empleados_numempleado, @ModelAttribute Propiedades propiedadeses) {
		Empleados parent_empleados = empleadosService.saveEmpleadosPropiedadeses(empleados_numempleado, propiedadeses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("empleados_numempleado", empleados_numempleado);
		mav.addObject("empleados", parent_empleados);
		mav.setViewName("empleados/viewEmpleados.jsp");

		return mav;
	}

	/**
	 * Edit an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/editEmpleadosPropiedadeses")
	public ModelAndView editEmpleadosPropiedadeses(@RequestParam BigDecimal empleados_numempleado, @RequestParam BigDecimal propiedadeses_numpropiedad) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedadeses_numpropiedad, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("empleados_numempleado", empleados_numempleado);
		mav.addObject("propiedades", propiedades);
		mav.setViewName("empleados/propiedadeses/editPropiedadeses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Empleados entity
	 * 
	 */
	@RequestMapping("/deleteEmpleados")
	public String deleteEmpleados(@RequestParam BigDecimal numempleadoKey) {
		Empleados empleados = empleadosDAO.findEmpleadosByPrimaryKey(numempleadoKey);
		empleadosService.deleteEmpleados(empleados);
		return "forward:/indexEmpleados";
	}

	/**
	 * Show all Oficinas entities by Empleados
	 * 
	 */
	@RequestMapping("/listEmpleadosOficinas")
	public ModelAndView listEmpleadosOficinas(@RequestParam BigDecimal numempleadoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("empleados", empleadosDAO.findEmpleadosByPrimaryKey(numempleadoKey));
		mav.setViewName("empleados/oficinas/listOficinas.jsp");

		return mav;
	}

	/**
	 * Select the Empleados entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteEmpleados")
	public ModelAndView confirmDeleteEmpleados(@RequestParam BigDecimal numempleadoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("empleados", empleadosDAO.findEmpleadosByPrimaryKey(numempleadoKey));
		mav.setViewName("empleados/deleteEmpleados.jsp");

		return mav;
	}

	/**
	 * Show all Empleados entities
	 * 
	 */
	@RequestMapping("/indexEmpleados")
	public ModelAndView listEmpleadoss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("empleadoss", empleadosService.loadEmpleadoss());

		mav.setViewName("empleados/listEmpleadoss.jsp");

		return mav;
	}

	/**
	 * Save an existing Empleados entity
	 * 
	 */
	@RequestMapping("/saveEmpleados")
	public String saveEmpleados(@ModelAttribute Empleados empleados) {
		empleadosService.saveEmpleados(empleados);
		return "forward:/indexEmpleados";
	}

	/**
	 * Entry point to show all Empleados entities
	 * 
	 */
	public String indexEmpleados() {
		return "redirect:/indexEmpleados";
	}

	/**
	 * Create a new Propiedades entity
	 * 
	 */
	@RequestMapping("/newEmpleadosPropiedadeses")
	public ModelAndView newEmpleadosPropiedadeses(@RequestParam BigDecimal empleados_numempleado) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("empleados_numempleado", empleados_numempleado);
		mav.addObject("propiedades", new Propiedades());
		mav.addObject("newFlag", true);
		mav.setViewName("empleados/propiedadeses/editPropiedadeses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Oficinas entity
	 * 
	 */
	@RequestMapping("/deleteEmpleadosOficinas")
	public ModelAndView deleteEmpleadosOficinas(@RequestParam BigDecimal empleados_numempleado, @RequestParam BigDecimal related_oficinas_numoficina) {
		ModelAndView mav = new ModelAndView();

		Empleados empleados = empleadosService.deleteEmpleadosOficinas(empleados_numempleado, related_oficinas_numoficina);

		mav.addObject("empleados_numempleado", empleados_numempleado);
		mav.addObject("empleados", empleados);
		mav.setViewName("empleados/viewEmpleados.jsp");

		return mav;
	}

	/**
	 * Create a new Empleados entity
	 * 
	 */
	@RequestMapping("/newEmpleados")
	public ModelAndView newEmpleados() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("empleados", new Empleados());
		mav.addObject("newFlag", true);
		mav.setViewName("empleados/editEmpleados.jsp");

		return mav;
	}

	/**
	 * Select the child Oficinas entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteEmpleadosOficinas")
	public ModelAndView confirmDeleteEmpleadosOficinas(@RequestParam BigDecimal empleados_numempleado, @RequestParam BigDecimal related_oficinas_numoficina) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("oficinas", oficinasDAO.findOficinasByPrimaryKey(related_oficinas_numoficina));
		mav.addObject("empleados_numempleado", empleados_numempleado);
		mav.setViewName("empleados/oficinas/deleteOficinas.jsp");

		return mav;
	}

	/**
	 * View an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/selectEmpleadosPropiedadeses")
	public ModelAndView selectEmpleadosPropiedadeses(@RequestParam BigDecimal empleados_numempleado, @RequestParam BigDecimal propiedadeses_numpropiedad) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedadeses_numpropiedad, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("empleados_numempleado", empleados_numempleado);
		mav.addObject("propiedades", propiedades);
		mav.setViewName("empleados/propiedadeses/viewPropiedadeses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Empleados entity
	 * 
	 */
	@RequestMapping("/editEmpleados")
	public ModelAndView editEmpleados(@RequestParam BigDecimal numempleadoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("empleados", empleadosDAO.findEmpleadosByPrimaryKey(numempleadoKey));
		mav.setViewName("empleados/editEmpleados.jsp");

		return mav;
	}

	/**
	 * Create a new Oficinas entity
	 * 
	 */
	@RequestMapping("/newEmpleadosOficinas")
	public ModelAndView newEmpleadosOficinas(@RequestParam BigDecimal empleados_numempleado) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("empleados_numempleado", empleados_numempleado);
		mav.addObject("oficinas", new Oficinas());
		mav.addObject("newFlag", true);
		mav.setViewName("empleados/oficinas/editOficinas.jsp");

		return mav;
	}

	/**
	 * Edit an existing Oficinas entity
	 * 
	 */
	@RequestMapping("/editEmpleadosOficinas")
	public ModelAndView editEmpleadosOficinas(@RequestParam BigDecimal empleados_numempleado, @RequestParam BigDecimal oficinas_numoficina) {
		Oficinas oficinas = oficinasDAO.findOficinasByPrimaryKey(oficinas_numoficina, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("empleados_numempleado", empleados_numempleado);
		mav.addObject("oficinas", oficinas);
		mav.setViewName("empleados/oficinas/editOficinas.jsp");

		return mav;
	}

	/**
	 * Select an existing Empleados entity
	 * 
	 */
	@RequestMapping("/selectEmpleados")
	public ModelAndView selectEmpleados(@RequestParam BigDecimal numempleadoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("empleados", empleadosDAO.findEmpleadosByPrimaryKey(numempleadoKey));
		mav.setViewName("empleados/viewEmpleados.jsp");

		return mav;
	}

	/**
	 * View an existing Oficinas entity
	 * 
	 */
	@RequestMapping("/selectEmpleadosOficinas")
	public ModelAndView selectEmpleadosOficinas(@RequestParam BigDecimal empleados_numempleado, @RequestParam BigDecimal oficinas_numoficina) {
		Oficinas oficinas = oficinasDAO.findOficinasByPrimaryKey(oficinas_numoficina, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("empleados_numempleado", empleados_numempleado);
		mav.addObject("oficinas", oficinas);
		mav.setViewName("empleados/oficinas/viewOficinas.jsp");

		return mav;
	}

	/**
	 * Save an existing Oficinas entity
	 * 
	 */
	@RequestMapping("/saveEmpleadosOficinas")
	public ModelAndView saveEmpleadosOficinas(@RequestParam BigDecimal empleados_numempleado, @ModelAttribute Oficinas oficinas) {
		Empleados parent_empleados = empleadosService.saveEmpleadosOficinas(empleados_numempleado, oficinas);

		ModelAndView mav = new ModelAndView();
		mav.addObject("empleados_numempleado", empleados_numempleado);
		mav.addObject("empleados", parent_empleados);
		mav.setViewName("empleados/viewEmpleados.jsp");

		return mav;
	}

	/**
	 * Show all Propiedades entities by Empleados
	 * 
	 */
	@RequestMapping("/listEmpleadosPropiedadeses")
	public ModelAndView listEmpleadosPropiedadeses(@RequestParam BigDecimal numempleadoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("empleados", empleadosDAO.findEmpleadosByPrimaryKey(numempleadoKey));
		mav.setViewName("empleados/propiedadeses/listPropiedadeses.jsp");

		return mav;
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}
}