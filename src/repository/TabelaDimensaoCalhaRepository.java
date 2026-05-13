package repository;

import model.DimensaoCalha;

import java.math.*;
import java.util.ArrayList;
import java.util.List;

public class TabelaDimensaoCalhaRepository {
    private static final List<DimensaoCalha> tabela = new ArrayList<>(List.of
            (new DimensaoCalha("1\"", new BigDecimal("22,9")),
             new DimensaoCalha("3\"", new BigDecimal("38,1")),
             new DimensaoCalha("6\"", new BigDecimal("45,7")),
             new DimensaoCalha("9\"", new BigDecimal("61,0")),
             new DimensaoCalha("1\'", new BigDecimal("91,5")),
             new DimensaoCalha("1.5\'", new BigDecimal("91,5")),
             new DimensaoCalha("2\'", new BigDecimal("91,5")),
             new DimensaoCalha("3\'", new BigDecimal("91,5")),
             new DimensaoCalha("4\'", new BigDecimal("91,5")),
             new DimensaoCalha("5\'", new BigDecimal("91,5")),
             new DimensaoCalha("6\'", new BigDecimal("91,5")),
             new DimensaoCalha("7\'", new BigDecimal("91,5")),
             new DimensaoCalha("8\'", new BigDecimal("91,5")),
             new DimensaoCalha("10\'", new BigDecimal("122,0"))));

}
