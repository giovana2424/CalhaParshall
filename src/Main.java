import controller.ParshallController;
import model.CalhaParshall;
import repository.TabelaDimensaoCalhaRepository;
import service.CalculadoraService;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CalculadoraService calculadoraService = new CalculadoraService();
        ParshallController parshallController = new ParshallController(calculadoraService);

        System.out.println("Olá, boas-vindas!");
        System.out.print("População (P): ");
        BigInteger qtdHabitantes = sc.nextBigInteger();
        System.out.printf("Consumo de Água (q): ");
        BigDecimal consumoAgua = sc.nextBigDecimal();

        CalhaParshall calhaParshall = parshallController.calcularCalhaParshall(qtdHabitantes, consumoAgua);

    }
}