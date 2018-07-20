<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<h2>Adicionar novo filme</h2>

	<c:url var="actionAdicionar" value="/filmes/adicionar"></c:url>

	<form:form action="${actionAdicionar}" method="post"
		modelAttribute="filme">
		
		<label>Nome:</label>
		<form:input path="nome" />
		<form:errors path="nome"></form:errors>
		
		<br/>
		
		<label>Gênero:</label>
		<form:input path="genero" />
		<form:errors path="genero"></form:errors>
		
		<br/>
		
		<input type="submit" value="Enviar" />
		
	</form:form>
</body>
</html>