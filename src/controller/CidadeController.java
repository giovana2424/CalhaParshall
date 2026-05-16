package controller;

import model.Cidade;
import model.service.Service;
import view.View;

public class CidadeController {
    private final Cidade cidade;
    private final View view;
    private final Service service;
    public CidadeController(Cidade cidade, View view, Service service){
        this.cidade = cidade;
        this.view = view;
        this.service = service;
    }


    public void update(){
        cidade.setPopulacao(view.readPopulacao());
        cidade.setConsumo(view.readConsumo());
    }

    public void print(){
        view.printVazao(cidade.getVazaoDia(), cidade.getVazaoSegundo(), cidade.getVazaoMetros());
    }
    public void print2(){
        view.printResultado(service.calculandoH(cidade));
    }
}
