<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.empleados-resources"/>
<html>
<head>
<title>View <fmt:message key="empleados.title"/> <fmt:message key="oficinas.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="oficinas.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectEmpleados?numempleadoKey=${empleados_numempleado}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
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
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteEmpleadosOficinas?empleados_numempleado=${empleados_numempleado}&related_oficinas_numoficina=${oficinas.numoficina}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
