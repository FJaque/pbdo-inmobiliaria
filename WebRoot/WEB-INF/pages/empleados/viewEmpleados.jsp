<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.empleados-resources"/>
<html>
<head>
<title>View <fmt:message key="empleados.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="empleados.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexEmpleados"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="empleados.numempleado.title"/>:
						</td>
						<td>
							${empleados.numempleado}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="empleados.nombre.title"/>:
						</td>
						<td>
							${empleados.nombre}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="empleados.apellido.title"/>:
						</td>
						<td>
							${empleados.apellido}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="empleados.cargo.title"/>:
						</td>
						<td>
							${empleados.cargo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="empleados.sexo.title"/>:
						</td>
						<td>
							${empleados.sexo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="empleados.fechanac.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${empleados.fechanac.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="empleados.salario.title"/>:
						</td>
						<td>
							${empleados.salario}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="oficinas.title"/></h1>
					
						<c:if test='${empleados.oficinas != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="oficinas.numoficina.title"/>:
						</td>
						<td>
							${empleados.oficinas.numoficina}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="oficinas.calle.title"/>:
						</td>
						<td>
							${empleados.oficinas.calle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="oficinas.ciudad.title"/>:
						</td>
						<td>
							${empleados.oficinas.ciudad}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="oficinas.codigopostal.title"/>:
						</td>
						<td>
							${empleados.oficinas.codigopostal}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editEmpleadosOficinas?empleados_numempleado=${empleados.numempleado}&oficinas_numoficina=${empleados.oficinas.numoficina}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteEmpleadosOficinas?empleados_numempleado=${empleados.numempleado}&related_oficinas_numoficina=${empleados.oficinas.numoficina}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${empleados.oficinas == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newEmpleadosOficinas?empleados_numempleado=${empleados.numempleado}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="oficinas.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="propiedades.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newEmpleadosPropiedadeses?empleados_numempleado=${empleados.numempleado}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="propiedades.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="propiedades.numpropiedad.title"/></th>
						<th class="thead"><fmt:message key="propiedades.calle.title"/></th>
						<th class="thead"><fmt:message key="propiedades.ciudad.title"/></th>
						<th class="thead"><fmt:message key="propiedades.codigopostal.title"/></th>
						<th class="thead"><fmt:message key="propiedades.tipo.title"/></th>
						<th class="thead"><fmt:message key="propiedades.habitaciones.title"/></th>
						<th class="thead"><fmt:message key="propiedades.renta.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${empleados.propiedadeses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectEmpleadosPropiedadeses?empleados_numempleado=${empleados.numempleado}&propiedadeses_numpropiedad=${current.numpropiedad}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editEmpleadosPropiedadeses?empleados_numempleado=${empleados.numempleado}&propiedadeses_numpropiedad=${current.numpropiedad}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteEmpleadosPropiedadeses?empleados_numempleado=${empleados.numempleado}&related_propiedadeses_numpropiedad=${current.numpropiedad}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.numpropiedad}
						&nbsp;
						</td>
						<td>
							${current.calle}
						&nbsp;
						</td>
						<td>
							${current.ciudad}
						&nbsp;
						</td>
						<td>
							${current.codigopostal}
						&nbsp;
						</td>
						<td>
							${current.tipo}
						&nbsp;
						</td>
						<td>
							${current.habitaciones}
						&nbsp;
						</td>
						<td>
							${current.renta}
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