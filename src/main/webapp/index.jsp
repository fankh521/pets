<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table align='center' border='1' cellspacing='0'>
	<tr>
		<th>序号</th>
		<th>名字</th>
		<th>品种</th>
		<th>性别</th>
		<th>年龄</th>
	</tr>
	<c:forEach items="${us}" var="u" varStatus="st">
		<tr>
			<td>${u.id}</td>
			<td>${u.name}</td>
			<td>${u.breed}</td>
			<td>${u.sex}</td>
			<td>${u.age}</td>
		</tr>
	</c:forEach>
</table>