<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.propiedades-resources"/>
<html>
<head>
<title>View <fmt:message key="propiedades.title"/> <fmt:message key="arriendos.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="arriendos.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectPropiedades?numpropiedadKey=${propiedades_numpropiedad}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
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
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
