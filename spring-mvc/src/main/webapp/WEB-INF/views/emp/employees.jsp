<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>특정 부서에 소속된 사원 명단</title>
</head>
<body>
	<h1>특정 부서에 소속된 사원 명단</h1>
	
	<ul>
	<c:forEach var="employee" items="${employees }">
		<li> <a href="employee.do?empid=${employee.id }">${employee.id } ${employee.firstName } ${employee.lastName } ${employee.departmentId }</a> </li>
	</c:forEach>
	</ul>
</body>
</html>