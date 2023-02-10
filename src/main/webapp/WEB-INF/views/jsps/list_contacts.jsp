<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts</title>
</head>
<body>
	<h2>ALL Contacts</h2>
	<a href="viewCreateLeadPage">new lead</a>

	<table>
		<tr>
			<th>firstName</th>
			<th>lastName</th>
			<th>email</th>
			<th>mobile</th>
			<th>Source</th>
			<th>Billing</th>
			
		</tr>
		<c:forEach var="contact" items="${contacts}">
			<tr>
				<td>${contact.firstName}</td>
				<td>${contact.lastName}</td>
				<td>${contact.email}</td>
				<td>${contact.mobile}</td>
				<td>${contact.source}</td>
				<td><a href="generateBill?id=${contact.id}">billing</a></td>
				
				





			</tr>
		</c:forEach>
	</table>
</body>
</html>