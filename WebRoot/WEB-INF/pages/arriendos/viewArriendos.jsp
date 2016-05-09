<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.arriendos-resources"/>
<html>
<head>
<title>View <fmt:message key="arriendos.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="arriendos.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexArriendos"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arriendos.numarriendo.title"/>:
						</td>
						<td>
							${arriendos.numarriendo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arriendos.renta.title"/>:
						</td>
						<td>
							${arriendos.renta}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arriendos.formapago.title"/>:
						</td>
						<td>
							${arriendos.formapago}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arriendos.pagado.title"/>:
						</td>
						<td>
							${arriendos.pagado}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arriendos.iniciorenta.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${arriendos.iniciorenta.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arriendos.finrenta.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${arriendos.finrenta.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="arriendos.mespago.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${arriendos.mespago.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="propiedades.title"/></h1>
					
						<c:if test='${arriendos.propiedades != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.numpropiedad.title"/>:
						</td>
						<td>
							${arriendos.propiedades.numpropiedad}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.calle.title"/>:
						</td>
						<td>
							${arriendos.propiedades.calle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.ciudad.title"/>:
						</td>
						<td>
							${arriendos.propiedades.ciudad}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.codigopostal.title"/>:
						</td>
						<td>
							${arriendos.propiedades.codigopostal}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.tipo.title"/>:
						</td>
						<td>
							${arriendos.propiedades.tipo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.habitaciones.title"/>:
						</td>
						<td>
							${arriendos.propiedades.habitaciones}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="propiedades.renta.title"/>:
						</td>
						<td>
							${arriendos.propiedades.renta}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editArriendosPropiedades?arriendos_numarriendo=${arriendos.numarriendo}&propiedades_numpropiedad=${arriendos.propiedades.numpropiedad}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteArriendosPropiedades?arriendos_numarriendo=${arriendos.numarriendo}&related_propiedades_numpropiedad=${arriendos.propiedades.numpropiedad}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${arriendos.propiedades == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newArriendosPropiedades?arriendos_numarriendo=${arriendos.numarriendo}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="propiedades.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="clientes.title"/></h1>
					
						<c:if test='${arriendos.clientes != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="clientes.numcliente.title"/>:
						</td>
						<td>
							${arriendos.clientes.numcliente}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="clientes.nombre.title"/>:
						</td>
						<td>
							${arriendos.clientes.nombre}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="clientes.apellido.title"/>:
						</td>
						<td>
							${arriendos.clientes.apellido}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="clientes.direccion.title"/>:
						</td>
						<td>
							${arriendos.clientes.direccion}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editArriendosClientes?arriendos_numarriendo=${arriendos.numarriendo}&clientes_numcliente=${arriendos.clientes.numcliente}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteArriendosClientes?arriendos_numarriendo=${arriendos.numarriendo}&related_clientes_numcliente=${arriendos.clientes.numcliente}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${arriendos.clientes == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newArriendosClientes?arriendos_numarriendo=${arriendos.numarriendo}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="clientes.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>