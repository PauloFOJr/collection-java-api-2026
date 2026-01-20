package list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Numero> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(new Numero(numero));
    }

    public List<Numero> calcularSoma() {
        List<Numero> numerosParaSomar = new ArrayList<>();
        int numeroDaLista = 0;
        for (Numero n : numeroList) numeroDaLista += n.getNumero();
        System.out.println("Soma dos números da lista é: " + numeroDaLista);
        return numerosParaSomar;
    }

    public Numero encontrarMaiorNumero() {
        if (!numeroList.isEmpty()) {
            Numero maior = numeroList.get(0);
            for (Numero n : numeroList) {
                if (n.getNumero() > maior.getNumero()) {
                    maior = n;
                }
            }
            System.out.println("O número maior é " + maior);
        }
       return null;
    }

    public Numero encontrarMenorNumero() {
        if (!numeroList.isEmpty()) {
            Numero menor = numeroList.get(0);
            for (Numero n : numeroList) {
                if (n.getNumero() < menor.getNumero()) {
                    menor = n;
                }
            }
            System.out.println("O número maior é " + menor);
        }
        return null;
    }

    public void exibirNumeros() {
        System.out.println(numeroList);
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(14);
        somaNumeros.calcularSoma();
        somaNumeros.exibirNumeros();
        somaNumeros.encontrarMenorNumero();
        somaNumeros.encontrarMaiorNumero();

    }

}
