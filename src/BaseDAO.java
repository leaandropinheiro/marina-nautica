import java.sql.Connection;

public class BaseDAO {

    protected static Connection conexao(){
        return MarinaConexao.obterInstancia().conexao();
    }

}
