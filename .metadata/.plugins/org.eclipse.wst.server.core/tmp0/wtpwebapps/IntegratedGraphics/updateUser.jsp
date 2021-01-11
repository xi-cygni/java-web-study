<%@ include file="include/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="container mtb">
    <div class="row">
        <div class="col-lg-6">
		<form action="${pageContext.request.contextPath}/operation" method="post">
		Username: <input type="text" name="username" value="${param.username}" required="required"/><br/><br/>
		E-mail: <input type="email" name="email" value="${param.email}" required="required"/><br/><br/>
		<input type="hidden" name="id" value="${param.userId}"/>
		<input type="hidden" name="form" value="updateuseroperation"/>
		<input type="submit" value="Update User"/>
		</form>
		</div>
	</div>
</div>

<%@ include file="include/footer.jsp" %>