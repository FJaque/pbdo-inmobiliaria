package com.duoc.inmobiliaria.web;

import com.duoc.inmobiliaria.dao.ArriendosDAO;
import com.duoc.inmobiliaria.dao.EmpleadosDAO;
import com.duoc.inmobiliaria.dao.PropiedadesDAO;
import com.duoc.inmobiliaria.dao.PropietariosDAO;
import com.duoc.inmobiliaria.dao.VisitasDAO;

import com.duoc.inmobiliaria.domain.Arriendos;
import com.duoc.inmobiliaria.domain.Empleados;
import com.duoc.inmobiliaria.domain.Propiedades;
import com.duoc.inmobiliaria.domain.Propietarios;
import com.duoc.inmobiliaria.domain.Visitas;

import com.duoc.inmobiliaria.service.PropiedadesService;

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
 * Spring MVC controller that handles CRUD requests for Propiedades entities
 * 
 */

@Controller("PropiedadesController")
public class PropiedadesController {

	/**
	 * DAO injected by Spring that manages Arriendos entities
	 * 
	 */
	@Autowired
	private ArriendosDAO arriendosDAO;

	/**
	 * DAO injected by Spring that manages Empleados entities
	 * 
	 */
	@Autowired
	private EmpleadosDAO empleadosDAO;

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
	 * DAO injected by Spring that manages Visitas entities
	 * 
	 */
	@Autowired
	private VisitasDAO visitasDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Propiedades entities
	 * 
	 */
	@Autowired
	private PropiedadesService propiedadesService;

	/**
	 * Show all Visitas entities by Propiedades
	 * 
	 */
	@RequestMapping("/listPropiedadesVisitases")
	public ModelAndView listPropiedadesVisitases(@RequestParam BigDecimal numpropiedadKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedades", propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedadKey));
		mav.setViewName("propiedades/visitases/listVisitases.jsp");

		return mav;
	}

	/**
	 * Create a new Propiedades entity
	 * 
	 */
	@RequestMapping("/newPropiedades")
	public ModelAndView newPropiedades() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedades", new Propiedades());
		mav.addObject("newFlag", true);
		mav.setViewName("propiedades/editPropiedades.jsp");

