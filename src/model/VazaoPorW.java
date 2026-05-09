package model;

import java.math.BigDecimal;

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



}
