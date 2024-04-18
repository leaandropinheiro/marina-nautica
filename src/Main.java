import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Lancha p1 = new Lancha(0,"Tom cruise");
        Lancha p2 = new Lancha(0,"The Rocky");
        LanchaDAO lanchaDAO = new LanchaDAO();
        // UUID
        //LanchaDAO.criarTabela();
        //LanchaDAO.inserir(p1);
        //LanchaDAO.inserir(p2);
        for(Lancha p : lanchaDAO.obterTodos()){
            System.out.println(p);
        }
        System.out.println("Consulta pelo id 1");
        Lancha id1 = lanchaDAO.obterPeloId(1);
        System.out.println(id1);
        System.out.println("Consulta pelo id 10");
        Lancha id10 = lanchaDAO.obterPeloId(10);
        System.out.println(id10);
        id1.setNome("Pedro Pascal");
        lanchaDAO.atualizar(id1);
        System.out.println("Consulta de todas as Lanchas.");
        for(Lancha p : lanchaDAO.obterTodos()){
            System.out.println(p);
        }
    }
}