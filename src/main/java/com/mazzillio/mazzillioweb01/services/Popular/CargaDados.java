package com.mazzillio.mazzillioweb01.services.Popular;

import com.mazzillio.mazzillioweb01.entities.Endereco;
import com.mazzillio.mazzillioweb01.entities.Pessoa;
import com.mazzillio.mazzillioweb01.entities.Telefone;
import com.mazzillio.mazzillioweb01.entities.TipoLogadouro;
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
    }
}
