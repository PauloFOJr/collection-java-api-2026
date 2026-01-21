package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listanumeros;

    public OrdenacaoNumeros() {
        this.listanumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listanumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordemAscendente = new ArrayList<>(listanumeros);
        if (!listanumeros.isEmpty()) {
            Collections.sort(ordemAscendente);
            return ordemAscendente;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordemDescendente = new ArrayList<>(listanumeros);
        if (!listanumeros.isEmpty()) {
            ordemDescendente.sort(Collections.reverseOrder());
//            Collections.sort(ordemDescendente);
//            Collections.reverse(ordemDescendente);
            return ordemDescendente;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if (!listanumeros.isEmpty()) {
            System.out.println(this.listanumeros);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "listanumeros=" + listanumeros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.exibirNumeros();
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }

}
