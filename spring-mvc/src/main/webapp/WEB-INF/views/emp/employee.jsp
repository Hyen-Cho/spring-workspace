<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원의 상세정보</title>
</head>
<body>
	<h1>사원의 상세정보</h1>
	
	<ul>
		<li>${employee.id } ${employee.firstName } ${employee.lastName } ${employee.email } ${employee.phoneNumber } ${employee.hireDate } ${employee.jobId } ${employee.salary } ${employee.commissionPct } ${employee.managerId } ${employee.departmentId }</li>
	</ul>
	
	<div>
		<p><a href="form.do">새로운 사원 등록</a></p>
	</div>
</body>
</html>