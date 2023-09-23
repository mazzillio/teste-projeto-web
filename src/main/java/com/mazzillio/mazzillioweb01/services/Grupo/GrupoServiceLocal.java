package com.mazzillio.mazzillioweb01.services.Grupo;

import com.mazzillio.mazzillioweb01.entities.Grupo;

import javax.ejb.Local;

@Local
public interface GrupoServiceLocal {
    void salvar(Grupo grupo);
}
