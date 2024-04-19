import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LanchaDAO extends BaseDAO{

    private final static String CRIAR_TABELA = """
            create table  IF NOT EXISTS Lancha(
                                 id INTEGER PRIMARY KEY
                                ,nome text);
            """;

    public static void criarTabela(){
        try(var con = conexao();
            var stat = con.createStatement()){
            stat.execute(CRIAR_TABELA);
        }catch (SQLException e){
            System.out.println("Erro ao criar tabela.");
            e.printStackTrace();
        }
    }

    public static void inserir(Lancha p){
        String inserir = """
                    insert into Lancha(nome) values(?);
                    """;
        try(var con = conexao();
            var stat = con.prepareStatement(inserir)){
            stat.setString(1,p.getNome());
            stat.execute();
        }catch (SQLException e){
            System.out.println("Erro ao inserir tabela.");
            e.printStackTrace();
        }
    }

    public static void atualizar(Lancha p){
        String sql = """
                    update Lancha set nome = ? where id = ?;
                    """;
        try(var con = conexao();
            var stat = con.prepareStatement(sql)){
            stat.setString(1,p.getNome());
            stat.setLong(2,p.getId());
            stat.execute();
        }catch (SQLException e){
            System.out.println("Erro ao atualizar Lancha.");
            e.printStackTrace();
        }
    }

    public static void deletar(long id){
        String sql = """
                    delete Lancha where id = 0;
                    """;
        try(var con = conexao();
            var stat = con.prepareStatement(sql)){
            stat.setLong(1,id);
            stat.execute();
        }catch (SQLException e){
            System.out.println("Erro ao excluir Lancha.");
            e.printStackTrace();
        }
    }

    public static List<Lancha> obterTodos(){
        List<Lancha> lista = new ArrayList<>();
        String sql = """
                    select id, nome from Lancha;
                    """;
        try(var con = conexao();
            var stat = con.prepareStatement(sql)){
            ResultSet rs = stat.executeQuery();
            // Navege para o proximo registro.
            while(rs.next()){
                Lancha p = new Lancha();
                p.setId(rs.getLong("id"));
                p.setNome(rs.getString("nome"));
                lista.add(p);
            }
        }catch (SQLException e){
            System.out.println("Erro ao consultar todas as Lanchas.");
            e.printStackTrace();
        }
        return lista;
    }

    public static Lancha obterPeloId(long id){
        Lancha p = null;
        String sql = """
                    select id, nome from Lancha where id = ?;
                    """;
        try(var con = conexao();
            var stat = con.prepareStatement(sql)){
            stat.setLong(1,id);
            ResultSet rs = stat.executeQuery();
            // Navege para o proximo registro.
            if(rs.next()){
                p = new Lancha();
                p.setId(rs.getLong("id"));
                p.setNome(rs.getString("nome"));
            }
        }catch (SQLException e){
            System.out.println("Erro ao consultar Lancha pelo id.");
            e.printStackTrace();
        }
        return p;
    }

}
