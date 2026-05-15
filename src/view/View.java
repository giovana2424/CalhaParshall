package view;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class View {

    private final Scanner scan = new Scanner(System.in);

    public BigInteger readPopulação() {
        System.out.print("População (P): ");
        return scan.nextBigInteger();
    }
    public BigDecimal readConsumo() {
        System.out.printf("Consumo de Água (q): ");
        return scan.nextBigDecimal();
    }


    public void printVazão(BigDecimal vazao , BigDecimal vazaoseg){
        System.out.println("Vazão:\n" + vazao + "\nVazaoseg:\n" + vazaoseg);
    }

}
