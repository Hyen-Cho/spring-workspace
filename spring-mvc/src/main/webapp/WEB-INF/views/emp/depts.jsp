<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>모든 부서정보</title>
</head>
<body>
	<h1>모든 부서정보</h1>
	
	<ul>
	<c:forEach var="department" items="${departments}">
		<li><a href="employees.do?deptid=${department.id }">${department.id } ${department.name } ${department.managerId } ${department.locationId}</a></li>
	</c:forEach>
	</ul>
</body>
</html>