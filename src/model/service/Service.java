package model.service;

import model.CalhaParshall;
import model.Cidade;
import model.DimensaoCalha;
import model.VazaoPorW;
import model.repository.TabelaDimensaoCalhaRepository;
import model.repository.TabelaVazaoPorWRepository;

import java.math.BigDecimal;

public class Service {
    public CalhaParshall calculandoH(Cidade c) {

        for (BigDecimal f : TabelaVazaoPorWRepository.tabela1.keySet()) {
            if (c.getVazaoSegundo().compareTo(f) <= 0) {
                VazaoPorW vazaoPorW = TabelaVazaoPorWRepository.tabela1.get(f);
                DimensaoCalha dimensaoCalha = TabelaDimensaoCalhaRepository.tabela2.get(vazaoPorW.getW());

                BigDecimal K = vazaoPorW.getK();
                BigDecimal N = vazaoPorW.getN();

                BigDecimal parte1 = c.getVazaoMetros().divide(K, 4, BigDecimal.ROUND_HALF_UP);
                double exponenciacao = Math.pow(parte1.doubleValue(), 1 / N.doubleValue());
                BigDecimal H = BigDecimal.valueOf(exponenciacao);

                double H_arredondamento = Math.round(H.doubleValue() * 10.0) / 10.0;
                BigDecimal H_final = BigDecimal.valueOf(H_arredondamento);
                BigDecimal H_centimetro = H_final.multiply(BigDecimal.valueOf(100));
                BigDecimal porcentagem = (H_centimetro.divide(dimensaoCalha.getE(), 9, BigDecimal.ROUND_UP)).multiply(BigDecimal.valueOf(100));

                if (porcentagem.compareTo(BigDecimal.valueOf(70)) <= 0) {
                    return new CalhaParshall(K, N, dimensaoCalha.getE(), vazaoPorW.getW(),H_final, H_centimetro, porcentagem);
                }
            }
        }
        throw new RuntimeException("O valor superou 70%");
    }
}
