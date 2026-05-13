package service;

import model.CalhaParshall;
import model.Cidade;

import java.math.*;
import java.math.RoundingMode;

public class CalculadoraService {
    CidadeService cidadeService = new CidadeService();

    public BigDecimal converterLitroParaM3(BigDecimal qDia){
        return qDia.divide(BigDecimal.valueOf(1000), 2, RoundingMode.HALF_UP);
    }



//    public BigDecimal calcularAlturaAgua(BigDecimal qSegundo){
//        BigDecimal potencia = new BigDecimal(1/1.530);
//
//        return qSegundo.divide(BigDecimal.valueOf(0.5334)).pow(potencia);
//    }

//    public CalhaParshall calcularCalhaIdeal(BigInteger qtdHabitantes, BigDecimal consumoAgua){
//        CalhaParshall calhaParshall = new CalhaParshall();
//        Cidade cidade = new Cidade(qtdHabitantes, consumoAgua);
//
//        calhaParshall.
//    }

    //CALCULO COMPLETO:

    //População (P) = Habitantes
    //Consumo de água (q) = Litros/habitantes/dia
    //Q = Vazão

    //Calcular Vazão
    //Q dia = P * q
    //Q segundo = Q dia / 86400

    //Calcular altura da água
    //H = (Q Segundo / K) ^ 1/n
    //Depois fazer regra de três para ver se H > 70%


}
