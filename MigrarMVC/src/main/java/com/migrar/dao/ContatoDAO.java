package com.migrar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.migrar.database.DatabaseConnection;
import com.migrar.model.Contato;
import com.migrar.utils.Colors;

public class ContatoDAO {
    private Connection connection;
    private String sql;

    public ContatoDAO() throws SQLException {
        connection = DatabaseConnection.createConnection();
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void criarContato(Contato contato) {

        sql = "INSERT INTO contato (nomeContato, emailContato, telefoneContato, mensagemContato) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, contato.getNomeContato());
            stmt.setString(2, contato.getEmailContato());
            stmt.setString(3, contato.getTelefoneContato());
            stmt.setString(4, contato.getMensagemContato());
            stmt.executeUpdate();
            System.out.println(Colors.GREEN.get() + "Contato criado com sucesso!" + Colors.GREEN.get());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Contato listarContatos(int idContato) {
        Contato contato = null;
        sql = "SELECT * FROM contato WHERE idContato = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, idContato);
            ResultSet r = stmt.executeQuery();
            if (r.next()) {
                contato = new Contato();
                contato.setIdContato(r.getInt("idContato"));
                contato.setNomeContato(r.getString("nomeContato"));
                contato.setEmailContato(r.getString("emailContato"));
                contato.setTelefoneContato(r.getString("telefoneContato"));
                contato.setMensagemContato(r.getString("mensagemContato"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return contato;
    }

    public List<Contato> listarMensagens() {
        String sql = "SELECT * FROM contato";
        List<Contato> contatos = new ArrayList<Contato>();

        ResultSet r = null;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            r = stmt.executeQuery();

            while (r.next()) {
                Contato contato = new Contato();
                contato.setIdContato(r.getInt("idContato"));
                contato.setNomeContato(r.getString("nomeContato"));
                contato.setEmailContato(r.getString("emailContato"));
                contato.setTelefoneContato(r.getString("telefoneContato"));
                contato.setMensagemContato(r.getString("mensagemContato"));

                contatos.add(contato);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contatos;
    }

    public void atualizarContato(Contato contato) {
        sql = "UPDATE contato SET nomeContato = ?, emailContato = ?, telefoneContato = ? WHERE idContato = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, contato.getNomeContato());
            stmt.setString(2, contato.getEmailContato());
            stmt.setString(3, contato.getTelefoneContato());
            stmt.setLong(4, contato.getIdContato());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deletarContato(int idContato) {
        sql = "DELETE FROM contato WHERE idContato = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, idContato);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
