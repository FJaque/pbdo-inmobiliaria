<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.clientes-resources"/>
<html>
<head>
<title>Edit <fmt:message key="clientes.title"/> <fmt:message key="visitas.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="visitas.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectClientes?numclienteKey=${clientes_numcliente}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveClientesVisitases" method="POST" modelAttribute="visitas">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="visitas.numcliente.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="visitas_numcliente" path="numcliente" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "visitas_numcliente",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="visitas.numcliente.help"/>"}})); </script>
								</c:when>
								<c:otherwise>
							${visitas.numcliente}
						&nbsp;
									<form:hidden id="visitas_numcliente" path="numcliente"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="visitas.fecha.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<input id="visitas_fecha" name="fecha" type="text" value="<fmt:formatDate value="${visitas.fecha.time}" pattern="MM/dd/yyyy h:mm a"/>" style="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "visitas_fecha",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="navigation.dateTime.title"/>"}})); </script>
								</c:when>
								<c:otherwise>
							<fmt:formatDate dateStyle="short" type="both" value="${visitas.fecha.time}"/>
						&nbsp;
									<form:hidden id="visitas_fecha" path="fecha"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="visitas.numpropiedad.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="visitas_numpropiedad" path="numpropiedad" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "visitas_numpropiedad",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="visitas.numpropiedad.help"/>"}})); </script>
								</c:when>
								<c:otherwise>
							${visitas.numpropiedad}
						&nbsp;
									<form:hidden id="visitas_numpropiedad" path="numpropiedad"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="visitas.comentario.title"/>:
						</td>
						<td>
							<form:input id="visitas_comentario" path="comentario" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "visitas_comentario",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="visitas.comentario.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
				<input type="hidden" name="clientes_numcliente" value="${clientes_numcliente}" >
				
				
				
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
