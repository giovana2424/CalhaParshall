package service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora {
    public BigDecimal calcularVazaoDia(BigDecimal qtdHabitante, BigDecimal litroHabitanteDia){
        return qtdHabitante.multiply(litroHabitanteDia);
    }

    public BigDecimal calcularVazaoSegundo(BigDecimal qDia){
        return qDia.divide(BigDecimal.valueOf(86400), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal converterLitroParaM3(BigDecimal qDia){
        return qDia.divide(BigDecimal.valueOf(1000), 2, RoundingMode.HALF_UP);
    }

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
