<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<c:url var="actionAdicionar" value="/filmes/adicionar"></c:url>

<form:form cssClass="col-lg-6" action="${actionAdicionar}" method="post"
	modelAttribute="filme">

	<div class="form-group">
		<label for="nome">Nome:</label>
		<form:input path="nome" cssClass="form-control" />
		<form:errors path="nome" cssStyle="color: red"></form:errors>
	</div>

	<div class="form-group">
		<label for="genero">Gênero:</label>
		<form:input path="genero" cssClass="form-control" />
		<form:errors path="genero" cssStyle="color: red"></form:errors>
	</div>

	<button class="btn btn-primary" type="submit">Salvar</button>
</form:form>