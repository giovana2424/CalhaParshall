package service;

import model.Cidade;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CidadeService {
    public Cidade cidade(BigInteger qtdHabitante, BigDecimal consumoAgua){
        return new Cidade(qtdHabitante, consumoAgua);
    }
}
