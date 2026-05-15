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

    public BigDecimal getConsumo()
    {
        return consumo;
    }

    public BigInteger getPopulacao()
    {
        return populacao;
    }

    public BigDecimal getVazaoDia()
    {
        return this.consumo.multiply(new BigDecimal(this.populacao));
    }

    public BigDecimal getVazaoSegundo(){
        return getVazaoDia().divide(BigDecimal.valueOf(86400), 2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "População: "+populacao+
                "| Consumo por dia por habitante: "+consumo+
                "| Vazão por dia: "+getVazaoDia()+
                "| Vazão segundo: "+getVazaoSegundo();
    }
}
