package com.duoc.inmobiliaria.web;

import com.duoc.inmobiliaria.dao.EmpleadosDAO;
import com.duoc.inmobiliaria.dao.OficinasDAO;

import com.duoc.inmobiliaria.domain.Empleados;
import com.duoc.inmobiliaria.domain.Oficinas;

import com.duoc.inmobiliaria.service.OficinasService;

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
 * Spring MVC controller that handles CRUD requests for Oficinas entities
 * 
 */

@Controller("OficinasController")
public class OficinasController {

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
	 * Service injected by Spring that provides CRUD operations for Oficinas entities
	 * 
	 */
	@Autowired
	private OficinasService oficinasService;

	/**
	 * Save an existing Oficinas entity
	 * 
	 */
	@RequestMapping("/saveOficinas")
	public String saveOficinas(@ModelAttribute Oficinas oficinas) {
		oficinasService.saveOficinas(oficinas);
		return "forward:/indexOficinas";
	}

	/**
	 * Select the child Empleados entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOficinasEmpleadoses")
	public ModelAndView confirmDeleteOficinasEmpleadoses(@RequestParam BigDecimal oficinas_numoficina, @RequestParam BigDecimal related_empleadoses_numempleado) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("empleados", empleadosDAO.findEmpleadosByPrimaryKey(related_empleadoses_numempleado));
		mav.addObject("oficinas_numoficina", oficinas_numoficina);
		mav.setViewName("oficinas/empleadoses/deleteEmpleadoses.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/oficinasController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all Oficinas entities
	 * 
	 */
	@RequestMapping("/indexOficinas")
	public ModelAndView listOficinass() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("oficinass", oficinasService.loadOficinass());

		mav.setViewName("oficinas/listOficinass.jsp");

		return mav;
	}

	/**
	 * Edit an existing Empleados entity
	 * 
	 */
	@RequestMapping("/editOficinasEmpleadoses")
	public ModelAndView editOficinasEmpleadoses(@RequestParam BigDecimal oficinas_numoficina, @RequestParam BigDecimal empleadoses_numempleado) {
		Empleados empleados = empleadosDAO.findEmpleadosByPrimaryKey(empleadoses_numempleado, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("oficinas_numoficina", oficinas_numoficina);
		mav.addObject("empleados", empleados);
		mav.setViewName("oficinas/empleadoses/editEmpleadoses.jsp");

		return mav;
	}

	/**
	 * Show all Empleados entities by Oficinas
	 * 
	 */
	@RequestMapping("/listOficinasEmpleadoses")
	public ModelAndView listOficinasEmpleadoses(@RequestParam BigDecimal numoficinaKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("oficinas", oficinasDAO.findOficinasByPrimaryKey(numoficinaKey));
		mav.setViewName("oficinas/empleadoses/listEmpleadoses.jsp");

		return mav;
	}

	/**
	 * Create a new Empleados entity
	 * 
	 */
	@RequestMapping("/newOficinasEmpleadoses")
	public ModelAndView newOficinasEmpleadoses(@RequestParam BigDecimal oficinas_numoficina) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("oficinas_numoficina", oficinas_numoficina);
		mav.addObject("empleados", new Empleados());
		mav.addObject("newFlag", true);
		mav.setViewName("oficinas/empleadoses/editEmpleadoses.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Oficinas entities
	 * 
	 */
	public String indexOficinas() {
		return "redirect:/indexOficinas";
	}

	/**
	 * Delete an existing Empleados entity
	 * 
	 */
	@RequestMapping("/deleteOficinasEmpleadoses")
	public ModelAndView deleteOficinasEmpleadoses(@RequestParam BigDecimal oficinas_numoficina, @RequestParam BigDecimal related_empleadoses_numempleado) {
		ModelAndView mav = new ModelAndView();

		Oficinas oficinas = oficinasService.deleteOficinasEmpleadoses(oficinas_numoficina, related_empleadoses_numempleado);

		mav.addObject("oficinas_numoficina", oficinas_numoficina);
		mav.addObject("oficinas", oficinas);
		mav.setViewName("oficinas/viewOficinas.jsp");

		return mav;
	}

	/**
	 * Select an existing Oficinas entity
	 * 
	 */
	@RequestMapping("/selectOficinas")
	public ModelAndView selectOficinas(@RequestParam BigDecimal numoficinaKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("oficinas", oficinasDAO.findOficinasByPrimaryKey(numoficinaKey));
		mav.setViewName("oficinas/viewOficinas.jsp");

		return mav;
	}

	/**
	 * Delete an existing Oficinas entity
	 * 
	 */
	@RequestMapping("/deleteOficinas")
	public String deleteOficinas(@RequestParam BigDecimal numoficinaKey) {
		Oficinas oficinas = oficinasDAO.findOficinasByPrimaryKey(numoficinaKey);
		oficinasService.deleteOficinas(oficinas);
		return "forward:/indexOficinas";
	}

	/**
	 * Create a new Oficinas entity
	 * 
	 */
	@RequestMapping("/newOficinas")
	public ModelAndView newOficinas() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("oficinas", new Oficinas());
		mav.addObject("newFlag", true);
		mav.setViewName("oficinas/editOficinas.jsp");

		return mav;
	}

	/**
	 * View an existing Empleados entity
	 * 
	 */
	@RequestMapping("/selectOficinasEmpleadoses")
	public ModelAndView selectOficinasEmpleadoses(@RequestParam BigDecimal oficinas_numoficina, @RequestParam BigDecimal empleadoses_numempleado) {
		Empleados empleados = empleadosDAO.findEmpleadosByPrimaryKey(empleadoses_numempleado, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("oficinas_numoficina", oficinas_numoficina);
		mav.addObject("empleados", empleados);
		mav.setViewName("oficinas/empleadoses/viewEmpleadoses.jsp");

		return mav;
	}

	/**
	 * Select the Oficinas entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteOficinas")
	public ModelAndView confirmDeleteOficinas(@RequestParam BigDecimal numoficinaKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("oficinas", oficinasDAO.findOficinasByPrimaryKey(numoficinaKey));
		mav.setViewName("oficinas/deleteOficinas.jsp");

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

	/**
	 * Edit an existing Oficinas entity
	 * 
	 */
	@RequestMapping("/editOficinas")
	public ModelAndView editOficinas(@RequestParam BigDecimal numoficinaKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("oficinas", oficinasDAO.findOficinasByPrimaryKey(numoficinaKey));
		mav.setViewName("oficinas/editOficinas.jsp");

		return mav;
	}

	/**
	 * Save an existing Empleados entity
	 * 
	 */
	@RequestMapping("/saveOficinasEmpleadoses")
	public ModelAndView saveOficinasEmpleadoses(@RequestParam BigDecimal oficinas_numoficina, @ModelAttribute Empleados empleadoses) {
		Oficinas parent_oficinas = oficinasService.saveOficinasEmpleadoses(oficinas_numoficina, empleadoses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("oficinas_numoficina", oficinas_numoficina);
		mav.addObject("oficinas", parent_oficinas);
		mav.setViewName("oficinas/viewOficinas.jsp");

		return mav;
	}
}