package model;

import java.math.*;

public class VazaoPorW {
    private final String w;
    private final BigDecimal k;
    private final BigDecimal n;

    public VazaoPorW(String w, BigDecimal minVazao, BigDecimal maxVazao, BigDecimal k, BigDecimal n){
        this.w = w;
        this.k = k;
        this.n = n;
    }

    public BigDecimal getK() {
        return k;
    }

    public String getW() {
        return w;
    }

    public BigDecimal getN() {
        return n;
    }



}

