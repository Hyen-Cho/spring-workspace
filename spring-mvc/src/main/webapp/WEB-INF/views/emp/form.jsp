<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원정보 입력폼</title>
</head>
<body>
	<h1>직종 등록폼</h1>
	<form method="post" action="add.do">
		<p>아이디 : <input type="text" name="id" /></p>
		<p>성 : <input type="text" name="firstName" /></p>
		<p>이름 : <input type="text" name="lastName" /></p>
		<p>이름 : <input type="text" name="email" /></p>
		<p>이름 : <input type="text" name="phoneNumber" /></p>
		<p>이름 : <input type="text" name="hireDate" /></p>
		<p>이름 : <input type="number" name="jobId" /></p>
		<p>이름 : <input type="number" name="salary" /></p>
		<p>이름 : <input type="number" name="commissionPct" /></p>
		<p>이름 : <input type="number" name="managerId" /></p>
		<p>최대급여 : <input type="number" name="departmentId" /></p>
		<button type="submit">등록</button>
	</form>
</body>
</html>