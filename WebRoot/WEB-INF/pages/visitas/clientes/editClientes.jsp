<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.visitas-resources"/>
<html>
<head>
<title>Edit <fmt:message key="visitas.title"/> <fmt:message key="clientes.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="clientes.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectVisitas?numclienteKey=${visitas_numcliente}&fechaKey=${visitas_fecha}&numpropiedadKey=${visitas_numpropiedad}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveVisitasClientes" method="POST" modelAttribute="clientes">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="clientes.numcliente.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="clientes_numcliente" path="numcliente" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "clientes_numcliente",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="clientes.numcliente.help"/>"}})); </script>
								</c:when>
								<c:otherwise>
							${clientes.numcliente}
						&nbsp;
									<form:hidden id="clientes_numcliente" path="numcliente"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="clientes.nombre.title"/>:
						</td>
						<td>
							<form:input id="clientes_nombre" path="nombre" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "clientes_nombre",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="clientes.nombre.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="clientes.apellido.title"/>:
						</td>
						<td>
							<form:input id="clientes_apellido" path="apellido" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "clientes_apellido",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="clientes.apellido.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="clientes.direccion.title"/>:
						</td>
						<td>
							<form:input id="clientes_direccion" path="direccion" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "clientes_direccion",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="clientes.direccion.help"/>"}})); </script>
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
