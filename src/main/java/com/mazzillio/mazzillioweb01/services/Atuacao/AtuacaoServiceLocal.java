package com.mazzillio.mazzillioweb01.services.Atuacao;

import com.mazzillio.mazzillioweb01.entities.Atuacao;

import javax.ejb.Local;

@Local
public interface AtuacaoServiceLocal {
    void salvar(Atuacao atuacao);
}
