<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualizar Contatos - MIGRAR</title>
<link rel="stylesheet" href="styles/variables.css">
<link rel="stylesheet" href="styles/style.css">
<link rel="stylesheet" href="styles/form.css">
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
	
	<form id="UpdateForm" action="UpdateController" method="post" class="form">
		<h1 class="form-title" id="contato">Atualizar dados</h1>
		
		<label for="nome" class="form-label">ID: </label>
		<input type="text" id="id" name="id" required class="form-input" value="${contato.idContato}"/>
		
		<label For="nome" class="form-label"> Nome: </label> 
		<input type="text" id="nome" name="nome" required class="form-input" autoComplete="name" value="${contato.nomeContato}" />
		 
		<label For="email" class="form-label"> E-mail: </label> 
		<input type="email" id="email" name="email" required class="form-input" autoComplete="email" value="${contato.emailContato}" />
		 
		<label For="telefone" class="form-label"> Telefone: </label> 
		<input type="tel" id="telefone" name="telefone" class="form-input" autoComplete="tel" value="${contato.telefoneContato}" />

		<button type="submit" class="form-button">Atualizar</button>
	</form>
	
	<footer class="footer">
		<p 
			class="footer-text"> Projeto desenvolvido por <a href="https://github.com/JoiltonSantos"
			target="_blank" rel="noopener noreferrer" class="footer-text-link"> Joilton R. Santos </a>
		</p>
	</footer>
	<script src="js/navbar.js"></script>
</body>
</html>