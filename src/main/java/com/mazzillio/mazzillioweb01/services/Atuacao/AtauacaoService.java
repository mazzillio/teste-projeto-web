package com.mazzillio.mazzillioweb01.services.Atuacao;

import com.mazzillio.mazzillioweb01.entities.Atuacao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AtauacaoService implements AtuacaoServiceLocal{

    @PersistenceContext
    private EntityManager atuacaoManager;

    @Override
    public void salvar(Atuacao atuacao) {
        atuacaoManager.persist(atuacao);
    }
}
