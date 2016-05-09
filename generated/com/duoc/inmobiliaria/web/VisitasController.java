package com.duoc.inmobiliaria.web;

import com.duoc.inmobiliaria.dao.ClientesDAO;
import com.duoc.inmobiliaria.dao.PropiedadesDAO;
import com.duoc.inmobiliaria.dao.VisitasDAO;

import com.duoc.inmobiliaria.domain.Clientes;
import com.duoc.inmobiliaria.domain.Propiedades;
import com.duoc.inmobiliaria.domain.Visitas;

import com.duoc.inmobiliaria.service.VisitasService;

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
 * Spring MVC controller that handles CRUD requests for Visitas entities
 * 
 */

@Controller("VisitasController")
public class VisitasController {

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
	 * DAO injected by Spring that manages Visitas entities
	 * 
	 */
	@Autowired
	private VisitasDAO visitasDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Visitas entities
	 * 
	 */
	@Autowired
	private VisitasService visitasService;

	/**
	 * Select the child Clientes entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVisitasClientes")
	public ModelAndView confirmDeleteVisitasClientes(@RequestParam BigDecimal visitas_numcliente, @RequestParam Calendar visitas_fecha, @RequestParam BigDecimal visitas_numpropiedad, @RequestParam BigDecimal related_clientes_numcliente) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("clientes", clientesDAO.findClientesByPrimaryKey(related_clientes_numcliente));
		mav.addObject("visitas_numcliente", visitas_numcliente);
		mav.addObject("visitas_fecha", visitas_fecha);
		mav.addObject("visitas_numpropiedad", visitas_numpropiedad);
		mav.setViewName("visitas/clientes/deleteClientes.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Visitas entities
	 * 
	 */
	public String indexVisitas() {
		return "redirect:/indexVisitas";
	}

	/**
	 * Delete an existing Clientes entity
	 * 
	 */
	@RequestMapping("/deleteVisitasClientes")
	public ModelAndView deleteVisitasClientes(@RequestParam BigDecimal visitas_numcliente, @RequestParam Calendar visitas_fecha, @RequestParam BigDecimal visitas_numpropiedad, @RequestParam BigDecimal related_clientes_numcliente) {
		ModelAndView mav = new ModelAndView();

		Visitas visitas = visitasService.deleteVisitasClientes(visitas_numcliente, visitas_fecha, visitas_numpropiedad, related_clientes_numcliente);

		mav.addObject("visitas_numcliente", visitas_numcliente);
		mav.addObject("visitas_fecha", visitas_fecha);
		mav.addObject("visitas_numpropiedad", visitas_numpropiedad);
		mav.addObject("visitas", visitas);
		mav.setViewName("visitas/viewVisitas.jsp");

		return mav;
	}

	/**
	 * Edit an existing Visitas entity
	 * 
	 */
	@RequestMapping("/editVisitas")
	public ModelAndView editVisitas(@RequestParam BigDecimal numclienteKey, @RequestParam Calendar fechaKey, @RequestParam BigDecimal numpropiedadKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("visitas", visitasDAO.findVisitasByPrimaryKey(numclienteKey, fechaKey, numpropiedadKey));
		mav.setViewName("visitas/editVisitas.jsp");

		return mav;
	}

	/**
	 * Show all Visitas entities
	 * 
	 */
	@RequestMapping("/indexVisitas")
	public ModelAndView listVisitass() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("visitass", visitasService.loadVisitass());

		mav.setViewName("visitas/listVisitass.jsp");

