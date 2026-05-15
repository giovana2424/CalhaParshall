package model.service;

import model.CalhaParshall;
import model.Cidade;
import model.DimensaoCalha;
import model.VazaoPorW;
import model.repository.TabelaDimensaoCalhaRepository;
import model.repository.TabelaVazaoPorWRepository;

import java.math.BigDecimal;

public class Service {
    public CalhaParshall calcularTudo(Cidade c) {
        for (BigDecimal f : TabelaVazaoPorWRepository.tabela1.keySet()) {
            if (c.getVazaoSegundo().compareTo(f) <= 0) {
                VazaoPorW vazaoPorW = TabelaVazaoPorWRepository.tabela1.get(f);
                DimensaoCalha dimensaoCalha = TabelaDimensaoCalhaRepository.tabela2.get(vazaoPorW.getW());

                BigDecimal l = c.getVazaoSegundo().divide(vazaoPorW.getK(), 4, BigDecimal.ROUND_HALF_UP);
                double raiz = Math.sqrt(l.doubleValue());
                BigDecimal h = BigDecimal.valueOf(raiz);

                BigDecimal porcentagem = h.multiply(BigDecimal.valueOf(100))
                        .divide(dimensaoCalha.getE(), 2, BigDecimal.ROUND_HALF_UP);

                if (porcentagem.compareTo(BigDecimal.valueOf(70)) <= 0) {
                    return new CalhaParshall(dimensaoCalha.getE(), vazaoPorW.getW(), h, porcentagem);
                }
            }
        }
        return null;
    }
}
