package model;

public class Tarefa {
    private String nome;
    private boolean completo;

    public Tarefa(String nome) {
        this.nome = nome;
        this.completo = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean estaCompleto() {
        return completo;
    }

    public void marcarComoConcluído() {
        completo = true;
    }
}

