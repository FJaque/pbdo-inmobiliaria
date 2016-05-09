package com.duoc.inmobiliaria.web;

import com.duoc.inmobiliaria.dao.ArriendosDAO;
import com.duoc.inmobiliaria.dao.ClientesDAO;
import com.duoc.inmobiliaria.dao.PropiedadesDAO;

import com.duoc.inmobiliaria.domain.Arriendos;
import com.duoc.inmobiliaria.domain.Clientes;
import com.duoc.inmobiliaria.domain.Propiedades;

import com.duoc.inmobiliaria.service.ArriendosService;

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
 * Spring MVC controller that handles CRUD requests for Arriendos entities
 * 
 */

@Controller("ArriendosController")
public class ArriendosController {

	/**
	 * DAO injected by Spring that manages Arriendos entities
	 * 
	 */
	@Autowired
	private ArriendosDAO arriendosDAO;

	/**
	 * DAO injected by Spring that manages Clientes entities
	 * 
	 */
	@Autowired
	private ClientesDAO clientesDAO;

	/**
	 * DAO injected by Spring that manages Propiedades entities
	 * 
	 */
	@Autowired
	private PropiedadesDAO propiedadesDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Arriendos entities
	 * 
	 */
	@Autowired
	private ArriendosService arriendosService;

	/**
	 * Select the Arriendos entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteArriendos")
	public ModelAndView confirmDeleteArriendos(@RequestParam BigDecimal numarriendoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arriendos", arriendosDAO.findArriendosByPrimaryKey(numarriendoKey));
		mav.setViewName("arriendos/deleteArriendos.jsp");

		return mav;
	}

	/**
	 * Select the child Clientes entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteArriendosClientes")
	public ModelAndView confirmDeleteArriendosClientes(@RequestParam BigDecimal arriendos_numarriendo, @RequestParam BigDecimal related_clientes_numcliente) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("clientes", clientesDAO.findClientesByPrimaryKey(related_clientes_numcliente));
		mav.addObject("arriendos_numarriendo", arriendos_numarriendo);
		mav.setViewName("arriendos/clientes/deleteClientes.jsp");

		return mav;
	}

	/**
	 * Create a new Clientes entity
	 * 
	 */
	@RequestMapping("/newArriendosClientes")
	public ModelAndView newArriendosClientes(@RequestParam BigDecimal arriendos_numarriendo) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("arriendos_numarriendo", arriendos_numarriendo);
		mav.addObject("clientes", new Clientes());
		mav.addObject("newFlag", true);
		mav.setViewName("arriendos/clientes/editClientes.jsp");