		return mav;
	}

	/**
	 * Select the Visitas entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVisitas")
	public ModelAndView confirmDeleteVisitas(@RequestParam BigDecimal numclienteKey, @RequestParam Calendar fechaKey, @RequestParam BigDecimal numpropiedadKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("visitas", visitasDAO.findVisitasByPrimaryKey(numclienteKey, fechaKey, numpropiedadKey));
		mav.setViewName("visitas/deleteVisitas.jsp");

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
	 * Select an existing Visitas entity
	 * 
	 */
	@RequestMapping("/selectVisitas")
	public ModelAndView selectVisitas(@RequestParam BigDecimal numclienteKey, @RequestParam Calendar fechaKey, @RequestParam BigDecimal numpropiedadKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("visitas", visitasDAO.findVisitasByPrimaryKey(numclienteKey, fechaKey, numpropiedadKey));
		mav.setViewName("visitas/viewVisitas.jsp");

		return mav;
	}

	/**
	 * Edit an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/editVisitasPropiedades")
	public ModelAndView editVisitasPropiedades(@RequestParam BigDecimal visitas_numcliente, @RequestParam Calendar visitas_fecha, @RequestParam BigDecimal visitas_numpropiedad, @RequestParam BigDecimal propiedades_numpropiedad) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedades_numpropiedad, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("visitas_numcliente", visitas_numcliente);
		mav.addObject("visitas_fecha", visitas_fecha);
		mav.addObject("visitas_numpropiedad", visitas_numpropiedad);
		mav.addObject("propiedades", propiedades);
		mav.setViewName("visitas/propiedades/editPropiedades.jsp");

		return mav;
	}

	/**
	 * Edit an existing Clientes entity
	 * 
	 */
	@RequestMapping("/editVisitasClientes")
	public ModelAndView editVisitasClientes(@RequestParam BigDecimal visitas_numcliente, @RequestParam Calendar visitas_fecha, @RequestParam BigDecimal visitas_numpropiedad, @RequestParam BigDecimal clientes_numcliente) {
		Clientes clientes = clientesDAO.findClientesByPrimaryKey(clientes_numcliente, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("visitas_numcliente", visitas_numcliente);
		mav.addObject("visitas_fecha", visitas_fecha);
		mav.addObject("visitas_numpropiedad", visitas_numpropiedad);
		mav.addObject("clientes", clientes);
		mav.setViewName("visitas/clientes/editClientes.jsp");

		return mav;
	}

	/**
	 * Delete an existing Visitas entity
	 * 
	 */
	@RequestMapping("/deleteVisitas")
	public String deleteVisitas(@RequestParam BigDecimal numclienteKey, @RequestParam Calendar fechaKey, @RequestParam BigDecimal numpropiedadKey) {
		Visitas visitas = visitasDAO.findVisitasByPrimaryKey(numclienteKey, fechaKey, numpropiedadKey);
		visitasService.deleteVisitas(visitas);
		return "forward:/indexVisitas";
	}

	/**
	 * Create a new Propiedades entity
	 * 
	 */
	@RequestMapping("/newVisitasPropiedades")
	public ModelAndView newVisitasPropiedades(@RequestParam BigDecimal visitas_numcliente, @RequestParam Calendar visitas_fecha, @RequestParam BigDecimal visitas_numpropiedad) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("visitas_numcliente", visitas_numcliente);
		mav.addObject("visitas_fecha", visitas_fecha);
		mav.addObject("visitas_numpropiedad", visitas_numpropiedad);
		mav.addObject("propiedades", new Propiedades());
		mav.addObject("newFlag", true);
		mav.setViewName("visitas/propiedades/editPropiedades.jsp");

		return mav;
	}

	/**
	 * View an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/selectVisitasPropiedades")
	public ModelAndView selectVisitasPropiedades(@RequestParam BigDecimal visitas_numcliente, @RequestParam Calendar visitas_fecha, @RequestParam BigDecimal visitas_numpropiedad, @RequestParam BigDecimal propiedades_numpropiedad) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(propiedades_numpropiedad, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("visitas_numcliente", visitas_numcliente);
		mav.addObject("visitas_fecha", visitas_fecha);
		mav.addObject("visitas_numpropiedad", visitas_numpropiedad);
		mav.addObject("propiedades", propiedades);
		mav.setViewName("visitas/propiedades/viewPropiedades.jsp");

		return mav;
	}

	/**
	 * Show all Propiedades entities by Visitas
	 * 
	 */
	@RequestMapping("/listVisitasPropiedades")
	public ModelAndView listVisitasPropiedades(@RequestParam BigDecimal numclienteKey, @RequestParam Calendar fechaKey, @RequestParam BigDecimal numpropiedadKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("visitas", visitasDAO.findVisitasByPrimaryKey(numclienteKey, fechaKey, numpropiedadKey));
		mav.setViewName("visitas/propiedades/listPropiedades.jsp");

		return mav;
	}

	/**
	 * Create a new Visitas entity
	 * 
	 */
	@RequestMapping("/newVisitas")
	public ModelAndView newVisitas() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("visitas", new Visitas());
		mav.addObject("newFlag", true);
		mav.setViewName("visitas/editVisitas.jsp");

		return mav;
	}

	/**
	 * Select the child Propiedades entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteVisitasPropiedades")
	public ModelAndView confirmDeleteVisitasPropiedades(@RequestParam BigDecimal visitas_numcliente, @RequestParam Calendar visitas_fecha, @RequestParam BigDecimal visitas_numpropiedad, @RequestParam BigDecimal related_propiedades_numpropiedad) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedades", propiedadesDAO.findPropiedadesByPrimaryKey(related_propiedades_numpropiedad));
		mav.addObject("visitas_numcliente", visitas_numcliente);
		mav.addObject("visitas_fecha", visitas_fecha);
		mav.addObject("visitas_numpropiedad", visitas_numpropiedad);
		mav.setViewName("visitas/propiedades/deletePropiedades.jsp");

		return mav;
	}

	/**
	 * View an existing Clientes entity
	 * 
	 */
	@RequestMapping("/selectVisitasClientes")
	public ModelAndView selectVisitasClientes(@RequestParam BigDecimal visitas_numcliente, @RequestParam Calendar visitas_fecha, @RequestParam BigDecimal visitas_numpropiedad, @RequestParam BigDecimal clientes_numcliente) {
		Clientes clientes = clientesDAO.findClientesByPrimaryKey(clientes_numcliente, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("visitas_numcliente", visitas_numcliente);
		mav.addObject("visitas_fecha", visitas_fecha);
		mav.addObject("visitas_numpropiedad", visitas_numpropiedad);
		mav.addObject("clientes", clientes);
		mav.setViewName("visitas/clientes/viewClientes.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/visitasController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all Clientes entities by Visitas
	 * 
	 */
	@RequestMapping("/listVisitasClientes")
	public ModelAndView listVisitasClientes(@RequestParam BigDecimal numclienteKey, @RequestParam Calendar fechaKey, @RequestParam BigDecimal numpropiedadKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("visitas", visitasDAO.findVisitasByPrimaryKey(numclienteKey, fechaKey, numpropiedadKey));
		mav.setViewName("visitas/clientes/listClientes.jsp");

		return mav;
	}

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/saveVisitasPropiedades")
	public ModelAndView saveVisitasPropiedades(@RequestParam BigDecimal visitas_numcliente, @RequestParam Calendar visitas_fecha, @RequestParam BigDecimal visitas_numpropiedad, @ModelAttribute Propiedades propiedades) {
		Visitas parent_visitas = visitasService.saveVisitasPropiedades(visitas_numcliente, visitas_fecha, visitas_numpropiedad, propiedades);

		ModelAndView mav = new ModelAndView();
		mav.addObject("visitas_numcliente", visitas_numcliente);
		mav.addObject("visitas_fecha", visitas_fecha);
		mav.addObject("visitas_numpropiedad", visitas_numpropiedad);
		mav.addObject("visitas", parent_visitas);
		mav.setViewName("visitas/viewVisitas.jsp");

		return mav;
	}

	/**
	 * Save an existing Visitas entity
	 * 
	 */
	@RequestMapping("/saveVisitas")
	public String saveVisitas(@ModelAttribute Visitas visitas) {
		visitasService.saveVisitas(visitas);
		return "forward:/indexVisitas";
	}

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/deleteVisitasPropiedades")
	public ModelAndView deleteVisitasPropiedades(@RequestParam BigDecimal visitas_numcliente, @RequestParam Calendar visitas_fecha, @RequestParam BigDecimal visitas_numpropiedad, @RequestParam BigDecimal related_propiedades_numpropiedad) {
		ModelAndView mav = new ModelAndView();

		Visitas visitas = visitasService.deleteVisitasPropiedades(visitas_numcliente, visitas_fecha, visitas_numpropiedad, related_propiedades_numpropiedad);

		mav.addObject("visitas_numcliente", visitas_numcliente);
		mav.addObject("visitas_fecha", visitas_fecha);
		mav.addObject("visitas_numpropiedad", visitas_numpropiedad);
		mav.addObject("visitas", visitas);
		mav.setViewName("visitas/viewVisitas.jsp");

		return mav;
	}

	/**
	 * Create a new Clientes entity
	 * 
	 */
	@RequestMapping("/newVisitasClientes")
	public ModelAndView newVisitasClientes(@RequestParam BigDecimal visitas_numcliente, @RequestParam Calendar visitas_fecha, @RequestParam BigDecimal visitas_numpropiedad) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("visitas_numcliente", visitas_numcliente);
		mav.addObject("visitas_fecha", visitas_fecha);
		mav.addObject("visitas_numpropiedad", visitas_numpropiedad);
		mav.addObject("clientes", new Clientes());
		mav.addObject("newFlag", true);
		mav.setViewName("visitas/clientes/editClientes.jsp");

		return mav;
	}

	/**
	 * Save an existing Clientes entity
	 * 
	 */
	@RequestMapping("/saveVisitasClientes")
	public ModelAndView saveVisitasClientes(@RequestParam BigDecimal visitas_numcliente, @RequestParam Calendar visitas_fecha, @RequestParam BigDecimal visitas_numpropiedad, @ModelAttribute Clientes clientes) {
		Visitas parent_visitas = visitasService.saveVisitasClientes(visitas_numcliente, visitas_fecha, visitas_numpropiedad, clientes);

		ModelAndView mav = new ModelAndView();
		mav.addObject("visitas_numcliente", visitas_numcliente);
		mav.addObject("visitas_fecha", visitas_fecha);
		mav.addObject("visitas_numpropiedad", visitas_numpropiedad);
		mav.addObject("visitas", parent_visitas);
		mav.setViewName("visitas/viewVisitas.jsp");

		return mav;
	}
}