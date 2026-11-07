package edu.fatec.lp2.exercicio2.compra;

import java.util.Arrays;

public class ListaCompra implements Calculavel {
    private ItemCompra[] itensCompra;
    private int qtdeMax;
    private int qtdeItens;

    public ListaCompra(int qtdeMax) {
        if (qtdeMax <= 0) {
            throw new IllegalArgumentException("A quantidade máxima deve ser maior que zero.");
        }
        this.qtdeMax = qtdeMax;
        this.itensCompra = new ItemCompra[qtdeMax];
    }

    public void incluir(ItemCompra item) {
        if (item == null) {
            throw new IllegalArgumentException("O item não pode ser nulo.");
        }
        if (qtdeItens >= qtdeMax) {
            throw new IllegalStateException("Lista cheia: limite de " + qtdeMax + " itens atingido.");
        }
        itensCompra[qtdeItens++] = item;
    }

    @Override
    public double calcularPreco() {
        double total = 0;
        for (int i = 0; i < qtdeItens; i++) {
            total += itensCompra[i].calcularPreco();
        }
        return total;
    }

    public ItemCompra[] getItensCompra() {
        return Arrays.copyOf(itensCompra, qtdeItens);
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public int getQtdeItens() {
        return qtdeItens;
    }

    public boolean isCheia() {
        return qtdeItens == qtdeMax;
    }
}
