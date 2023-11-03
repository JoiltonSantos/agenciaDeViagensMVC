<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contato - MIGRAR</title>
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
				<a href="#" class="navbar-list-item-link"> CONTATO </a>
			</li>
		</ul>
	</nav>

	<form id="contactForm" action="CreateController" method="post" class="form">
		<h1 class="form-title" id="contato">Fale conosco</h1>
		
		<label For="nome" class="form-label"> Nome: </label> 
		<input type="text" id="nome" name="nome" required class="form-input" autoComplete="name" />
		 
		<label For="email" class="form-label"> E-mail: </label> 
		<input type="email" id="email" name="email" required class="form-input" autoComplete="email" />
		 
		<label For="telefone" class="form-label"> Telefone: </label> 
		<input type="tel" id="telefone" name="telefone" class="form-input" autoComplete="tel" />
		
		<label For="mensagem" class="form-label"> Mensagem: </label>
		<textarea id="mensagem" name="mensagem" rows="4" required class="form-message"></textarea>

		<button type="submit" class="form-button">Enviar</button>
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