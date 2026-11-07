package edu.fatec.lp2.exercicio1.modelo;

import edu.fatec.lp2.exercicio1.mensagem.Mensagem;

import java.util.Arrays;

public class Whatsapp {
    private Contatinho[] contatos;
    private Mensagem[] mensagens;
    private int qtdeContatos;
    private int qtdeMensagens;

    public Whatsapp(int maxContatos, int maxMensagens) {
        this.contatos = new Contatinho[maxContatos];
        this.mensagens = new Mensagem[maxMensagens];
    }

    public void adicionarContato(Contatinho contato) {
        if (qtdeContatos >= contatos.length) {
            throw new IllegalStateException("Agenda cheia: limite de " + contatos.length + " contatos.");
        }
        contatos[qtdeContatos++] = contato;
    }

    public void adicionarMensagem(Mensagem mensagem) {
        if (qtdeMensagens >= mensagens.length) {
            throw new IllegalStateException("Limite de " + mensagens.length + " mensagens atingido.");
        }
        mensagens[qtdeMensagens++] = mensagem;
    }

    public void listarContatos() {
        System.out.println("=== Contatos (" + qtdeContatos + ") ===");
        for (int i = 0; i < qtdeContatos; i++) {
            System.out.println(contatos[i]);
        }
    }

    public void listarMensagens() {
        System.out.println("=== Mensagens (" + qtdeMensagens + ") ===");
        for (int i = 0; i < qtdeMensagens; i++) {
            System.out.println(mensagens[i]);
        }
    }

    public Contatinho[] getContatos() {
        return Arrays.copyOf(contatos, qtdeContatos);
    }

    public void setContatos(Contatinho[] contatos) {
        this.contatos = contatos;
        this.qtdeContatos = contarPreenchidos(contatos);
    }

    public Mensagem[] getMensagens() {
        return Arrays.copyOf(mensagens, qtdeMensagens);
    }

    public void setMensagens(Mensagem[] mensagens) {
        this.mensagens = mensagens;
        this.qtdeMensagens = contarPreenchidos(mensagens);
    }

    private static int contarPreenchidos(Object[] array) {
        int n = 0;
        while (n < array.length && array[n] != null) {
            n++;
        }
        return n;
    }
}
