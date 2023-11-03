package com.migrar.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.migrar.dao.ContatoDAO;
import com.migrar.model.Contato;


@WebServlet("/CreateController")
public class CreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Contato contato = new Contato();
		contato.setNomeContato(request.getParameter("nome"));
		contato.setEmailContato(request.getParameter("email"));
		contato.setTelefoneContato(request.getParameter("telefone"));
		contato.setMensagemContato(request.getParameter("mensagem"));
		
		try {
			ContatoDAO contatoDAO = new ContatoDAO();
			contatoDAO.criarContato(contato);
			response.sendRedirect("ReadController");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
