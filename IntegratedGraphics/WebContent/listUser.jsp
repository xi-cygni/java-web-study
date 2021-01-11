<%@ include file="include/header.jsp" %>
<%@ page import="java.util.List" %>
<%@ page import="org.study.entity.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container mtb">
    <div class="row">
      <div class="col-lg-6">
		<strong>User list</strong>
		<hr/>
		<table border="1">
			<thead>
				<th>User ID</th>
				<th>Username</th>
				<th>Email</th>
				<th>Operation</th>
			</thead>
			
			<tbody>
				<c:forEach items="${listUsers}" var="user">
					<c:url var="updateURL" value="operation">
						<c:param name="page" value="updateuser"></c:param>
						<c:param name="userId" value="${user.id_users}"></c:param>
						<c:param name="username" value="${user.username}"></c:param>
						<c:param name="email" value="${user.email}"></c:param>
					</c:url>
			
					<c:url var="deleteURL" value="operation">
						<c:param name="page" value="deleteuser"></c:param>
						<c:param name="userId" value="${user.id_users}"></c:param>
					</c:url>
			
					<tr>
						<td>${user.id_users}</td>
						<td>${user.username}</td>
						<td>${user.email}</td>
					</tr>
					
					<td>
						<a href="${updateURL}">Update</a> |
						<a href="${deleteURL}"
						onclick="if(!confirm('Are you sure to delete this user?')) return false">Delete</a>
					</td>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
</div>

<%@ include file="include/footer.jsp" %>
