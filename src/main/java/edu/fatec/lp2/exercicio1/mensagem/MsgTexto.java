package edu.fatec.lp2.exercicio1.mensagem;

import edu.fatec.lp2.exercicio1.modelo.Contatinho;

public class MsgTexto extends Mensagem {
    private int numChar;

    public MsgTexto(Contatinho destinatario) {
        super(destinatario);
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        registrarEnvio(conteudo);
        this.numChar = conteudo == null ? 0 : conteudo.length();
        return this;
    }

    @Override
    public String toString() {
        return String.format("[%s] Texto para %s: \"%s\" (%d caracteres)",
                getHoraEnvio(), getDestinatario().getNome(), getConteudo(), numChar);
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }
}
