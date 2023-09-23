package com.mazzillio.mazzillioweb01.services.Grupo;

import com.mazzillio.mazzillioweb01.entities.Grupo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class GrupoService implements GrupoServiceLocal{

    @PersistenceContext
    private EntityManager grupoManager;
    @Override
    public void salvar(Grupo grupo) {
        grupoManager.persist(grupo);
    }
}
