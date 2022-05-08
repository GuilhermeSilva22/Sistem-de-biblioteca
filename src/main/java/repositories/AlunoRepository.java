package repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.AlunoModel;

public class AlunoRepository extends Repository {

    public AlunoRepository() throws SQLException, ClassNotFoundException {
        super();
    }

    public List<AlunoModel> BuscarTodos() throws SQLException, Exception {
        String sql = "select * from aluno";

        List<AlunoModel> alunos = new ArrayList();

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                AlunoModel aluno = new AlunoModel();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setEmail(rs.getString("email"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setTurno(rs.getString("turno"));
                alunos.add(aluno);
            }

            return alunos;
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }

    public void Cadastrar(AlunoModel aluno) throws SQLException, Exception {
        String sql = "INSERT into aluno (id, nome, cpf, email, telefone, turma, turno) values (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, aluno.getId());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getCpf());
            ps.setString(4, aluno.getEmail());
            ps.setString(5, aluno.getTelefone());
            ps.setString(6, aluno.getTurma());
            ps.setString(7, aluno.getTurno());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }

    public void Atualizar(AlunoModel aluno) throws SQLException, ClassNotFoundException, Exception {

        String sql = "UPDATE aluno"
                + "SET nome = ?, cpf = ?, email = ?, telefone = ?, turma = ?, turno = ?"
                + "WHERE ID = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps = conexao.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getCpf());
            ps.setString(3, aluno.getEmail());
            ps.setString(4, aluno.getTelefone());
            ps.setString(5, aluno.getTurma());
            ps.setString(6, aluno.getTurno());
            ps.setInt(6, aluno.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }

    public void Deletar(Integer id) throws SQLException, ClassNotFoundException, Exception {
        String sql = "DELETE from aluno WHERE id = ?";
        AlunoModel aluno = new AlunoModel();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, aluno.getId());
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }
}
