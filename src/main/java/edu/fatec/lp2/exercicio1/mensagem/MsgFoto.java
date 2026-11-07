package edu.fatec.lp2.exercicio1.mensagem;

import edu.fatec.lp2.exercicio1.modelo.Contatinho;

public class MsgFoto extends Mensagem {
    private int tamanho;

    public MsgFoto(Contatinho destinatario, int tamanho) {
        super(destinatario);
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        registrarEnvio(conteudo);
        return this;
    }

    @Override
    public String toString() {
        return String.format("[%s] Foto para %s: %s (%d KB)",
                getHoraEnvio(), getDestinatario().getNome(), getConteudo(), tamanho);
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
