package edu.fatec.lp2.exercicio1.mensagem;

import edu.fatec.lp2.exercicio1.modelo.Contatinho;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Mensagem {
    private static final DateTimeFormatter FORMATO_HORA = DateTimeFormatter.ofPattern("HH:mm:ss");

    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    protected Mensagem(Contatinho destinatario) {
        this.destinatario = destinatario;
    }

    public abstract Mensagem sendMessage(String conteudo);

    protected void registrarEnvio(String conteudo) {
        this.conteudo = conteudo;
        this.horaEnvio = LocalTime.now().format(FORMATO_HORA);
    }

    @Override
    public abstract String toString();

    public Contatinho getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Contatinho destinatario) {
        this.destinatario = destinatario;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(String horaEnvio) {
        this.horaEnvio = horaEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
