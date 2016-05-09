<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.propietarios-resources"/>
<html>
<head>
<title>View <fmt:message key="propietarios.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="propietarios.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexPropietarios"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propietarios.numpropietario.title"/>:
						</td>
						<td>
							${propietarios.numpropietario}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propietarios.nombre.title"/>:
						</td>
						<td>
							${propietarios.nombre}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propietarios.apellido.title"/>:
						</td>
						<td>
							${propietarios.apellido}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propietarios.direccion.title"/>:
						</td>
						<td>
							${propietarios.direccion}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propietarios.telefono.title"/>:
						</td>
						<td>
							${propietarios.telefono}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="propiedades.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newPropietariosPropiedadeses?propietarios_numpropietario=${propietarios.numpropietario}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="propiedades.title"/></span></a></div>
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
					<c:forEach items="${propietarios.propiedadeses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectPropietariosPropiedadeses?propietarios_numpropietario=${propietarios.numpropietario}&propiedadeses_numpropiedad=${current.numpropiedad}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editPropietariosPropiedadeses?propietarios_numpropietario=${propietarios.numpropietario}&propiedadeses_numpropiedad=${current.numpropiedad}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeletePropietariosPropiedadeses?propietarios_numpropietario=${propietarios.numpropietario}&related_propiedadeses_numpropiedad=${current.numpropiedad}&"><img src="images/icons/delete.gif" /></a>
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