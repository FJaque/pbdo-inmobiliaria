<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.clientes-resources"/>
<html>
<head>
<title>View <fmt:message key="clientes.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="clientes.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexClientes"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="clientes.numcliente.title"/>:
						</td>
						<td>
							${clientes.numcliente}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="clientes.nombre.title"/>:
						</td>
						<td>
							${clientes.nombre}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="clientes.apellido.title"/>:
						</td>
						<td>
							${clientes.apellido}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="clientes.direccion.title"/>:
						</td>
						<td>
							${clientes.direccion}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="visitas.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newClientesVisitases?clientes_numcliente=${clientes.numcliente}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="visitas.title"/></span></a></div>
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
					<c:forEach items="${clientes.visitases}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectClientesVisitases?clientes_numcliente=${clientes.numcliente}&visitases_numcliente=${current.numcliente}&visitases_fecha=${current.fecha}&visitases_numpropiedad=${current.numpropiedad}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editClientesVisitases?clientes_numcliente=${clientes.numcliente}&visitases_numcliente=${current.numcliente}&visitases_fecha=${current.fecha}&visitases_numpropiedad=${current.numpropiedad}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteClientesVisitases?clientes_numcliente=${clientes.numcliente}&related_visitases_numcliente=${current.numcliente}&related_visitases_fecha=${current.fecha}&related_visitases_numpropiedad=${current.numpropiedad}&"><img src="images/icons/delete.gif" /></a>
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
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newClientesArriendoses?clientes_numcliente=${clientes.numcliente}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="arriendos.title"/></span></a></div>
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
					<c:forEach items="${clientes.arriendoses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectClientesArriendoses?clientes_numcliente=${clientes.numcliente}&arriendoses_numarriendo=${current.numarriendo}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editClientesArriendoses?clientes_numcliente=${clientes.numcliente}&arriendoses_numarriendo=${current.numarriendo}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteClientesArriendoses?clientes_numcliente=${clientes.numcliente}&related_arriendoses_numarriendo=${current.numarriendo}&"><img src="images/icons/delete.gif" /></a>
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