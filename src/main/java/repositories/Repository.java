package repositories;

import context.Context;
import java.sql.Connection;
import java.sql.SQLException;

public class Repository {

    public Connection conexao;

    public Repository() throws SQLException, ClassNotFoundException {
        this.conexao = Context.getConexao();
    }

}
