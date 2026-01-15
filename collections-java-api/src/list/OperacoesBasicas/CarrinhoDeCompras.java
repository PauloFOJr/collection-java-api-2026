package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public void calcularValorTotal() {
        List<Item> valorTotal = new ArrayList<>();
        int totalQuantidade = 0;
        double totalPreco = 0.0;
        for (Item vt : itemList) {
            totalQuantidade += vt.getQuantidade();
            totalPreco += vt.getPreco();
        }
        System.out.println("Quantidade total: " + totalQuantidade + ", Preço total: R$" + totalPreco);
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("óculos", 120.0, 2);
        carrinhoDeCompras.adicionarItem("boné", 90.0, 4);
        carrinhoDeCompras.adicionarItem("casaco", 250.0, 3);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.removerItem("óculos");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }
}
