package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.mensagem.MsgAudio;
import edu.fatec.lp2.exercicio1.mensagem.MsgFoto;
import edu.fatec.lp2.exercicio1.mensagem.MsgTexto;
import edu.fatec.lp2.exercicio1.modelo.Contatinho;
import edu.fatec.lp2.exercicio1.modelo.Whatsapp;

public class App {
    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp(10, 50);

        Contatinho maria = new Contatinho("Maria", "(11) 91234-5678");
        Contatinho joao = new Contatinho("João", "(11) 98765-4321");
        whatsapp.adicionarContato(maria);
        whatsapp.adicionarContato(joao);

        whatsapp.adicionarMensagem(new MsgTexto(maria).sendMessage("Oi, Maria! Tudo bem?"));
        whatsapp.adicionarMensagem(new MsgAudio(joao, 42).sendMessage("audio_001.ogg"));
        whatsapp.adicionarMensagem(new MsgFoto(maria, 2048).sendMessage("praia.jpg"));

        whatsapp.listarContatos();
        whatsapp.listarMensagens();
    }
}
