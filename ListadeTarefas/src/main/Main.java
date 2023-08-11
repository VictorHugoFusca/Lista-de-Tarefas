package main;

import controller.TarefaController;
import view.TarefaView;

public class Main {
    public static void main(String[] args) {
       TarefaController tarefaController = new TarefaController();
       TarefaView tarefaView = new TarefaView(tarefaController);
       
       tarefaController.addTarefa("Programar");
       tarefaController.addTarefa("Estudar Java");
       tarefaController.addTarefa("Fazer Exercicios");
       
       tarefaController.markTaskAsCompleted("Estudar Java");
       
       tarefaView.displayTarefas();
       
    }
}

