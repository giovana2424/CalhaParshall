package model;

import java.math.*;

public class VazaoPorW {
    private String w;
    private BigDecimal minVazao;
    private BigDecimal maxVazao;
    private BigDecimal k;
    private BigDecimal n;

    public VazaoPorW(String w, BigDecimal minVazao, BigDecimal maxVazao, BigDecimal k, BigDecimal n){
        this.w = w;
        this.minVazao = minVazao;
        this.maxVazao = maxVazao;
        this.k = k;
        this.n = n;
    }

    public BigDecimal getK() {
        return k;
    }

    public String getW() {
        return w;
    }

    public BigDecimal getMaxVazao() {
        return maxVazao;
    }

    public BigDecimal getMinVazao() {
        return minVazao;
    }

    public BigDecimal getN() {
        return n;
    }

    @Override
    public String toString() {
        return "W: "+w+" | Vazão máxima: "+maxVazao+" | Vazão mínima: "+minVazao+" | N:"+n;
    }
}
