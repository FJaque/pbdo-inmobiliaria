package com.duoc.inmobiliaria.dao;

import com.duoc.inmobiliaria.domain.Arriendos;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Arriendos entities.
 * 
 */
public interface ArriendosDAO extends JpaDao<Arriendos> {

	/**
	 * JPQL Query - findArriendosByFormapago
	 *
	 */
	public Set<Arriendos> findArriendosByFormapago(String formapago) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByFormapago
	 *
	 */
	public Set<Arriendos> findArriendosByFormapago(String formapago, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByFinrenta
	 *
	 */
	public Set<Arriendos> findArriendosByFinrenta(java.util.Calendar finrenta) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByFinrenta
	 *
	 */
	public Set<Arriendos> findArriendosByFinrenta(Calendar finrenta, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByNumarriendo
	 *
	 */
	public Arriendos findArriendosByNumarriendo(java.math.BigDecimal numarriendo) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByNumarriendo
	 *
	 */
	public Arriendos findArriendosByNumarriendo(BigDecimal numarriendo, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByPrimaryKey
	 *
	 */
	public Arriendos findArriendosByPrimaryKey(java.math.BigDecimal numarriendo_1) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByPrimaryKey
	 *
	 */
	public Arriendos findArriendosByPrimaryKey(BigDecimal numarriendo_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByRenta
	 *
	 */
	public Set<Arriendos> findArriendosByRenta(java.math.BigDecimal renta) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByRenta
	 *
	 */
	public Set<Arriendos> findArriendosByRenta(BigDecimal renta, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByMespago
	 *
	 */
	public Set<Arriendos> findArriendosByMespago(java.util.Calendar mespago) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByMespago
	 *
	 */
	public Set<Arriendos> findArriendosByMespago(Calendar mespago, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByIniciorenta
	 *
	 */
	public Set<Arriendos> findArriendosByIniciorenta(java.util.Calendar iniciorenta) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByIniciorenta
	 *
	 */
	public Set<Arriendos> findArriendosByIniciorenta(Calendar iniciorenta, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllArriendoss
	 *
	 */
	public Set<Arriendos> findAllArriendoss() throws DataAccessException;

	/**
	 * JPQL Query - findAllArriendoss
	 *
	 */
	public Set<Arriendos> findAllArriendoss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByPagado
	 *
	 */
	public Set<Arriendos> findArriendosByPagado(java.math.BigDecimal pagado) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByPagado
	 *
	 */
	public Set<Arriendos> findArriendosByPagado(BigDecimal pagado, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByFormapagoContaining
	 *
	 */
	public Set<Arriendos> findArriendosByFormapagoContaining(String formapago_1) throws DataAccessException;

	/**
	 * JPQL Query - findArriendosByFormapagoContaining
	 *
	 */
	public Set<Arriendos> findArriendosByFormapagoContaining(String formapago_1, int startResult, int maxRows) throws DataAccessException;

}