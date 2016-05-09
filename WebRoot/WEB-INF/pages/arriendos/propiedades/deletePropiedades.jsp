<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.arriendos-resources"/>
<html>
<head>
<title>View <fmt:message key="arriendos.title"/> <fmt:message key="propiedades.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="propiedades.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectArriendos?numarriendoKey=${arriendos_numarriendo}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
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
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteArriendosPropiedades?arriendos_numarriendo=${arriendos_numarriendo}&related_propiedades_numpropiedad=${propiedades.numpropiedad}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
