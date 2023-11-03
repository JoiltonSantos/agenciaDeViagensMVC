package com.migrar.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.migrar.dao.ContatoDAO;
import com.migrar.model.Contato;


@WebServlet("/ReadController")
public class ReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ContatoDAO contatoDAO = new ContatoDAO();
			List<Contato> contatos = contatoDAO.listarMensagens();
			request.setAttribute("contatos", contatos);
			
			RequestDispatcher rd = request.getRequestDispatcher("mensagens.jsp");
			rd.forward(request, response);

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
