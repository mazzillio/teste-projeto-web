package com.mazzillio.mazzillioweb01.services.Carga;

import com.mazzillio.mazzillioweb01.entities.*;
import com.mazzillio.mazzillioweb01.services.Atuacao.AtuacaoServiceLocal;
import com.mazzillio.mazzillioweb01.services.Pessoa.PessoaServiceLocal;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.time.LocalDate;

@Singleton
@Startup
public class CargaDados implements CargaDadosLocal{
    @Inject
    private PessoaServiceLocal pessoaService;

    @Inject
    private AtuacaoServiceLocal atuacaoService;
    @Override
    @PostConstruct
    public void popularBanco(){

        Pessoa pessoa = new Pessoa();
        pessoa.setName("mattheus");
        pessoa.setEmail("mateca500@gmal.com");
        pessoa.setNascimento(LocalDate.of(2001,1,1));

        Telefone telefone = new Telefone();
        telefone.setDdd((byte)38);
        telefone.setNumero(991831291);
        pessoa.getTelefones().add(telefone);

        Endereco endereco = new Endereco();
        endereco.setNumero(490);
        endereco.setBairro("Santos Dumont");
        endereco.setTipoLogadouro(TipoLogadouro.RUA);
        endereco.setLogadouro("Rua B");
        pessoa.setEndereco(endereco);
        pessoaService.salvar(pessoa);

        Grupo grupo = new Grupo();

        grupo.setAtivo(true);
        grupo.setNome("BD");
        grupo.setLider(pessoa);

        Atuacao atuacao = new Atuacao();
        atuacao.setInicio(LocalDate.of(2023,1,1));
        atuacao.setTermino(LocalDate.of(2023,6,1));
        atuacao.setPessoa(pessoa);
        atuacao.setGrupo(grupo);

        atuacaoService.salvar(atuacao);

    }
}
