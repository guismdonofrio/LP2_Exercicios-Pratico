package edu.fatec.lp2.exercicio2.compra;

import edu.fatec.lp2.exercicio2.modelo.Produto;

public class ItemCompra implements Calculavel {
    private int quantidade;
    private Produto produto;
    private double desconto;

    public ItemCompra(Produto produto, double desconto) {
        this(produto, 1, desconto);
    }

    public ItemCompra(Produto produto, int quantidade, double desconto) {
        setProduto(produto);
        setQuantidade(quantidade);
        setDesconto(desconto);
    }

    @Override
    public double calcularPreco() {
        return produto.getPreco() * quantidade * (1 - desconto / 100.0);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("O item de compra precisa de um produto.");
        }
        this.produto = produto;

        if (desconto > produto.getDescontoMaximo()) {
            this.desconto = 0;
        }
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if (desconto < 0 || desconto > produto.getDescontoMaximo()) {
            throw new IllegalArgumentException(String.format(
                    "Desconto de %.2f%% inválido para \"%s\": deve estar entre 0 e %.2f%%.",
                    desconto, produto, produto.getDescontoMaximo()));
        }
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return String.format("%d %s x %s (R$ %.2f) - %.2f%% = R$ %.2f",
                quantidade, produto.getUnidade(), produto, produto.getPreco(), desconto, calcularPreco());
    }
}
