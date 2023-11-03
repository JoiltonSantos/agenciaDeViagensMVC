package com.migrar.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.migrar.dao.ContatoDAO;
import com.migrar.model.Contato;

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		try {
			ContatoDAO contatoDAO = new ContatoDAO();
			Contato contato = contatoDAO.listarContatos(id);

			request.setAttribute("contato", contato);

			RequestDispatcher rd = request.getRequestDispatcher("atualizar.jsp");
			rd.forward(request, response);

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Contato contato = new Contato();
			contato.setIdContato(Integer.parseInt(request.getParameter("id")));
			contato.setNomeContato(request.getParameter("nome"));
			contato.setEmailContato(request.getParameter("email"));
			contato.setTelefoneContato(request.getParameter("telefone"));

			ContatoDAO contatoDAO = new ContatoDAO();
			contatoDAO.atualizarContato(contato);

			response.sendRedirect("ReadController");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
