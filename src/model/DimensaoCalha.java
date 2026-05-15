package model;

import java.math.*;

public class DimensaoCalha {
    private String w;
    private BigDecimal e;

    public DimensaoCalha(String w, BigDecimal e){
        this.w = w;
        this.e = e;
    }

    public BigDecimal getE() {
        return e;
    }

    public String getW() {
        return w;
    }

    @Override
    public String toString() {
        return "W: "+w+
                "| E: "+e;
    }
}
