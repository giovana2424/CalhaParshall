package repository;

import model.VazaoPorW;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TabelaVazaoPorWRepository {

    private static final List<VazaoPorW> tabela = new ArrayList<>(List.of(
            new VazaoPorW("3\"", new BigDecimal("0,85"), new BigDecimal("53,8"), new BigDecimal("0,1771"),new BigDecimal("1,5447")),
            new VazaoPorW("6\"", new BigDecimal("1,52"), new BigDecimal("110,4"), new BigDecimal("0,3812"),new BigDecimal("1,530")),
            new VazaoPorW("9\"", new BigDecimal("2,55"), new BigDecimal("251,9"), new BigDecimal("0,5354"),new BigDecimal("1,530")),
            new VazaoPorW("1\"", new BigDecimal("3,11"), new BigDecimal("455,6"), new BigDecimal("0,6909"),new BigDecimal("1,522")),
            new VazaoPorW("1,5", new BigDecimal("4,25"), new BigDecimal("696,2"), new BigDecimal("1,0560"),new BigDecimal("1,538")),
            new VazaoPorW("2", new BigDecimal("11,89"), new BigDecimal("936,7"), new BigDecimal("1,4290"),new BigDecimal("1,550")),
            new VazaoPorW("3", new BigDecimal("17,26"), new BigDecimal("1726"), new BigDecimal("2,1840"),new BigDecimal("1,5666")),
            new VazaoPorW("4", new BigDecimal("36,79"), new BigDecimal("1921"), new BigDecimal("2,9630"),new BigDecimal("1,5738")),
            new VazaoPorW("5", new BigDecimal("62,80"), new BigDecimal("2422"), new BigDecimal("3,7320"),new BigDecimal("1,587"))));
}
