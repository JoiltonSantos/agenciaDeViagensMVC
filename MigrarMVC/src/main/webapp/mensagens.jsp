<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mensagens - MIGRAR</title>
<link rel="stylesheet" href="styles/variables.css">
<link rel="stylesheet" href="styles/style.css">
<link rel="stylesheet" href="styles/mensagens.css">
</head>
<body>
	<nav class="navbar">
		<span class="material-symbols-outlined"> menu </span>
		<ul class="navbar-list">
			<li class="navbar-list-item">
				<img class="navbar-list-item-logo" src="./images/logo_hd.png" alt="logo" />
			</li>
			<li class="navbar-list-item">
				<a href="index.html" class="navbar-list-item-link"> HOME </a>
			</li>
			<li class="navbar-list-item">
				<a href="#" class="navbar-list-item-link"> DESTINO </a>
			</li>
			<li class="navbar-list-item">
				<a href="#" class="navbar-list-item-link"> PROMOCAO </a>			
			</li>
			<li class="navbar-list-item">
				<a href="contato.jsp" class="navbar-list-item-link"> CONTATO </a>
			</li>
		</ul>
	</nav>
	
	<h1 class="title">Lista de Mensagens</h1>
	<div class="container">
	<a href="./contato.jsp" class="button center">Criar novo</a>
	<hr/>
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Email</th>
					<th>Telefone</th>
					<th>Mensagem</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${contatos}" var="contato">
					<tr>
						<td class="tupla">${contato.idContato}</td>
						<td class="tupla">${contato.nomeContato}</td>
						<td class="tupla">${contato.emailContato}</td>
						<td class="tupla">${contato.telefoneContato}</td>
						<td class="tupla">${contato.mensagemContato}</td>
						<td class="tupla tupla-button">
							<a href="UpdateController?id=${contato.idContato}" class="button">Editar</a>
							<a href="DeleteController?id=${contato.idContato}"
							class="button button-custom">Excluir</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<footer class="footer">
		<p 
			class="footer-text"> Projeto desenvolvido por <a href="https://github.com/JoiltonSantos"
			target="_blank" rel="noopener noreferrer" class="footer-text-link"> Joilton R. Santos </a>
		</p>
	</footer>
	<script src="js/navbar.js"></script>
</body>
</html>