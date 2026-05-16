package model;

import java.math.*;

public class Cidade {
    private BigInteger populacao;
    private BigDecimal consumo;

    public void setPopulacao(BigInteger populacao)
    {
        this.populacao = populacao;
    }

    public void setConsumo(BigDecimal consumo)
    {
        this.consumo = consumo;
    }

    public BigDecimal getVazaoDia()
    {
        return this.consumo.multiply(new BigDecimal(this.populacao));
    }

    public BigDecimal getVazaoSegundo(){
        return getVazaoDia().divide(BigDecimal.valueOf(86400), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal getVazaoMetros(){
        return getVazaoSegundo().divide(BigDecimal.valueOf(1000), 2);
    }

}
