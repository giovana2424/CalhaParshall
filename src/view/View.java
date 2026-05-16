package view;

import model.CalhaParshall;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class View {

    private final Scanner scan = new Scanner(System.in);

    public BigInteger readPopulacao() {
        System.out.print("População (P): ");
        return scan.nextBigInteger();
    }
    public BigDecimal readConsumo() {
        System.out.printf("Consumo de Água (q): ");
        return scan.nextBigDecimal();
    }


    public void printVazao(BigDecimal vazao , BigDecimal vazaoseg, BigDecimal vazaometros){
        System.out.print("\n");
        System.out.println("Vazão: " + vazao +
                         "\nVazao(seg): " + vazaoseg +
                         "\nVazao(metros³): " + vazaometros);
        System.out.print("\n");
    }

    public void printResultado(CalhaParshall calhaParshall){
        System.out.println("E:" + calhaParshall.getAlturaE() +
                "\nW:" + calhaParshall.getLarguraW() +
                "\nK:"+calhaParshall.getK()+
                "\nN:"+calhaParshall.getN()+
                "\nH:" + calhaParshall.getAlturaAguaH()+"\nH(cm):" +calhaParshall.getAlturaAguaHcm()+
                "\nporcentagem:" + calhaParshall.getPctgemAlturaAgua() );
    }

}