		return mav;
	}

	/**
	 * Select an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/selectPropiedades")
	public ModelAndView selectPropiedades(@RequestParam BigDecimal numpropiedadKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedades", propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedadKey));
		mav.setViewName("propiedades/viewPropiedades.jsp");

		return mav;
	}

	/**
	 * Save an existing Visitas entity
	 * 
	 */
	@RequestMapping("/savePropiedadesVisitases")
	public ModelAndView savePropiedadesVisitases(@RequestParam BigDecimal propiedades_numpropiedad, @ModelAttribute Visitas visitases) {
		Propiedades parent_propiedades = propiedadesService.savePropiedadesVisitases(propiedades_numpropiedad, visitases);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("propiedades", parent_propiedades);
		mav.setViewName("propiedades/viewPropiedades.jsp");

		return mav;
	}

	/**
	 * Select the Propiedades entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePropiedades")
	public ModelAndView confirmDeletePropiedades(@RequestParam BigDecimal numpropiedadKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedades", propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedadKey));
		mav.setViewName("propiedades/deletePropiedades.jsp");

		return mav;
	}

	/**
	 * Save an existing Empleados entity
	 * 
	 */
	@RequestMapping("/savePropiedadesEmpleados")
	public ModelAndView savePropiedadesEmpleados(@RequestParam BigDecimal propiedades_numpropiedad, @ModelAttribute Empleados empleados) {
		Propiedades parent_propiedades = propiedadesService.savePropiedadesEmpleados(propiedades_numpropiedad, empleados);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("propiedades", parent_propiedades);
		mav.setViewName("propiedades/viewPropiedades.jsp");

		return mav;
	}

	/**
	 * View an existing Visitas entity
	 * 
	 */
	@RequestMapping("/selectPropiedadesVisitases")
	public ModelAndView selectPropiedadesVisitases(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal visitases_numcliente, @RequestParam Calendar visitases_fecha, @RequestParam BigDecimal visitases_numpropiedad) {
		Visitas visitas = visitasDAO.findVisitasByPrimaryKey(visitases_numcliente, visitases_fecha, visitases_numpropiedad, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("visitas", visitas);
		mav.setViewName("propiedades/visitases/viewVisitases.jsp");

		return mav;
	}

	/**
	 * Select the child Empleados entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePropiedadesEmpleados")
	public ModelAndView confirmDeletePropiedadesEmpleados(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal related_empleados_numempleado) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("empleados", empleadosDAO.findEmpleadosByPrimaryKey(related_empleados_numempleado));
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.setViewName("propiedades/empleados/deleteEmpleados.jsp");

		return mav;
	}

	/**
	 * View an existing Arriendos entity
	 * 
	 */
	@RequestMapping("/selectPropiedadesArriendoses")
	public ModelAndView selectPropiedadesArriendoses(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal arriendoses_numarriendo) {
		Arriendos arriendos = arriendosDAO.findArriendosByPrimaryKey(arriendoses_numarriendo, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("arriendos", arriendos);
		mav.setViewName("propiedades/arriendoses/viewArriendoses.jsp");

		return mav;
	}

	/**
	 * View an existing Empleados entity
	 * 
	 */
	@RequestMapping("/selectPropiedadesEmpleados")
	public ModelAndView selectPropiedadesEmpleados(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal empleados_numempleado) {
		Empleados empleados = empleadosDAO.findEmpleadosByPrimaryKey(empleados_numempleado, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("empleados", empleados);
		mav.setViewName("propiedades/empleados/viewEmpleados.jsp");

		return mav;
	}

	/**
	 * Show all Arriendos entities by Propiedades
	 * 
	 */
	@RequestMapping("/listPropiedadesArriendoses")
	public ModelAndView listPropiedadesArriendoses(@RequestParam BigDecimal numpropiedadKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedades", propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedadKey));
		mav.setViewName("propiedades/arriendoses/listArriendoses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Propietarios entity
	 * 
	 */
	@RequestMapping("/editPropiedadesPropietarios")
	public ModelAndView editPropiedadesPropietarios(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal propietarios_numpropietario) {
		Propietarios propietarios = propietariosDAO.findPropietariosByPrimaryKey(propietarios_numpropietario, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("propietarios", propietarios);
		mav.setViewName("propiedades/propietarios/editPropietarios.jsp");

		return mav;
	}

	/**
	 * Create a new Empleados entity
	 * 
	 */
	@RequestMapping("/newPropiedadesEmpleados")
	public ModelAndView newPropiedadesEmpleados(@RequestParam BigDecimal propiedades_numpropiedad) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("empleados", new Empleados());
		mav.addObject("newFlag", true);
		mav.setViewName("propiedades/empleados/editEmpleados.jsp");

		return mav;
	}

	/**
	 * Delete an existing Arriendos entity
	 * 
	 */
	@RequestMapping("/deletePropiedadesArriendoses")
	public ModelAndView deletePropiedadesArriendoses(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal related_arriendoses_numarriendo) {
		ModelAndView mav = new ModelAndView();

		Propiedades propiedades = propiedadesService.deletePropiedadesArriendoses(propiedades_numpropiedad, related_arriendoses_numarriendo);

		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("propiedades", propiedades);
		mav.setViewName("propiedades/viewPropiedades.jsp");

		return mav;
	}

	/**
	 * Edit an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/editPropiedades")
	public ModelAndView editPropiedades(@RequestParam BigDecimal numpropiedadKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedades", propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedadKey));
		mav.setViewName("propiedades/editPropiedades.jsp");

		return mav;
	}

	/**
	 * Delete an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/deletePropiedades")
	public String deletePropiedades(@RequestParam BigDecimal numpropiedadKey) {
		Propiedades propiedades = propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedadKey);
		propiedadesService.deletePropiedades(propiedades);
		return "forward:/indexPropiedades";
	}

	/**
	 * Select the child Visitas entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePropiedadesVisitases")
	public ModelAndView confirmDeletePropiedadesVisitases(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal related_visitases_numcliente, @RequestParam Calendar related_visitases_fecha, @RequestParam BigDecimal related_visitases_numpropiedad) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("visitas", visitasDAO.findVisitasByPrimaryKey(related_visitases_numcliente, related_visitases_fecha, related_visitases_numpropiedad));
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.setViewName("propiedades/visitases/deleteVisitases.jsp");

		return mav;
	}

	/**
	 * Create a new Visitas entity
	 * 
	 */
	@RequestMapping("/newPropiedadesVisitases")
	public ModelAndView newPropiedadesVisitases(@RequestParam BigDecimal propiedades_numpropiedad) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("visitas", new Visitas());
		mav.addObject("newFlag", true);
		mav.setViewName("propiedades/visitases/editVisitases.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Propiedades entities
	 * 
	 */
	public String indexPropiedades() {
		return "redirect:/indexPropiedades";
	}

	/**
	 */
	@RequestMapping("/propiedadesController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Delete an existing Propietarios entity
	 * 
	 */
	@RequestMapping("/deletePropiedadesPropietarios")
	public ModelAndView deletePropiedadesPropietarios(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal related_propietarios_numpropietario) {
		ModelAndView mav = new ModelAndView();

		Propiedades propiedades = propiedadesService.deletePropiedadesPropietarios(propiedades_numpropiedad, related_propietarios_numpropietario);

		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("propiedades", propiedades);
		mav.setViewName("propiedades/viewPropiedades.jsp");

		return mav;
	}

	/**
	 * Select the child Arriendos entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePropiedadesArriendoses")
	public ModelAndView confirmDeletePropiedadesArriendoses(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal related_arriendoses_numarriendo) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("arriendos", arriendosDAO.findArriendosByPrimaryKey(related_arriendoses_numarriendo));
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.setViewName("propiedades/arriendoses/deleteArriendoses.jsp");

		return mav;
	}

	/**
	 * Select the child Propietarios entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePropiedadesPropietarios")
	public ModelAndView confirmDeletePropiedadesPropietarios(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal related_propietarios_numpropietario) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propietarios", propietariosDAO.findPropietariosByPrimaryKey(related_propietarios_numpropietario));
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.setViewName("propiedades/propietarios/deletePropietarios.jsp");

		return mav;
	}

	/**
	 * Show all Propiedades entities
	 * 
	 */
	@RequestMapping("/indexPropiedades")
	public ModelAndView listPropiedadess() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedadess", propiedadesService.loadPropiedadess());

		mav.setViewName("propiedades/listPropiedadess.jsp");

		return mav;
	}

	/**
	 * Save an existing Propietarios entity
	 * 
	 */
	@RequestMapping("/savePropiedadesPropietarios")
	public ModelAndView savePropiedadesPropietarios(@RequestParam BigDecimal propiedades_numpropiedad, @ModelAttribute Propietarios propietarios) {
		Propiedades parent_propiedades = propiedadesService.savePropiedadesPropietarios(propiedades_numpropiedad, propietarios);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("propiedades", parent_propiedades);
		mav.setViewName("propiedades/viewPropiedades.jsp");

		return mav;
	}

	/**
	 * Create a new Propietarios entity
	 * 
	 */
	@RequestMapping("/newPropiedadesPropietarios")
	public ModelAndView newPropiedadesPropietarios(@RequestParam BigDecimal propiedades_numpropiedad) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("propietarios", new Propietarios());
		mav.addObject("newFlag", true);
		mav.setViewName("propiedades/propietarios/editPropietarios.jsp");

		return mav;
	}

	/**
	 * Create a new Arriendos entity
	 * 
	 */
	@RequestMapping("/newPropiedadesArriendoses")
	public ModelAndView newPropiedadesArriendoses(@RequestParam BigDecimal propiedades_numpropiedad) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("arriendos", new Arriendos());
		mav.addObject("newFlag", true);
		mav.setViewName("propiedades/arriendoses/editArriendoses.jsp");

		return mav;
	}

	/**
	 * Edit an existing Empleados entity
	 * 
	 */
	@RequestMapping("/editPropiedadesEmpleados")
	public ModelAndView editPropiedadesEmpleados(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal empleados_numempleado) {
		Empleados empleados = empleadosDAO.findEmpleadosByPrimaryKey(empleados_numempleado, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("empleados", empleados);
		mav.setViewName("propiedades/empleados/editEmpleados.jsp");

		return mav;
	}

	/**
	 * Delete an existing Visitas entity
	 * 
	 */
	@RequestMapping("/deletePropiedadesVisitases")
	public ModelAndView deletePropiedadesVisitases(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal related_visitases_numcliente, @RequestParam Calendar related_visitases_fecha, @RequestParam BigDecimal related_visitases_numpropiedad) {
		ModelAndView mav = new ModelAndView();

		Propiedades propiedades = propiedadesService.deletePropiedadesVisitases(propiedades_numpropiedad, related_visitases_numcliente, related_visitases_fecha, related_visitases_numpropiedad);

		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("propiedades", propiedades);
		mav.setViewName("propiedades/viewPropiedades.jsp");

		return mav;
	}

	/**
	 * Save an existing Propiedades entity
	 * 
	 */
	@RequestMapping("/savePropiedades")
	public String savePropiedades(@ModelAttribute Propiedades propiedades) {
		propiedadesService.savePropiedades(propiedades);
		return "forward:/indexPropiedades";
	}

	/**
	 * Show all Empleados entities by Propiedades
	 * 
	 */
	@RequestMapping("/listPropiedadesEmpleados")
	public ModelAndView listPropiedadesEmpleados(@RequestParam BigDecimal numpropiedadKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedades", propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedadKey));
		mav.setViewName("propiedades/empleados/listEmpleados.jsp");

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
	 * Edit an existing Arriendos entity
	 * 
	 */
	@RequestMapping("/editPropiedadesArriendoses")
	public ModelAndView editPropiedadesArriendoses(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal arriendoses_numarriendo) {
		Arriendos arriendos = arriendosDAO.findArriendosByPrimaryKey(arriendoses_numarriendo, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("arriendos", arriendos);
		mav.setViewName("propiedades/arriendoses/editArriendoses.jsp");

		return mav;
	}

	/**
	 * View an existing Propietarios entity
	 * 
	 */
	@RequestMapping("/selectPropiedadesPropietarios")
	public ModelAndView selectPropiedadesPropietarios(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal propietarios_numpropietario) {
		Propietarios propietarios = propietariosDAO.findPropietariosByPrimaryKey(propietarios_numpropietario, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("propietarios", propietarios);
		mav.setViewName("propiedades/propietarios/viewPropietarios.jsp");

		return mav;
	}

	/**
	 * Save an existing Arriendos entity
	 * 
	 */
	@RequestMapping("/savePropiedadesArriendoses")
	public ModelAndView savePropiedadesArriendoses(@RequestParam BigDecimal propiedades_numpropiedad, @ModelAttribute Arriendos arriendoses) {
		Propiedades parent_propiedades = propiedadesService.savePropiedadesArriendoses(propiedades_numpropiedad, arriendoses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("propiedades", parent_propiedades);
		mav.setViewName("propiedades/viewPropiedades.jsp");

		return mav;
	}

	/**
	 * Delete an existing Empleados entity
	 * 
	 */
	@RequestMapping("/deletePropiedadesEmpleados")
	public ModelAndView deletePropiedadesEmpleados(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal related_empleados_numempleado) {
		ModelAndView mav = new ModelAndView();

		Propiedades propiedades = propiedadesService.deletePropiedadesEmpleados(propiedades_numpropiedad, related_empleados_numempleado);

		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("propiedades", propiedades);
		mav.setViewName("propiedades/viewPropiedades.jsp");

		return mav;
	}

	/**
	 * Edit an existing Visitas entity
	 * 
	 */
	@RequestMapping("/editPropiedadesVisitases")
	public ModelAndView editPropiedadesVisitases(@RequestParam BigDecimal propiedades_numpropiedad, @RequestParam BigDecimal visitases_numcliente, @RequestParam Calendar visitases_fecha, @RequestParam BigDecimal visitases_numpropiedad) {
		Visitas visitas = visitasDAO.findVisitasByPrimaryKey(visitases_numcliente, visitases_fecha, visitases_numpropiedad, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("propiedades_numpropiedad", propiedades_numpropiedad);
		mav.addObject("visitas", visitas);
		mav.setViewName("propiedades/visitases/editVisitases.jsp");

		return mav;
	}

	/**
	 * Show all Propietarios entities by Propiedades
	 * 
	 */
	@RequestMapping("/listPropiedadesPropietarios")
	public ModelAndView listPropiedadesPropietarios(@RequestParam BigDecimal numpropiedadKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("propiedades", propiedadesDAO.findPropiedadesByPrimaryKey(numpropiedadKey));
		mav.setViewName("propiedades/propietarios/listPropietarios.jsp");

		return mav;
	}
}