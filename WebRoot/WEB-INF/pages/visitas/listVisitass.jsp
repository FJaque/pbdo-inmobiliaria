<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.visitas-resources"/>
<html>
<head>
<title>List <fmt:message key="visitas.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="visitas.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newVisitas"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="visitas.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
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
				<c:forEach items="${visitass}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectVisitas?numclienteKey=${current.numcliente}&fechaKey=${current.fecha}&numpropiedadKey=${current.numpropiedad}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editVisitas?numclienteKey=${current.numcliente}&fechaKey=${current.fecha}&numpropiedadKey=${current.numpropiedad}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteVisitas?numclienteKey=${current.numcliente}&fechaKey=${current.fecha}&numpropiedadKey=${current.numpropiedad}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.numcliente}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.fecha.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.numpropiedad}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.comentario}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>