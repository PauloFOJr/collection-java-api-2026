package set.Ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno removerAluno = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    removerAluno = a;
                    break;
                }
            }
            alunoSet.remove(removerAluno);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Melissa", 123, 8.5);
        gerenciadorAlunos.adicionarAluno("Paulo", 456, 7.3);
        gerenciadorAlunos.adicionarAluno("Paty", 789, 9.1);
        gerenciadorAlunos.adicionarAluno("Léia",147, 6.9);
        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(147);
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

    }
}
