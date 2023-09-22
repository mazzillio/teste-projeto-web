package com.mazzillio.mazzillioweb01.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Endereco implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private TipoLogadouro tipoLogadouro;
    @Column(length = 150)
    private String logadouro;
    private Integer numero;
    @Column(length = 25)
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
