package model;

import java.math.*;

public class CalhaParshall {
    private BigDecimal altura;
    private String largura;
    private BigDecimal alturaAgua;
    private BigDecimal pctgemAlturaAgua;

    public CalhaParshall(BigDecimal altura, String largura, BigDecimal alturaAgua, BigDecimal pctgemAlturaAgua){
        this.altura = altura;
        this.largura = largura;
        this.alturaAgua = alturaAgua;
        this.pctgemAlturaAgua = pctgemAlturaAgua;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public BigDecimal getAlturaAgua() {
        return alturaAgua;
    }

    public String getLargura() {
        return largura;
    }

    public BigDecimal getPctgemAlturaAgua() {
        return pctgemAlturaAgua;
    }

    @Override
    public String toString() {
        return "Altura da Calha: "+altura+
                "| Largura da Calha: "+largura+
                "| Altura da água: "+alturaAgua+
                "| Porcentagem da altura a água em comparação com a altura da calha: "+pctgemAlturaAgua;
    }
}
