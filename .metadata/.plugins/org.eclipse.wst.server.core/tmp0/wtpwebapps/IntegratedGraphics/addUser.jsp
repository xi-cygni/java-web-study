<%@ include file="include/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="container mtb">
    <div class="row">
        <div class="col-lg-6">
		<form action="${pageContext.request.contextPath}/operation" method="post">
		Username: <input type="text" name="username" required="required"/><br/><br/>
		E-mail: <input type="email" name="email" required="required"/><br/><br/>
		<input type="hidden" name="form" value="adduseroperation"/>
		<input type="submit" value="Add User"/>
		</form>
		</div>
	</div>
</div>

<%@ include file="include/footer.jsp" %>
