import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Lancha p1 = new Lancha(1,"Antares");
        Lancha p2 = new Lancha(2,"Zoro");
        LanchaDAO lanchaDAO = new LanchaDAO();
        LanchaDAO.criarTabela();
        LanchaDAO.inserir(p1);
        LanchaDAO.inserir(p2);

        for(Lancha p : lanchaDAO.obterTodos()){
            System.out.println(p);
        }
        System.out.println("Consulta pelo id 1");
        Lancha id1 = lanchaDAO.obterPeloId(1);
        System.out.println(id1);
        System.out.println("Consulta pelo id 6");
        Lancha id10 = lanchaDAO.obterPeloId(6);
        System.out.println(id10);
        id1.setNome("Antares");
        lanchaDAO.atualizar(id1);
        System.out.println("Consulta de todas as Lanchas.");
        for(Lancha p : lanchaDAO.obterTodos()){
            System.out.println(p);
        }
    }
}