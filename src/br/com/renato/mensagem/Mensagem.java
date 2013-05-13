package br.com.renato.mensagem;

import java.net.Authenticator;
import java.util.Date;

public class Mensagem {

    private String destino;
    private String Assunto;

    public String getAssunto() {
        return Assunto;
    }

    public void setAssunto(String assunto) {
        this.Assunto = assunto;
    }
    private String msg;
    private Date data;

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
