<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:import url="/include/header.jsp">
<c:param name="title" value="Example title"></c:param>
</c:import>

<c:set var="name" value="hehe"></c:set>
<c:out value="This is a basic string"></c:out><br/>
<c:out value="${name}"></c:out><br/>

<jsp:useBean id="user" class="com.study.beans.User" scope="page"></jsp:useBean>
${user.getFirstName()}
<!-- we can access variables directly too -->
<br/>
<c:if test="${param.name == 'aga'}">
	Hello Aga!
</c:if>

<!-- we dont have else :(( -->

<c:choose>
	<c:when test="${param.lang == 'Java' }"> Learning Java! </c:when>
	<c:when test="${param.lang == 'Python' }"> Learning Python! </c:when>
	<c:when test="${param.lang == 'SQL' }"> Learning SQL! </c:when>
	<c:otherwise> Learning sth! </c:otherwise>
</c:choose>

<br/>

<c:forEach var="i" begin="0" end="10" step="2"> 
	${i}
</c:forEach>

<%
 String[] names = {"Wojtek", "Aga", "Adolf"};
String URL = "www.ziemniaki.org";
%>

<c:forEach items="<%=names%>" var="name">
${name}
</c:forEach>

<br/>
<c:forTokens items="www.studyeasy.org" delims="." var="temp">
${temp}
</c:forTokens>

<br/>
<c:forTokens items="<%=URL%>" delims="." var="temp">
${temp}
</c:forTokens>

<!--  generates link for gthe page-->
<a href="<c:url value="/AnotherPage.jsp"/>">Another Page</a><br/>

<!-- Auto redirects to google -->
<!-- <a href="<c:redirect url="http://google.com"/>">Google</a> -->

<c:catch var="ex1">
<% int x = 10/0; %>
</c:catch>

${ex1 }
${ex1.message }
<c:import url="/include/footer.jsp"></c:import>