import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MarinaConexao {
    private static MarinaConexao instancia;

    private MarinaConexao() {

    }

    public synchronized static MarinaConexao obterInstancia() {
        if (instancia == null) {
            instancia = new MarinaConexao();
        }
        return instancia;
    }

    public Connection conexao() {
        Connection c = null;
        try{
            c = DriverManager.getConnection("jdbc:sqlite:meu_banco.sql");
        }catch(SQLException e){
            new RuntimeException("Erro ao conectar ao banco de dados");
        }
        return c;
    }
}
