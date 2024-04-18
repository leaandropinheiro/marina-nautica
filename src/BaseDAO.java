import java.sql.Connection;

public class BaseDAO {

    protected Connection conexao(){
        return MarinaConexao.obterInstancia().conexao();
    }

}
