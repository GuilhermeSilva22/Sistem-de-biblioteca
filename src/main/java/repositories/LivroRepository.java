package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.LivroModel;

public class LivroRepository extends Repository {

    public LivroRepository() throws SQLException, ClassNotFoundException {
        super();
    }

    public List<LivroModel> BuscarTodos() throws SQLException, Exception {
        String sql = "select * from livros";

        List<LivroModel> livros = new ArrayList();

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                LivroModel livro = new LivroModel();
                livro.setTitulo(rs.getString("titulo"));
                livro.setQuantidade(rs.getInt("quantidade"));
                livro.setEstante(rs.getString("estante"));
                livro.setPrateleira(rs.getString("prateleira"));
                livros.add(livro);
            }
            return livros;
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }

    }

    public void Cadastrar(LivroModel livro) throws SQLException, Exception {
        String sql = "INSERT into livros (titulo, quantidade, estante, prateleira) values (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, livro.getTitulo());
            ps.setInt(2, livro.getQuantidade());
            ps.setString(3, livro.getEstante());
            ps.setString(4, livro.getPrateleira());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }

    public void Atualizar(LivroModel livro) throws SQLException, ClassNotFoundException, Exception {

        String sql = "UPDATE livro"
                + "SET titulo = ?, quantidade = ?, estante = ?, prateleira = ?"
                + "WHERE ID = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps = conexao.prepareStatement(sql);
            ps.setString(1, livro.getTitulo());
            ps.setInt(2, livro.getQuantidade());
            ps.setString(3, livro.getEstante());
            ps.setString(4, livro.getPrateleira());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }

    public void Deletar(LivroModel livro) throws SQLException, ClassNotFoundException, Exception {
        String sql = "DELETE FROM livros WHERE titulo = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, livro.getTitulo());
            ps.execute();
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }

}
