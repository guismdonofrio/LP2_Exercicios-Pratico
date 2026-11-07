package edu.fatec.lp2.exercicio1.mensagem;

import edu.fatec.lp2.exercicio1.modelo.Contatinho;

public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(Contatinho destinatario, int duracao) {
        super(destinatario);
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        registrarEnvio(conteudo);
        return this;
    }

    @Override
    public String toString() {
        return String.format("[%s] Áudio para %s: %s (%ds)",
                getHoraEnvio(), getDestinatario().getNome(), getConteudo(), duracao);
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
