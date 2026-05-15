import controller.CidadeController;
import model.CalhaParshall;
import model.Cidade;
import view.View;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Cidade cidade = new Cidade();
        View view = new View();
        CidadeController cidadeController = new CidadeController(cidade, view);

        cidadeController.update();
        cidadeController.print();
    }
}