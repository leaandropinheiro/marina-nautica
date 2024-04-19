import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Lancha p2 = new Lancha(2,"Zoro");
//        Lancha p1 = new Lancha(1,"Antares");
        LanchaDAO lanchaDAO = new LanchaDAO();
        LanchaDAO.criarTabela();
//        LanchaDAO.inserir(p1);
//        LanchaDAO.inserir(p2);

        List<Lancha> todasLanchas = LanchaDAO.obterTodos();
        for (Lancha l : todasLanchas) {
            System.out.println(l);
        }

        System.out.println("\nConsulta pelo id 1");

        Lancha lanchaId1 = LanchaDAO.obterPeloId(1);
        System.out.println(lanchaId1);

//        lanchaId1.setNome("bomba");
//        LanchaDAO.atualizar(lanchaId1);

        lanchaId1.setMotor("MWM");
        LanchaDAO.atualizar(lanchaId1);

        System.out.println("\nConsulta de todas as lanchas após a atualização.");
        todasLanchas = LanchaDAO.obterTodos();
        for (Lancha l : todasLanchas) {
            System.out.println(l);
        }

//        LanchaDAO.deletar(1);

        System.out.println("\nConsulta de todas as lanchas após a exclusão.");
        todasLanchas = LanchaDAO.obterTodos();
        for (Lancha l : todasLanchas) {
            System.out.println(l);
        }
    }
}