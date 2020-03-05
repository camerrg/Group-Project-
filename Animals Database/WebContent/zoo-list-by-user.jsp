<%@ page language="java" contentType="text/html; charset=UTF
-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF
-
8">
<title>Zoo List </title>
</head>
<body>
	<form method="post" action="listItemDeleteServlet">
		<table>
			<c:forEach items="${requestScope.allLocations}" var="currentlist">
				<tr>
					<td><input type="radio" name="id" value="${currentlist.id}"></td>
					<td><h2>${currentlist.listName}</h2></td>
				</tr>
				<tr>
					<td colspan="3">Date: ${currentlist.tripDate}</td>
				</tr>
			  <tr>
					<td colspan="3">Animal: ${currentlist.animal.animal}</td>
				</tr>
				<c:forEach var="listVal" items="${currentlist.listOfItems}">
					<tr>
						<td></td>
						<td colspan="3">${listVal.animal},${listVal.location}</td>
					</tr>


				</c:forEach>
			</c:forEach>
		</table>
		<input  
			type="submit" value="delete" name="doThisToItem"> <input
			type="submit" value="add" name="doThisToItem">
	</form>
	<a href="addItemsForListServlet">Create a new List</a>
	<a href="index.html">Insert a new item</a>
</body>
</html>