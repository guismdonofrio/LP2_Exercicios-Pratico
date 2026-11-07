package edu.fatec.lp2.exercicio2.modelo;

public class Produto {
    private String nome;
    private String unidade;
    private String descricao;
    private double preco;
    private double descontoMaximo;
    private Supermercado supermercado;

    public Produto(Supermercado s) {
        this.supermercado = s;
    }

    public Produto(Supermercado s, String nome, String unidade, String descricao,
                   double preco, double descontoMaximo) {
        this(s);
        this.nome = nome;
        this.unidade = unidade;
        this.descricao = descricao;
        setPreco(preco);
        setDescontoMaximo(descontoMaximo);
    }

    @Override
    public String toString() {
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public double getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(double descontoMaximo) {
        if (descontoMaximo < 0 || descontoMaximo > 100) {
            throw new IllegalArgumentException("O desconto máximo deve estar entre 0 e 100%.");
        }
        this.descontoMaximo = descontoMaximo;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }
}
