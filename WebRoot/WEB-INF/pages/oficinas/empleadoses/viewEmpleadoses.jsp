<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.oficinas-resources"/>
<html>
<head>
<title>View <fmt:message key="oficinas.title"/> <fmt:message key="empleados.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="empleados.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectOficinas?numoficinaKey=${oficinas_numoficina}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
