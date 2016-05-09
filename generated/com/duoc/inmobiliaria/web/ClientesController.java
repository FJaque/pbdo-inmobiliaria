package com.duoc.inmobiliaria.web;

import com.duoc.inmobiliaria.dao.ArriendosDAO;
import com.duoc.inmobiliaria.dao.ClientesDAO;
import com.duoc.inmobiliaria.dao.VisitasDAO;

import com.duoc.inmobiliaria.domain.Arriendos;
import com.duoc.inmobiliaria.domain.Clientes;
import com.duoc.inmobiliaria.domain.Visitas;

import com.duoc.inmobiliaria.service.ClientesService;

import java.math.BigDecimal;

import java.util.Calendar;

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
 * Spring MVC controller that handles CRUD requests for Clientes entities
 * 
 */

@Controller("ClientesController")
public class ClientesController {

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
	 * DAO injected by Spring that manages Visitas entities
	 * 
	 */
	@Autowired
	private VisitasDAO visitasDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Clientes entities
	 * 
	 */
	@Autowired
	private ClientesService clientesService;

	/**
	 * Edit an existing Clientes entity
	 * 
	 */
	@RequestMapping("/editClientes")
	public ModelAndView editClientes(@RequestParam BigDecimal numclienteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("clientes", clientesDAO.findClientesByPrimaryKey(numclienteKey));
		mav.setViewName("clientes/editClientes.jsp");

		return mav;
	}

