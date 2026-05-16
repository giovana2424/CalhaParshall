package model;

import java.math.*;

public class CalhaParshall {
    BigDecimal K;
    BigDecimal N;

    private BigDecimal alturaE;
    private String larguraW;
    private BigDecimal alturaAguaH;
    private BigDecimal pctgemAlturaAgua;
    private BigDecimal alturaAguaHcm;

    public CalhaParshall(BigDecimal K, BigDecimal N, BigDecimal altura, String largura, BigDecimal alturaAgua, BigDecimal alturaAguaHcm, BigDecimal pctgemAlturaAgua){
        this.K = K;
        this.N = N;
        this.alturaE = altura;
        this.larguraW = largura;
        this.alturaAguaH = alturaAgua;
        this.alturaAguaHcm = alturaAguaHcm;
        this.pctgemAlturaAgua = pctgemAlturaAgua;
    }

    public BigDecimal getK(){return K;}

    public BigDecimal getN(){return N;}

    public BigDecimal getAlturaE() {
        return alturaE;
    }

    public BigDecimal getAlturaAguaH() {
        return alturaAguaH;
    }

    public BigDecimal getAlturaAguaHcm() {
        return alturaAguaHcm;
    }

    public String getLarguraW() {
        return larguraW;
    }

    public BigDecimal getPctgemAlturaAgua() {
        return pctgemAlturaAgua;
    }
}
