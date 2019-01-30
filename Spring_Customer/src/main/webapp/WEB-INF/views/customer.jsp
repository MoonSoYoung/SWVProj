<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<table>
		<thead>
			<tr>
				<th>고객이름</th>
				<th>차량번호</th>
				<th>차량종류</th>
				<th>전화번호</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${customerList}" var="customer">
				<tr>
					<td>${customer.customer_name}</td>
					<td>${customer.carnum}</td>
					<td>${customer.carcat}</td>
					<td>${customer.phonenum}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>
