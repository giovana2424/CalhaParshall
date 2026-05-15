package controller;

import model.Cidade;
import view.View;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CidadeController {
    private final Cidade cidade;
    private final View view;

    public CidadeController(Cidade cidade, View view){
        this.cidade = cidade;
        this.view = view;
    }


    public void update(){
        cidade.setConsumo(view.readConsumo());
        cidade.setPopulacao(view.readPopulação());
    }

    public void vazaoDia(){
        cidade.getVazaoDia();
    }

    public void vazaoSec(){
        cidade.getVazaoSegundo();
    }

    public void print(){
        view.printVazão(cidade.getVazaoDia(), cidade.getVazaoSegundo());
    }
}
