package com.mazzillio.mazzillioweb01.services.Pessoa;

import com.mazzillio.mazzillioweb01.entities.Pessoa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PessoaService implements PessoaServiceLocal{

    @PersistenceContext
    private EntityManager pessoaEntityManager;

    @Override
    public void salvar(Pessoa pessoa) {
        pessoaEntityManager.persist(pessoa);
    }
}
