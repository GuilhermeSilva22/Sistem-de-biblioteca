package repositories;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.AlunoModel;
import model.EmprestimoModel;

public class EmprestimoRepository extends Repository {

    public EmprestimoRepository() throws SQLException, ClassNotFoundException {
        super();
    }

    public List<EmprestimoModel> BuscarTodos() throws SQLException, Exception {
        String sql = "select * from aluno";

        List<EmprestimoModel> emprestimos = new ArrayList();

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                EmprestimoModel emprestimo = new EmprestimoModel();
                emprestimo.setId(rs.getInt("id"));
                emprestimo.setDataEmprestimo(rs.getDate("data_emprestimo"));
                emprestimo.setDataEmprestimo(rs.getDate("data_vencimento"));
            }

            return emprestimos;
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }
    
    public void Cadastrar(EmprestimoModel emprestimo) throws SQLException, Exception {
        String sql = "INSERT into emprestimos (id, data_emprestimo, data_vencimento) values (?, ?, ?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, emprestimo.getId());
            ps.setDate(2, (Date) emprestimo.getDataEmprestimo());
            ps.setDate(3, (Date) emprestimo.getDataVencimento());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }
    public void Atualizar(AlunoModel aluno) throws SQLException, ClassNotFoundException, Exception {

        String sql = "UPDATE emprestimo"
                + "SET data_emprestimo = ?, data_vencimento = ?"
                + "WHERE ID = ?";
        try {
            EmprestimoModel emprestimo = new EmprestimoModel();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps = conexao.prepareStatement(sql);
            ps.setDate(1, (Date) emprestimo.getDataEmprestimo());
            ps.setDate(2, (Date) emprestimo.getDataVencimento());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }
    public void Deletar(Integer id) throws SQLException, ClassNotFoundException, Exception {
        String sql = "DELETE from emprestimo WHERE id = ?";
        EmprestimoModel emprestimo = new EmprestimoModel();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, emprestimo.getId());
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new Exception(ex.getMessage());
        } finally {
            conexao.close();
        }
    }
}
