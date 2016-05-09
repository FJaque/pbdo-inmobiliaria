package com.duoc.inmobiliaria.web;

import com.duoc.inmobiliaria.dao.PropiedadesDAO;
import com.duoc.inmobiliaria.dao.PropietariosDAO;

import com.duoc.inmobiliaria.domain.Propiedades;
import com.duoc.inmobiliaria.domain.Propietarios;

import com.duoc.inmobiliaria.service.PropietariosService;

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
 * Spring MVC controller that handles CRUD requests for Propietarios entities
 * 
 */

@Controller("PropietariosController")
public class PropietariosController {

	/**
	 * DAO injected by Spring that manages Propiedades entities
	 * 
	 */
	@Autowired
	private PropiedadesDAO propiedadesDAO;

	/**
	 * DAO injected by Spring that manages Propietarios entities
	 * 
	 */
	@Autowired
	private PropietariosDAO propietariosDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Propietarios entities
	 * 
	 */
	@Autowired
	private PropietariosService propietariosService;

	/**
	 * Select the child Propiedades entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePropietariosPropiedadeses")
	public ModelAndView confirmDeletePropietariosPropiedadeses(@RequestParam BigDecimal propietarios_numpropietario, @RequestParam BigDecimal related_propiedadeses_numpropiedad) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedades", propiedadesDAO.findPropiedadesByPrimaryKey(related_propiedadeses_numpropiedad));
		mav.addObject("propietarios_numpropietario", propietarios_numpropietario);
		mav.setViewName("propietarios/propiedadeses/deletePropiedadeses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Propietarios entity
	 * 
	 */
	@RequestMapping("/editPropietarios")
	public ModelAndView editPropietarios(@RequestParam BigDecimal numpropietarioKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propietarios", propietariosDAO.findPropietariosByPrimaryKey(numpropietarioKey));
		mav.setViewName("propietarios/editPropietarios.jsp");

		return mav;
	}

	/**
	 * Select the Propietarios entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePropietarios")
	public ModelAndView confirmDeletePropietarios(@RequestParam BigDecimal numpropietarioKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propietarios", propietariosDAO.findPropietariosByPrimaryKey(numpropietarioKey));
		mav.setViewName("propietarios/deletePropietarios.jsp");

		return mav;
	}

	/**
	 * Create a new Propietarios entity
	 * 
	 */
	@RequestMapping("/newPropietarios")
	public ModelAndView newPropietarios() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propietarios", new Propietarios());
		mav.addObject("newFlag", true);
		mav.setViewName("propietarios/editPropietarios.jsp");

		return mav;
	}

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/deletePropietariosPropiedadeses")
	public ModelAndView deletePropietariosPropiedadeses(@RequestParam BigDecimal propietarios_numpropietario, @RequestParam BigDecimal related_propiedadeses_numpropiedad) {
		ModelAndView mav = new ModelAndView();

		Propietarios propietarios = propietariosService.deletePropietariosPropiedadeses(propietarios_numpropietario, related_propiedadeses_numpropiedad);

		mav.addObject("propietarios_numpropietario", propietarios_numpropietario);
		mav.addObject("propietarios", propietarios);
		mav.setViewName("propietarios/viewPropietarios.jsp");

		return mav;
	}

	/**
	 * Save an existing Propietarios entity
	 * 
	 */
	@RequestMapping("/savePropietarios")
	public String savePropietarios(@ModelAttribute Propietarios propietarios) {
		propietariosService.savePropietarios(propietarios);
		return "forward:/indexPropietarios";
	}

	/**
	 * View an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/selectPropietariosPropiedadeses")
	public ModelAndView selectPropietariosPropiedadeses(@RequestParam BigDecimal propietarios_numpropietario, @RequestParam BigDecimal propiedadeses_numpropiedad) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedadeses_numpropiedad, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propietarios_numpropietario", propietarios_numpropietario);
		mav.addObject("propiedades", propiedades);
		mav.setViewName("propietarios/propiedadeses/viewPropiedadeses.jsp");

		return mav;
	}

	/**
	 * Create a new Propiedades entity
	 * 
	 */
	@RequestMapping("/newPropietariosPropiedadeses")
	public ModelAndView newPropietariosPropiedadeses(@RequestParam BigDecimal propietarios_numpropietario) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("propietarios_numpropietario", propietarios_numpropietario);
		mav.addObject("propiedades", new Propiedades());
		mav.addObject("newFlag", true);
		mav.setViewName("propietarios/propiedadeses/editPropiedadeses.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Propietarios entities
	 * 
	 */
	public String indexPropietarios() {
		return "redirect:/indexPropietarios";
	}

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/savePropietariosPropiedadeses")
	public ModelAndView savePropietariosPropiedadeses(@RequestParam BigDecimal propietarios_numpropietario, @ModelAttribute Propiedades propiedadeses) {
		Propietarios parent_propietarios = propietariosService.savePropietariosPropiedadeses(propietarios_numpropietario, propiedadeses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propietarios_numpropietario", propietarios_numpropietario);
		mav.addObject("propietarios", parent_propietarios);
		mav.setViewName("propietarios/viewPropietarios.jsp");

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
	 */
	@RequestMapping("/propietariosController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/editPropietariosPropiedadeses")
	public ModelAndView editPropietariosPropiedadeses(@RequestParam BigDecimal propietarios_numpropietario, @RequestParam BigDecimal propiedadeses_numpropiedad) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedadeses_numpropiedad, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propietarios_numpropietario", propietarios_numpropietario);
		mav.addObject("propiedades", propiedades);
		mav.setViewName("propietarios/propiedadeses/editPropiedadeses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Propietarios entity
	 * 
	 */
	@RequestMapping("/deletePropietarios")
	public String deletePropietarios(@RequestParam BigDecimal numpropietarioKey) {
		Propietarios propietarios = propietariosDAO.findPropietariosByPrimaryKey(numpropietarioKey);
		propietariosService.deletePropietarios(propietarios);
		return "forward:/indexPropietarios";
	}

	/**
	 * Show all Propietarios entities
	 * 
	 */
	@RequestMapping("/indexPropietarios")
	public ModelAndView listPropietarioss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propietarioss", propietariosService.loadPropietarioss());

		mav.setViewName("propietarios/listPropietarioss.jsp");

		return mav;
	}

	/**
	 * Select an existing Propietarios entity
	 * 
	 */
	@RequestMapping("/selectPropietarios")
	public ModelAndView selectPropietarios(@RequestParam BigDecimal numpropietarioKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propietarios", propietariosDAO.findPropietariosByPrimaryKey(numpropietarioKey));
		mav.setViewName("propietarios/viewPropietarios.jsp");

		return mav;
	}

	/**
	 * Show all Propiedades entities by Propietarios
	 * 
	 */
	@RequestMapping("/listPropietariosPropiedadeses")
	public ModelAndView listPropietariosPropiedadeses(@RequestParam BigDecimal numpropietarioKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propietarios", propietariosDAO.findPropietariosByPrimaryKey(numpropietarioKey));
		mav.setViewName("propietarios/propiedadeses/listPropiedadeses.jsp");

		return mav;
	}
}