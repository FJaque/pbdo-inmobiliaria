<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.visitas-resources"/>
<html>
<head>
<title>Edit <fmt:message key="visitas.title"/> <fmt:message key="propiedades.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="propiedades.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectVisitas?numclienteKey=${visitas_numcliente}&fechaKey=${visitas_fecha}&numpropiedadKey=${visitas_numpropiedad}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveVisitasPropiedades" method="POST" modelAttribute="propiedades">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.numpropiedad.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="propiedades_numpropiedad" path="numpropiedad" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "propiedades_numpropiedad",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="propiedades.numpropiedad.help"/>"}})); </script>
								</c:when>
								<c:otherwise>
							${propiedades.numpropiedad}
						&nbsp;
									<form:hidden id="propiedades_numpropiedad" path="numpropiedad"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.calle.title"/>:
						</td>
						<td>
							<form:input id="propiedades_calle" path="calle" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "propiedades_calle",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="propiedades.calle.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.ciudad.title"/>:
						</td>
						<td>
							<form:input id="propiedades_ciudad" path="ciudad" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "propiedades_ciudad",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="propiedades.ciudad.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.codigopostal.title"/>:
						</td>
						<td>
							<form:input id="propiedades_codigopostal" path="codigopostal" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "propiedades_codigopostal",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="propiedades.codigopostal.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.tipo.title"/>:
						</td>
						<td>
							<form:input id="propiedades_tipo" path="tipo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "propiedades_tipo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="propiedades.tipo.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.habitaciones.title"/>:
						</td>
						<td>
							<form:input id="propiedades_habitaciones" path="habitaciones" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "propiedades_habitaciones",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="propiedades.habitaciones.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="propiedades.renta.title"/>:
						</td>
						<td>
							<form:input id="propiedades_renta" path="renta" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "propiedades_renta",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="propiedades.renta.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="visitas_numcliente" value="${visitas_numcliente}" >
				<input type="hidden" name="visitas_fecha" value="${visitas_fecha}" >
				<input type="hidden" name="visitas_numpropiedad" value="${visitas_numpropiedad}" >
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
