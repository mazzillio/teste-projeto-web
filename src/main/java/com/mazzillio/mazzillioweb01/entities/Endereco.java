package com.mazzillio.mazzillioweb01.entities;

public class Endereco {
    private long id;
    private TipoLogadouro tipoLogadouro;
    private String logadouro;
    private Number numero;
    private String bairro;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoLogadouro getTipoLogadouro() {
        return tipoLogadouro;
    }

    public void setTipoLogadouro(TipoLogadouro tipoLogadouro) {
        this.tipoLogadouro = tipoLogadouro;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public Number getNumero() {
        return numero;
    }

    public void setNumero(Number numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
