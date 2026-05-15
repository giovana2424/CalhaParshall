package model.repository;

import model.DimensaoCalha;
import model.VazaoPorW;

import java.math.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TabelaDimensaoCalhaRepository {
    public static final TreeMap<String, DimensaoCalha> tabela2 = new TreeMap<>(Map.ofEntries(
            Map.entry(
                    new String("1\""),
                    new DimensaoCalha( "1\"", new BigDecimal("22.9"))),
            Map.entry(
                    new String("3\""),
                    new DimensaoCalha("3\"", new BigDecimal("38.1"))),
            Map.entry(
                    new String("6\""),
                    new DimensaoCalha( "6\"", new BigDecimal("45.7"))),
            Map.entry(
                    new String("9\""),
                    new DimensaoCalha("9\"", new BigDecimal("61.0"))),
            Map.entry(
                    new String("1\'"),
                    new DimensaoCalha( "1\'", new BigDecimal("91.5"))),
            Map.entry(new String("1.5\'"),
                    new DimensaoCalha( "1.5\'", new BigDecimal("91.5"))),
            Map.entry(
                    new String("2\'"),
                    new DimensaoCalha("2\'", new BigDecimal("91.5"))),
            Map.entry(
                    new String("3\'"),
                    new DimensaoCalha("3\'", new BigDecimal("91.5"))),
            Map.entry(
                    new String("4\'"),
                    new DimensaoCalha("4\'", new BigDecimal("91.5"))),
            Map.entry(
                    new String("5\'"),
                    new DimensaoCalha("5\'", new BigDecimal("91.5"))),
            Map.entry(
                    new String("6\'"),
                    new DimensaoCalha("6\'", new BigDecimal("91.5"))),
            Map.entry(
                    new String("7\'"),
                    new DimensaoCalha("7\'", new BigDecimal("91.5"))),
            Map.entry(
                    new String("8\'"),
                    new DimensaoCalha("8\'", new BigDecimal("91.5"))),
            Map.entry(
                    new String("10\'"),
                    new DimensaoCalha("10\'", new BigDecimal("122.0")))
    ));
}
