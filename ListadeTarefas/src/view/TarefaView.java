package view;

import java.util.List;

import controller.TarefaController;
import model.Tarefa;

public class TarefaView {
    private TarefaController controller;

    public TarefaView(TarefaController controller) {
        this.controller = controller;
    }

    public void displayTarefas() {
        System.out.println("Lista de Tarefas:");
        List<Tarefa> tarefas = controller.getTarefas();
        for (Tarefa tarefa : tarefas) {
            String status = tarefa.estaCompleto() ? "Concluída" : "Não Concluída";
            System.out.println("- " + tarefa.getNome() + ": " + status);
        }
    }
}

