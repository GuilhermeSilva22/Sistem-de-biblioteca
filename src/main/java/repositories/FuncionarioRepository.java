package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.FuncionarioModel;
import view.LoginView;
import view.MenuView;

public class FuncionarioRepository extends Repository {

    public FuncionarioRepository() throws SQLException, ClassNotFoundException {
        super();
    }

    public List<FuncionarioModel> BuscarTodos() throws SQLException, Exception {
        String sql = "select * from funcionario";

        List<FuncionarioModel> funcionarios = new ArrayList();

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                FuncionarioModel funcionario = new FuncionarioModel();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setSenha(rs.getString("senha"));
                funcionarios.add(funcionario);
            }

            return funcionarios;
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }

    public void Cadastrar(FuncionarioModel funcionario) throws SQLException, Exception {

        String sql = "INSERT into funcionarios (nome, cpf, senha) values (?, ?, ?)";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCpf());
            ps.setString(3, funcionario.getSenha());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }

    public void Atualizar(FuncionarioModel funcionario) throws SQLException, ClassNotFoundException, Exception {

        String sql = "UPDATE funcionarios"
                + "SET nome = ?, cpf = ?, senha = ?"
                + "WHERE ID = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps = conexao.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCpf());
            ps.setString(3, funcionario.getSenha());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }

    public void Deletar(Integer id) throws SQLException, ClassNotFoundException, Exception {
        String sql = "DELETE from funcionario WHERE id = ?";
        FuncionarioModel funcionario = new FuncionarioModel();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, funcionario.getId());
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }

    public void Logar(FuncionarioModel funcionario, LoginView login) {
        try {
            Repository repository = new Repository();
            String sql = "select * from funcionarios where cpf = ? and senha = ?";
            PreparedStatement ps = repository.conexao.prepareStatement(sql);
            ps.setString(1, funcionario.getCpf());
            ps.setString(2, funcionario.getSenha());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                MenuView menu = new MenuView();
                login.setVisible(false);
                menu.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario e/ ou senha inválido(s)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
