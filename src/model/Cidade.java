package model;

import java.math.*;

public class Cidade {
    private BigInteger qtdHabitante;
    private BigDecimal consumoAgua;

    public Cidade(BigInteger qtdHabitante, BigDecimal consumoAgua) {
        this.qtdHabitante = qtdHabitante;
        this.consumoAgua = consumoAgua;
    }

    public void setQtdHabitante(BigInteger qtdHabitante) {
        this.qtdHabitante = qtdHabitante;
    }

    public void setConsumoAgua(BigDecimal consumoAgua) {
        this.consumoAgua = consumoAgua;
    }

    public BigDecimal getVazaoDia(){
        return this.consumoAgua.multiply(new BigDecimal(this.qtdHabitante));
    }

    public BigDecimal getVazaoSegundo(){
        return getVazaoDia().divide(BigDecimal.valueOf(86400), 2, RoundingMode.HALF_UP);
    }
}
