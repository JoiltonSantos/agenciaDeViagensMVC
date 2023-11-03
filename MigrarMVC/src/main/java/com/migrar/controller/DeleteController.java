package com.migrar.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.migrar.dao.ContatoDAO;


@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		try {
			ContatoDAO contatoDAO = new ContatoDAO();
			contatoDAO.deletarContato(id);
			
			response.sendRedirect("ReadController");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}


}
