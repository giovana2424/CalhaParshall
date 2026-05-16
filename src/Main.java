import controller.CidadeController;

import model.Cidade;
import model.service.Service;

import view.View;

public class Main {
    public static void main(String[] args) {

        Cidade cidade = new Cidade();
        View view = new View();
        Service service = new Service();
        CidadeController cidadeController = new CidadeController(cidade, view, service);

        cidadeController.update();
        cidadeController.print();
        cidadeController.print2();
    }
}