	/**
	 * Show all Visitas entities by Clientes
	 * 
	 */
	@RequestMapping("/listClientesVisitases")
	public ModelAndView listClientesVisitases(@RequestParam BigDecimal numclienteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("clientes", clientesDAO.findClientesByPrimaryKey(numclienteKey));
		mav.setViewName("clientes/visitases/listVisitases.jsp");

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
	 * Save an existing Visitas entity
	 * 
	 */
	@RequestMapping("/saveClientesVisitases")
	public ModelAndView saveClientesVisitases(@RequestParam BigDecimal clientes_numcliente, @ModelAttribute Visitas visitases) {
		Clientes parent_clientes = clientesService.saveClientesVisitases(clientes_numcliente, visitases);

		ModelAndView mav = new ModelAndView();
		mav.addObject("clientes_numcliente", clientes_numcliente);
		mav.addObject("clientes", parent_clientes);
		mav.setViewName("clientes/viewClientes.jsp");

		return mav;
	}

	/**
	 * Select an existing Clientes entity
	 * 
	 */
	@RequestMapping("/selectClientes")
	public ModelAndView selectClientes(@RequestParam BigDecimal numclienteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("clientes", clientesDAO.findClientesByPrimaryKey(numclienteKey));
		mav.setViewName("clientes/viewClientes.jsp");

		return mav;
	}

	/**
	 * Edit an existing Arriendos entity
	 * 
	 */
	@RequestMapping("/editClientesArriendoses")
	public ModelAndView editClientesArriendoses(@RequestParam BigDecimal clientes_numcliente, @RequestParam BigDecimal arriendoses_numarriendo) {
		Arriendos arriendos = arriendosDAO.findArriendosByPrimaryKey(arriendoses_numarriendo, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("clientes_numcliente", clientes_numcliente);
		mav.addObject("arriendos", arriendos);
		mav.setViewName("clientes/arriendoses/editArriendoses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Visitas entity
	 * 
	 */
	@RequestMapping("/deleteClientesVisitases")
	public ModelAndView deleteClientesVisitases(@RequestParam BigDecimal clientes_numcliente, @RequestParam BigDecimal related_visitases_numcliente, @RequestParam Calendar related_visitases_fecha, @RequestParam BigDecimal related_visitases_numpropiedad) {
		ModelAndView mav = new ModelAndView();

		Clientes clientes = clientesService.deleteClientesVisitases(clientes_numcliente, related_visitases_numcliente, related_visitases_fecha, related_visitases_numpropiedad);

		mav.addObject("clientes_numcliente", clientes_numcliente);
		mav.addObject("clientes", clientes);
		mav.setViewName("clientes/viewClientes.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Clientes entities
	 * 
	 */
	public String indexClientes() {
		return "redirect:/indexClientes";
	}

	/**
	 * Select the child Arriendos entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteClientesArriendoses")
	public ModelAndView confirmDeleteClientesArriendoses(@RequestParam BigDecimal clientes_numcliente, @RequestParam BigDecimal related_arriendoses_numarriendo) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arriendos", arriendosDAO.findArriendosByPrimaryKey(related_arriendoses_numarriendo));
		mav.addObject("clientes_numcliente", clientes_numcliente);
		mav.setViewName("clientes/arriendoses/deleteArriendoses.jsp");

		return mav;
	}

	/**
	 * Show all Arriendos entities by Clientes
	 * 
	 */
	@RequestMapping("/listClientesArriendoses")
	public ModelAndView listClientesArriendoses(@RequestParam BigDecimal numclienteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("clientes", clientesDAO.findClientesByPrimaryKey(numclienteKey));
		mav.setViewName("clientes/arriendoses/listArriendoses.jsp");

		return mav;
	}

	/**
	 * Select the Clientes entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteClientes")
	public ModelAndView confirmDeleteClientes(@RequestParam BigDecimal numclienteKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("clientes", clientesDAO.findClientesByPrimaryKey(numclienteKey));
		mav.setViewName("clientes/deleteClientes.jsp");

		return mav;
	}

	/**
	 * Save an existing Clientes entity
	 * 
	 */
	@RequestMapping("/saveClientes")
	public String saveClientes(@ModelAttribute Clientes clientes) {
		clientesService.saveClientes(clientes);
		return "forward:/indexClientes";
	}

	/**
	 * Select the child Visitas entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteClientesVisitases")
	public ModelAndView confirmDeleteClientesVisitases(@RequestParam BigDecimal clientes_numcliente, @RequestParam BigDecimal related_visitases_numcliente, @RequestParam Calendar related_visitases_fecha, @RequestParam BigDecimal related_visitases_numpropiedad) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("visitas", visitasDAO.findVisitasByPrimaryKey(related_visitases_numcliente, related_visitases_fecha, related_visitases_numpropiedad));
		mav.addObject("clientes_numcliente", clientes_numcliente);
		mav.setViewName("clientes/visitases/deleteVisitases.jsp");

		return mav;
	}

	/**
	 * Delete an existing Arriendos entity
	 * 
	 */
	@RequestMapping("/deleteClientesArriendoses")
	public ModelAndView deleteClientesArriendoses(@RequestParam BigDecimal clientes_numcliente, @RequestParam BigDecimal related_arriendoses_numarriendo) {
		ModelAndView mav = new ModelAndView();

		Clientes clientes = clientesService.deleteClientesArriendoses(clientes_numcliente, related_arriendoses_numarriendo);

		mav.addObject("clientes_numcliente", clientes_numcliente);
		mav.addObject("clientes", clientes);
		mav.setViewName("clientes/viewClientes.jsp");

		return mav;
	}

	/**
	 * Create a new Visitas entity
	 * 
	 */
	@RequestMapping("/newClientesVisitases")
	public ModelAndView newClientesVisitases(@RequestParam BigDecimal clientes_numcliente) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("clientes_numcliente", clientes_numcliente);
		mav.addObject("visitas", new Visitas());
		mav.addObject("newFlag", true);
		mav.setViewName("clientes/visitases/editVisitases.jsp");

		return mav;
	}

	/**
	 * Create a new Arriendos entity
	 * 
	 */
	@RequestMapping("/newClientesArriendoses")
	public ModelAndView newClientesArriendoses(@RequestParam BigDecimal clientes_numcliente) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("clientes_numcliente", clientes_numcliente);
		mav.addObject("arriendos", new Arriendos());
		mav.addObject("newFlag", true);
		mav.setViewName("clientes/arriendoses/editArriendoses.jsp");

		return mav;
	}

	/**
	 * Show all Clientes entities
	 * 
	 */
	@RequestMapping("/indexClientes")
	public ModelAndView listClientess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("clientess", clientesService.loadClientess());

		mav.setViewName("clientes/listClientess.jsp");

		return mav;
	}

	/**
	 * Save an existing Arriendos entity
	 * 
	 */
	@RequestMapping("/saveClientesArriendoses")
	public ModelAndView saveClientesArriendoses(@RequestParam BigDecimal clientes_numcliente, @ModelAttribute Arriendos arriendoses) {
		Clientes parent_clientes = clientesService.saveClientesArriendoses(clientes_numcliente, arriendoses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("clientes_numcliente", clientes_numcliente);
		mav.addObject("clientes", parent_clientes);
		mav.setViewName("clientes/viewClientes.jsp");

		return mav;
	}

	/**
	 * View an existing Visitas entity
	 * 
	 */
	@RequestMapping("/selectClientesVisitases")
	public ModelAndView selectClientesVisitases(@RequestParam BigDecimal clientes_numcliente, @RequestParam BigDecimal visitases_numcliente, @RequestParam Calendar visitases_fecha, @RequestParam BigDecimal visitases_numpropiedad) {
		Visitas visitas = visitasDAO.findVisitasByPrimaryKey(visitases_numcliente, visitases_fecha, visitases_numpropiedad, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("clientes_numcliente", clientes_numcliente);
		mav.addObject("visitas", visitas);
		mav.setViewName("clientes/visitases/viewVisitases.jsp");

		return mav;
	}

	/**
	 * Delete an existing Clientes entity
	 * 
	 */
	@RequestMapping("/deleteClientes")
	public String deleteClientes(@RequestParam BigDecimal numclienteKey) {
		Clientes clientes = clientesDAO.findClientesByPrimaryKey(numclienteKey);
		clientesService.deleteClientes(clientes);
		return "forward:/indexClientes";
	}

	/**
	 * Create a new Clientes entity
	 * 
	 */
	@RequestMapping("/newClientes")
	public ModelAndView newClientes() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("clientes", new Clientes());
		mav.addObject("newFlag", true);
		mav.setViewName("clientes/editClientes.jsp");

		return mav;
	}

	/**
	 * View an existing Arriendos entity
	 * 
	 */
	@RequestMapping("/selectClientesArriendoses")
	public ModelAndView selectClientesArriendoses(@RequestParam BigDecimal clientes_numcliente, @RequestParam BigDecimal arriendoses_numarriendo) {
		Arriendos arriendos = arriendosDAO.findArriendosByPrimaryKey(arriendoses_numarriendo, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("clientes_numcliente", clientes_numcliente);
		mav.addObject("arriendos", arriendos);
		mav.setViewName("clientes/arriendoses/viewArriendoses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Visitas entity
	 * 
	 */
	@RequestMapping("/editClientesVisitases")
	public ModelAndView editClientesVisitases(@RequestParam BigDecimal clientes_numcliente, @RequestParam BigDecimal visitases_numcliente, @RequestParam Calendar visitases_fecha, @RequestParam BigDecimal visitases_numpropiedad) {
		Visitas visitas = visitasDAO.findVisitasByPrimaryKey(visitases_numcliente, visitases_fecha, visitases_numpropiedad, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("clientes_numcliente", clientes_numcliente);
		mav.addObject("visitas", visitas);
		mav.setViewName("clientes/visitases/editVisitases.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/clientesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}
}