import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Lancha p1 = new Lancha(1,"Antares");
//        Lancha p2 = new Lancha(2,"Zoro");
        LanchaDAO lanchaDAO = new LanchaDAO();
//        LanchaDAO.criarTabela();
//        LanchaDAO.inserir(p1);
//        LanchaDAO.inserir(p2);

        // Consultar todas as lanchas e exibir
        List<Lancha> todasLanchas = LanchaDAO.obterTodos();
        for (Lancha l : todasLanchas) {
            System.out.println(l);
        }

        // Consultar uma lancha pelo ID
        System.out.println("Consulta pelo id 1");
        Lancha lanchaId1 = LanchaDAO.obterPeloId(1);
        System.out.println(lanchaId1);

        // Atualizar o nome de uma lancha
        lanchaId1.setNome("Nova Antares");
        LanchaDAO.atualizar(lanchaId1);

        // Consultar todas as lanchas após a atualização
        System.out.println("Consulta de todas as lanchas após a atualização.");
        todasLanchas = LanchaDAO.obterTodos();
        for (Lancha l : todasLanchas) {
            System.out.println(l);
        }

        // Excluir uma lancha pelo ID
        LanchaDAO.deletar(1);

        // Consultar todas as lanchas após a exclusão
        System.out.println("Consulta de todas as lanchas após a exclusão.");
        todasLanchas = LanchaDAO.obterTodos();
        for (Lancha l : todasLanchas) {
            System.out.println(l);
        }
    }
}