		return mav;
	}

	/**
	 * Show all Propiedades entities by Arriendos
	 * 
	 */
	@RequestMapping("/listArriendosPropiedades")
	public ModelAndView listArriendosPropiedades(@RequestParam BigDecimal numarriendoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arriendos", arriendosDAO.findArriendosByPrimaryKey(numarriendoKey));
		mav.setViewName("arriendos/propiedades/listPropiedades.jsp");

		return mav;
	}

	/**
	 * Edit an existing Clientes entity
	 * 
	 */
	@RequestMapping("/editArriendosClientes")
	public ModelAndView editArriendosClientes(@RequestParam BigDecimal arriendos_numarriendo, @RequestParam BigDecimal clientes_numcliente) {
		Clientes clientes = clientesDAO.findClientesByPrimaryKey(clientes_numcliente, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("arriendos_numarriendo", arriendos_numarriendo);
		mav.addObject("clientes", clientes);
		mav.setViewName("arriendos/clientes/editClientes.jsp");

		return mav;
	}

	/**
	 * Delete an existing Clientes entity
	 * 
	 */
	@RequestMapping("/deleteArriendosClientes")
	public ModelAndView deleteArriendosClientes(@RequestParam BigDecimal arriendos_numarriendo, @RequestParam BigDecimal related_clientes_numcliente) {
		ModelAndView mav = new ModelAndView();

		Arriendos arriendos = arriendosService.deleteArriendosClientes(arriendos_numarriendo, related_clientes_numcliente);

		mav.addObject("arriendos_numarriendo", arriendos_numarriendo);
		mav.addObject("arriendos", arriendos);
		mav.setViewName("arriendos/viewArriendos.jsp");

		return mav;
	}

	/**
	 * Select an existing Arriendos entity
	 * 
	 */
	@RequestMapping("/selectArriendos")
	public ModelAndView selectArriendos(@RequestParam BigDecimal numarriendoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arriendos", arriendosDAO.findArriendosByPrimaryKey(numarriendoKey));
		mav.setViewName("arriendos/viewArriendos.jsp");

		return mav;
	}

	/**
	 * Edit an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/editArriendosPropiedades")
	public ModelAndView editArriendosPropiedades(@RequestParam BigDecimal arriendos_numarriendo, @RequestParam BigDecimal propiedades_numpropiedad) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedades_numpropiedad, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("arriendos_numarriendo", arriendos_numarriendo);
		mav.addObject("propiedades", propiedades);
		mav.setViewName("arriendos/propiedades/editPropiedades.jsp");

		return mav;
	}

	/**
	 * Select the child Propiedades entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteArriendosPropiedades")
	public ModelAndView confirmDeleteArriendosPropiedades(@RequestParam BigDecimal arriendos_numarriendo, @RequestParam BigDecimal related_propiedades_numpropiedad) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedades", propiedadesDAO.findPropiedadesByPrimaryKey(related_propiedades_numpropiedad));
		mav.addObject("arriendos_numarriendo", arriendos_numarriendo);
		mav.setViewName("arriendos/propiedades/deletePropiedades.jsp");

		return mav;
	}

	/**
	 * View an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/selectArriendosPropiedades")
	public ModelAndView selectArriendosPropiedades(@RequestParam BigDecimal arriendos_numarriendo, @RequestParam BigDecimal propiedades_numpropiedad) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedades_numpropiedad, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("arriendos_numarriendo", arriendos_numarriendo);
		mav.addObject("propiedades", propiedades);
		mav.setViewName("arriendos/propiedades/viewPropiedades.jsp");

		return mav;
	}

	/**
	 * Save an existing Clientes entity
	 * 
	 */
	@RequestMapping("/saveArriendosClientes")
	public ModelAndView saveArriendosClientes(@RequestParam BigDecimal arriendos_numarriendo, @ModelAttribute Clientes clientes) {
		Arriendos parent_arriendos = arriendosService.saveArriendosClientes(arriendos_numarriendo, clientes);

		ModelAndView mav = new ModelAndView();
		mav.addObject("arriendos_numarriendo", arriendos_numarriendo);
		mav.addObject("arriendos", parent_arriendos);
		mav.setViewName("arriendos/viewArriendos.jsp");

		return mav;
	}

	/**
	 * Delete an existing Arriendos entity
	 * 
	 */
	@RequestMapping("/deleteArriendos")
	public String deleteArriendos(@RequestParam BigDecimal numarriendoKey) {
		Arriendos arriendos = arriendosDAO.findArriendosByPrimaryKey(numarriendoKey);
		arriendosService.deleteArriendos(arriendos);
		return "forward:/indexArriendos";
	}

	/**
	 */
	@RequestMapping("/arriendosController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing Arriendos entity
	 * 
	 */
	@RequestMapping("/saveArriendos")
	public String saveArriendos(@ModelAttribute Arriendos arriendos) {
		arriendosService.saveArriendos(arriendos);
		return "forward:/indexArriendos";
	}

	/**
	 * Show all Clientes entities by Arriendos
	 * 
	 */
	@RequestMapping("/listArriendosClientes")
	public ModelAndView listArriendosClientes(@RequestParam BigDecimal numarriendoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arriendos", arriendosDAO.findArriendosByPrimaryKey(numarriendoKey));
		mav.setViewName("arriendos/clientes/listClientes.jsp");

		return mav;
	}

	/**
	 * View an existing Clientes entity
	 * 
	 */
	@RequestMapping("/selectArriendosClientes")
	public ModelAndView selectArriendosClientes(@RequestParam BigDecimal arriendos_numarriendo, @RequestParam BigDecimal clientes_numcliente) {
		Clientes clientes = clientesDAO.findClientesByPrimaryKey(clientes_numcliente, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("arriendos_numarriendo", arriendos_numarriendo);
		mav.addObject("clientes", clientes);
		mav.setViewName("arriendos/clientes/viewClientes.jsp");

		return mav;
	}

	/**
	 * Edit an existing Arriendos entity
	 * 
	 */
	@RequestMapping("/editArriendos")
	public ModelAndView editArriendos(@RequestParam BigDecimal numarriendoKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arriendos", arriendosDAO.findArriendosByPrimaryKey(numarriendoKey));
		mav.setViewName("arriendos/editArriendos.jsp");

		return mav;
	}

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/deleteArriendosPropiedades")
	public ModelAndView deleteArriendosPropiedades(@RequestParam BigDecimal arriendos_numarriendo, @RequestParam BigDecimal related_propiedades_numpropiedad) {
		ModelAndView mav = new ModelAndView();

		Arriendos arriendos = arriendosService.deleteArriendosPropiedades(arriendos_numarriendo, related_propiedades_numpropiedad);

		mav.addObject("arriendos_numarriendo", arriendos_numarriendo);
		mav.addObject("arriendos", arriendos);
		mav.setViewName("arriendos/viewArriendos.jsp");

		return mav;
	}

	/**
	 * Create a new Propiedades entity
	 * 
	 */
	@RequestMapping("/newArriendosPropiedades")
	public ModelAndView newArriendosPropiedades(@RequestParam BigDecimal arriendos_numarriendo) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("arriendos_numarriendo", arriendos_numarriendo);
		mav.addObject("propiedades", new Propiedades());
		mav.addObject("newFlag", true);
		mav.setViewName("arriendos/propiedades/editPropiedades.jsp");

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
	 * Save an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/saveArriendosPropiedades")
	public ModelAndView saveArriendosPropiedades(@RequestParam BigDecimal arriendos_numarriendo, @ModelAttribute Propiedades propiedades) {
		Arriendos parent_arriendos = arriendosService.saveArriendosPropiedades(arriendos_numarriendo, propiedades);

		ModelAndView mav = new ModelAndView();
		mav.addObject("arriendos_numarriendo", arriendos_numarriendo);
		mav.addObject("arriendos", parent_arriendos);
		mav.setViewName("arriendos/viewArriendos.jsp");

		return mav;
	}

	/**
	 * Create a new Arriendos entity
	 * 
	 */
	@RequestMapping("/newArriendos")
	public ModelAndView newArriendos() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arriendos", new Arriendos());
		mav.addObject("newFlag", true);
		mav.setViewName("arriendos/editArriendos.jsp");

		return mav;
	}

	/**
	 * Show all Arriendos entities
	 * 
	 */
	@RequestMapping("/indexArriendos")
	public ModelAndView listArriendoss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arriendoss", arriendosService.loadArriendoss());

		mav.setViewName("arriendos/listArriendoss.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Arriendos entities
	 * 
	 */
	public String indexArriendos() {
		return "redirect:/indexArriendos";
	}
}