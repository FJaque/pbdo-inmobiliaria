<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.arriendos-resources"/>
<html>
<head>
<title>List <fmt:message key="arriendos.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="arriendos.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newArriendos"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="arriendos.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="arriendos.numarriendo.title"/></th>
					<th class="thead"><fmt:message key="arriendos.renta.title"/></th>
					<th class="thead"><fmt:message key="arriendos.formapago.title"/></th>
					<th class="thead"><fmt:message key="arriendos.pagado.title"/></th>
					<th class="thead"><fmt:message key="arriendos.iniciorenta.title"/></th>
					<th class="thead"><fmt:message key="arriendos.finrenta.title"/></th>
					<th class="thead"><fmt:message key="arriendos.mespago.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${arriendoss}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectArriendos?numarriendoKey=${current.numarriendo}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editArriendos?numarriendoKey=${current.numarriendo}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteArriendos?numarriendoKey=${current.numarriendo}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.numarriendo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.renta}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.formapago}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.pagado}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.iniciorenta.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.finrenta.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="both" value="${current.mespago.time}"/>
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