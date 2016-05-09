<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.oficinas-resources"/>
<html>
<head>
<title>View <fmt:message key="oficinas.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="oficinas.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexOficinas"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="oficinas.numoficina.title"/>:
						</td>
						<td>
							${oficinas.numoficina}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="oficinas.calle.title"/>:
						</td>
						<td>
							${oficinas.calle}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="oficinas.ciudad.title"/>:
						</td>
						<td>
							${oficinas.ciudad}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="oficinas.codigopostal.title"/>:
						</td>
						<td>
							${oficinas.codigopostal}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="empleados.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newOficinasEmpleadoses?oficinas_numoficina=${oficinas.numoficina}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="empleados.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="empleados.numempleado.title"/></th>
						<th class="thead"><fmt:message key="empleados.nombre.title"/></th>
						<th class="thead"><fmt:message key="empleados.apellido.title"/></th>
						<th class="thead"><fmt:message key="empleados.cargo.title"/></th>
						<th class="thead"><fmt:message key="empleados.sexo.title"/></th>
						<th class="thead"><fmt:message key="empleados.fechanac.title"/></th>
						<th class="thead"><fmt:message key="empleados.salario.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${oficinas.empleadoses}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectOficinasEmpleadoses?oficinas_numoficina=${oficinas.numoficina}&empleadoses_numempleado=${current.numempleado}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editOficinasEmpleadoses?oficinas_numoficina=${oficinas.numoficina}&empleadoses_numempleado=${current.numempleado}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteOficinasEmpleadoses?oficinas_numoficina=${oficinas.numoficina}&related_empleadoses_numempleado=${current.numempleado}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.numempleado}
						&nbsp;
						</td>
						<td>
							${current.nombre}
						&nbsp;
						</td>
						<td>
							${current.apellido}
						&nbsp;
						</td>
						<td>
							${current.cargo}
						&nbsp;
						</td>
						<td>
							${current.sexo}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="both" value="${current.fechanac.time}"/>
						&nbsp;
						</td>
						<td>
							${current.salario}
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