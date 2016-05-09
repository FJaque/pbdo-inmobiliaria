<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.propiedades-resources"/>
<html>
<head>
<title>View <fmt:message key="propiedades.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="propiedades.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexPropiedades"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.numpropiedad.title"/>:
						</td>
						<td>
							${propiedades.numpropiedad}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.calle.title"/>:
						</td>
						<td>
							${propiedades.calle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.ciudad.title"/>:
						</td>
						<td>
							${propiedades.ciudad}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.codigopostal.title"/>:
						</td>
						<td>
							${propiedades.codigopostal}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.tipo.title"/>:
						</td>
						<td>
							${propiedades.tipo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.habitaciones.title"/>:
						</td>
						<td>
							${propiedades.habitaciones}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.renta.title"/>:
						</td>
						<td>
							${propiedades.renta}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="empleados.title"/></h1>
					
						<c:if test='${propiedades.empleados != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="empleados.numempleado.title"/>:
						</td>
						<td>
							${propiedades.empleados.numempleado}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="empleados.nombre.title"/>:
						</td>
						<td>
							${propiedades.empleados.nombre}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="empleados.apellido.title"/>:
						</td>
						<td>
							${propiedades.empleados.apellido}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="empleados.cargo.title"/>:
						</td>
						<td>
							${propiedades.empleados.cargo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="empleados.sexo.title"/>:
						</td>
						<td>
							${propiedades.empleados.sexo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="empleados.fechanac.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${propiedades.empleados.fechanac.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="empleados.salario.title"/>:
						</td>
						<td>
							${propiedades.empleados.salario}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editPropiedadesEmpleados?propiedades_numpropiedad=${propiedades.numpropiedad}&empleados_numempleado=${propiedades.empleados.numempleado}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeletePropiedadesEmpleados?propiedades_numpropiedad=${propiedades.numpropiedad}&related_empleados_numempleado=${propiedades.empleados.numempleado}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${propiedades.empleados == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newPropiedadesEmpleados?propiedades_numpropiedad=${propiedades.numpropiedad}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="empleados.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="propietarios.title"/></h1>
					
						<c:if test='${propiedades.propietarios != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="propietarios.numpropietario.title"/>:
						</td>
						<td>
							${propiedades.propietarios.numpropietario}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propietarios.nombre.title"/>:
						</td>
						<td>
							${propiedades.propietarios.nombre}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propietarios.apellido.title"/>:
						</td>
						<td>
							${propiedades.propietarios.apellido}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propietarios.direccion.title"/>:
						</td>
						<td>
							${propiedades.propietarios.direccion}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propietarios.telefono.title"/>:
						</td>
						<td>
							${propiedades.propietarios.telefono}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editPropiedadesPropietarios?propiedades_numpropiedad=${propiedades.numpropiedad}&propietarios_numpropietario=${propiedades.propietarios.numpropietario}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeletePropiedadesPropietarios?propiedades_numpropiedad=${propiedades.numpropiedad}&related_propietarios_numpropietario=${propiedades.propietarios.numpropietario}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${propiedades.propietarios == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newPropiedadesPropietarios?propiedades_numpropiedad=${propiedades.numpropiedad}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="propietarios.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="visitas.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newPropiedadesVisitases?propiedades_numpropiedad=${propiedades.numpropiedad}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="visitas.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="visitas.numcliente.title"/></th>
						<th class="thead"><fmt:message key="visitas.fecha.title"/></th>
						<th class="thead"><fmt:message key="visitas.numpropiedad.title"/></th>
						<th class="thead"><fmt:message key="visitas.comentario.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${propiedades.visitases}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectPropiedadesVisitases?propiedades_numpropiedad=${propiedades.numpropiedad}&visitases_numcliente=${current.numcliente}&visitases_fecha=${current.fecha}&visitases_numpropiedad=${current.numpropiedad}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editPropiedadesVisitases?propiedades_numpropiedad=${propiedades.numpropiedad}&visitases_numcliente=${current.numcliente}&visitases_fecha=${current.fecha}&visitases_numpropiedad=${current.numpropiedad}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeletePropiedadesVisitases?propiedades_numpropiedad=${propiedades.numpropiedad}&related_visitases_numcliente=${current.numcliente}&related_visitases_fecha=${current.fecha}&related_visitases_numpropiedad=${current.numpropiedad}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.numcliente}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.fecha.time}"/>
						&nbsp;
						</td>
						<td>
							${current.numpropiedad}
						&nbsp;
						</td>
						<td>
							${current.comentario}
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="arriendos.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newPropiedadesArriendoses?propiedades_numpropiedad=${propiedades.numpropiedad}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="arriendos.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="arriendos.numarriendo.title"/></th>
						<th class="thead"><fmt:message key="arriendos.renta.title"/></th>
						<th class="thead"><fmt:message key="arriendos.formapago.title"/></th>
						<th class="thead"><fmt:message key="arriendos.pagado.title"/></th>
						<th class="thead"><fmt:message key="arriendos.iniciorenta.title"/></th>
						<th class="thead"><fmt:message key="arriendos.finrenta.title"/></th>
						<th class="thead"><fmt:message key="arriendos.mespago.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${propiedades.arriendoses}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectPropiedadesArriendoses?propiedades_numpropiedad=${propiedades.numpropiedad}&arriendoses_numarriendo=${current.numarriendo}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editPropiedadesArriendoses?propiedades_numpropiedad=${propiedades.numpropiedad}&arriendoses_numarriendo=${current.numarriendo}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeletePropiedadesArriendoses?propiedades_numpropiedad=${propiedades.numpropiedad}&related_arriendoses_numarriendo=${current.numarriendo}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.numarriendo}
						&nbsp;
						</td>
						<td>
							${current.renta}
						&nbsp;
						</td>
						<td>
							${current.formapago}
						&nbsp;
						</td>
						<td>
							${current.pagado}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.iniciorenta.time}"/>
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.finrenta.time}"/>
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.mespago.time}"/>
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>