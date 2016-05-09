<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.clientes-resources"/>
<html>
<head>
<title>View <fmt:message key="clientes.title"/> <fmt:message key="visitas.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="visitas.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectClientes?numclienteKey=${clientes_numcliente}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
