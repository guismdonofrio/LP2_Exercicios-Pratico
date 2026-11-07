package edu.fatec.lp2.exercicio2;

import edu.fatec.lp2.exercicio2.compra.ItemCompra;
import edu.fatec.lp2.exercicio2.compra.ListaCompra;
import edu.fatec.lp2.exercicio2.modelo.Produto;
import edu.fatec.lp2.exercicio2.modelo.Supermercado;

public class App {
    public static void main(String[] args) {
        Supermercado mercado = new Supermercado("Supermercados Astolfo");

        Produto arroz = new Produto(mercado, "Arroz", "pct", "Arroz branco tipo 1 - 5kg", 25.90, 10);
        Produto feijao = new Produto(mercado, "Feijão", "pct", "Feijão carioca - 1kg", 8.50, 5);
        Produto cafe = new Produto(mercado, "Café", "pct", "Café torrado e moído - 500g", 18.00, 15);

        ListaCompra lista = new ListaCompra(3);
        lista.incluir(new ItemCompra(arroz, 2, 10));
        lista.incluir(new ItemCompra(feijao, 3, 0));
        lista.incluir(new ItemCompra(cafe, 5));

        System.out.println("=== Lista de compras - " + mercado + " ===");
        for (ItemCompra item : lista.getItensCompra()) {
            System.out.println(item);
        }
        System.out.printf("Total: R$ %.2f%n", lista.calcularPreco());

        try {
            lista.incluir(new ItemCompra(arroz, 1, 0));
        } catch (IllegalStateException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
        try {
            new ItemCompra(feijao, 1, 20);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }
    }
}
