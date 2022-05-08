package context;

import java.sql.Connection;
import java.sql.DriverManager;
public class Context {

    public static Connection getConexao() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca?serverTimezone=UTC",
                    "Guilherme",
                    "teamovida22."
            );
            System.out.println("Conectado!");
            return conn;
        } catch (Exception e) {
            System.out.println("Erro ao conectar" + e.getMessage());
            return null;
        }
    }
}
