package set.Pesquisa;

import set.Tarefa;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println(tarefaSet.size());
    }

    public void obterTarefasConcluidas() {
        Set<Tarefa>  tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isTarefaConcluida()) {
                tarefasConcluidas.add(t);
                System.out.println(tarefasConcluidas);
            }
        }
    }

    public void obterTarefasPendentes() {
        Set<Tarefa>  tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isTarefaConcluida()) {
                tarefasPendentes.add(t);
                System.out.println(tarefasPendentes);
            }
        }
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
               t.setTarefaConcluida(true);
               break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
       Set<Tarefa> limparLista = new HashSet<>();
       if (!tarefaSet.isEmpty()) {
               tarefaSet.clear();
           }
    }

    @Override
    public String toString() {
        return "ListaTarefas{" +
                "tarefaSet=" + tarefaSet +
                '}';
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Limpar a casa");
        listaTarefas.adicionarTarefa("Arrumar o quarto");
        listaTarefas.adicionarTarefa("Lavar a louça");
        listaTarefas.adicionarTarefa("Recolher o lixo");
        listaTarefas.exibirTarefas();
        listaTarefas.removerTarefa("Recolher o lixo");
        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();
        listaTarefas.marcarTarefaConcluida("Limpar a casa");

       listaTarefas.obterTarefasConcluidas();
       listaTarefas.obterTarefasPendentes();
        //listaTarefas.limparListaTarefas();
//        listaTarefas.exibirTarefas();
//        listaTarefas.marcarTarefaPendente("Limpar a casa");
        listaTarefas.exibirTarefas();
    }
}
