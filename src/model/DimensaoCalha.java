package model;

import java.math.*;

public class DimensaoCalha {
    private final BigDecimal e;

    public DimensaoCalha(String w, BigDecimal e){
        this.e = e;
    }

    public BigDecimal getE() {
        return e;
    }
}
