package controller;

import java.util.ArrayList;
import java.util.List;

import model.Tarefa;

public class TarefaController {
    private List<Tarefa> tarefas;

    public TarefaController() {
    	tarefas = new ArrayList<>();
    }

    public void addTarefa(String tarefaName) {
    	Tarefa newTarefa = new Tarefa(tarefaName);
    	tarefas.add(newTarefa);
    }

    public void markTaskAsCompleted(String tarefaNome) {
        for (Tarefa Tarefa : tarefas) {
            if (Tarefa.getNome().equals(tarefaNome)) {
            	Tarefa.marcarComoConcluído();
                break;
            }
        }
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
}
