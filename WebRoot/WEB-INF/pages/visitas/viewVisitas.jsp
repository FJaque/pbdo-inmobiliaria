<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.visitas-resources"/>
<html>
<head>
<title>View <fmt:message key="visitas.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="visitas.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexVisitas"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="visitas.numcliente.title"/>:
						</td>
						<td>
							${visitas.numcliente}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="visitas.fecha.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${visitas.fecha.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="visitas.numpropiedad.title"/>:
						</td>
						<td>
							${visitas.numpropiedad}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="visitas.comentario.title"/>:
						</td>
						<td>
							${visitas.comentario}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="propiedades.title"/></h1>
					
						<c:if test='${visitas.propiedades != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.numpropiedad.title"/>:
						</td>
						<td>
							${visitas.propiedades.numpropiedad}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.calle.title"/>:
						</td>
						<td>
							${visitas.propiedades.calle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.ciudad.title"/>:
						</td>
						<td>
							${visitas.propiedades.ciudad}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.codigopostal.title"/>:
						</td>
						<td>
							${visitas.propiedades.codigopostal}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.tipo.title"/>:
						</td>
						<td>
							${visitas.propiedades.tipo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.habitaciones.title"/>:
						</td>
						<td>
							${visitas.propiedades.habitaciones}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.renta.title"/>:
						</td>
						<td>
							${visitas.propiedades.renta}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVisitasPropiedades?visitas_numcliente=${visitas.numcliente}&visitas_fecha=${visitas.fecha}&visitas_numpropiedad=${visitas.numpropiedad}&propiedades_numpropiedad=${visitas.propiedades.numpropiedad}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVisitasPropiedades?visitas_numcliente=${visitas.numcliente}&visitas_fecha=${visitas.fecha}&visitas_numpropiedad=${visitas.numpropiedad}&related_propiedades_numpropiedad=${visitas.propiedades.numpropiedad}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${visitas.propiedades == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVisitasPropiedades?visitas_numcliente=${visitas.numcliente}&visitas_fecha=${visitas.fecha}&visitas_numpropiedad=${visitas.numpropiedad}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="propiedades.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="clientes.title"/></h1>
					
						<c:if test='${visitas.clientes != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="clientes.numcliente.title"/>:
						</td>
						<td>
							${visitas.clientes.numcliente}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="clientes.nombre.title"/>:
						</td>
						<td>
							${visitas.clientes.nombre}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="clientes.apellido.title"/>:
						</td>
						<td>
							${visitas.clientes.apellido}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="clientes.direccion.title"/>:
						</td>
						<td>
							${visitas.clientes.direccion}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editVisitasClientes?visitas_numcliente=${visitas.numcliente}&visitas_fecha=${visitas.fecha}&visitas_numpropiedad=${visitas.numpropiedad}&clientes_numcliente=${visitas.clientes.numcliente}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteVisitasClientes?visitas_numcliente=${visitas.numcliente}&visitas_fecha=${visitas.fecha}&visitas_numpropiedad=${visitas.numpropiedad}&related_clientes_numcliente=${visitas.clientes.numcliente}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${visitas.clientes == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVisitasClientes?visitas_numcliente=${visitas.numcliente}&visitas_fecha=${visitas.fecha}&visitas_numpropiedad=${visitas.numpropiedad}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="clientes.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>