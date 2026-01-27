package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        for (String s : palavrasUnicasSet) {
            if (s.equals(palavra)) {
                palavraParaRemover = s;
                break;
            }
        }
        palavrasUnicasSet.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra) {
        if (palavrasUnicasSet.contains(palavra)) {
            System.out.println("A palavra " + palavra + " está no conjunto");
        } else {
            System.out.println("A palavra " + palavra + " não está no conjunto");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Macaco");
        conjuntoPalavrasUnicas.adicionarPalavra("Gato");
        conjuntoPalavrasUnicas.adicionarPalavra("Rato");
        conjuntoPalavrasUnicas.adicionarPalavra("Cachorro");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("Gato");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("Macaco");
        conjuntoPalavrasUnicas.verificarPalavra("Gato");
    }
}
