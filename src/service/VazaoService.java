package service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VazaoService {

    public BigDecimal calcularVazaoDia(BigDecimal qtdHabitante, BigDecimal litroHabitanteDia){
        return qtdHabitante.multiply(litroHabitanteDia);
    }

    public BigDecimal calcularVazaoSegundo(BigDecimal qDia){
        return qDia.divide(BigDecimal.valueOf(86400), 2, RoundingMode.HALF_UP);
    }
    public BigDecimal converterLitroParaM3(BigDecimal qDia){
        return qDia.divide(BigDecimal.valueOf(1000), 2, RoundingMode.HALF_UP);
    }

}
