package com.mazzillio.mazzillioweb01.services.Carga;

import com.mazzillio.mazzillioweb01.entities.*;
import com.mazzillio.mazzillioweb01.services.Atuacao.AtuacaoServiceLocal;
import com.mazzillio.mazzillioweb01.services.Grupo.GrupoServiceLocal;
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
    private GrupoServiceLocal grupoService;

    @Inject
    private AtuacaoServiceLocal atuacaoService;
    @Override
    @PostConstruct
    public void popularBanco(){

        Pessoa pessoaAna = new Pessoa();
        pessoaAna.setName("Ana Zaira");
        pessoaAna.setEmail("ana@mail.com");
        pessoaAna.setNascimento(LocalDate.of(2002,1,1));

        Endereco enderecoAna = new Endereco();
        enderecoAna.setNumero(1111);
        enderecoAna.setBairro("Bairro Humberto");
        enderecoAna.setTipoLogadouro(TipoLogadouro.RUA);
        enderecoAna.setLogadouro("Rua 1");

        pessoaAna.setEndereco(enderecoAna);

        Telefone telefoneAna1 = new Telefone();
        telefoneAna1.setDdd((byte)11);
        telefoneAna1.setNumero(11111111);

        Telefone telefoneAna2 = new Telefone();
        telefoneAna2.setDdd((byte)12);
        telefoneAna2.setNumero(12121212);

        Telefone telefoneAna3 = new Telefone();
        telefoneAna3.setDdd((byte)13);
        telefoneAna3.setNumero(13131313);

        pessoaAna.getTelefones().add(telefoneAna1);
        pessoaAna.getTelefones().add(telefoneAna2);
        pessoaAna.getTelefones().add(telefoneAna3);

        pessoaService.salvar(pessoaAna);

        Pessoa pessoaBeatriz = new Pessoa();
        pessoaBeatriz.setName("Beatriz Yana");
        pessoaBeatriz.setEmail("beatriz@mail.com");
        pessoaBeatriz.setNascimento(LocalDate.of(2002,2,2));

        Endereco enderecoBeatriz = new Endereco();
        enderecoBeatriz.setNumero(2222);
        enderecoBeatriz.setBairro("Bairro Doisberto");
        enderecoBeatriz.setTipoLogadouro(TipoLogadouro.AVENIDA);
        enderecoBeatriz.setLogadouro("Avenida 2");
        pessoaBeatriz.setEndereco(enderecoBeatriz);

        Telefone telefoneBeatriz = new Telefone();
        telefoneBeatriz.setDdd((byte)22);
        telefoneBeatriz.setNumero(22222222);
        pessoaBeatriz.getTelefones().add(telefoneBeatriz);

        pessoaService.salvar(pessoaBeatriz);

        Pessoa pessoaCecilia = new Pessoa();
        pessoaCecilia.setName("Cecília Xeres");
        pessoaCecilia.setEmail("cecila@mail.com");
        pessoaCecilia.setNascimento(LocalDate.of(2003,3,3));

        Endereco enderecoCecilia = new Endereco();
        enderecoCecilia.setNumero(2222);
        enderecoCecilia.setBairro("Bairro Doisberto");
        enderecoCecilia.setTipoLogadouro(TipoLogadouro.AVENIDA);
        enderecoCecilia.setLogadouro("Avenida 2");

        pessoaCecilia.setEndereco(enderecoCecilia);

        pessoaService.salvar(pessoaCecilia);

        Pessoa pessoaDebora = new Pessoa();
        pessoaDebora.setName("Débora Wenderl");
        pessoaDebora.setEmail("debora@mail.com");
        pessoaDebora.setNascimento(LocalDate.of(2002,1,1));

        Endereco enderecoDebora = new Endereco();
        enderecoDebora.setNumero(4444);
        enderecoDebora.setBairro("Bairro Quatroberto");
        enderecoDebora.setTipoLogadouro(TipoLogadouro.PRACA);
        enderecoDebora.setLogadouro("PRACA 4");

        pessoaDebora.setEndereco(enderecoDebora);

        Telefone telefoneDebora1 = new Telefone();
        telefoneDebora1.setDdd((byte)44);
        telefoneDebora1.setNumero(44444444);

        Telefone telefoneDebora2 = new Telefone();
        telefoneDebora2.setDdd((byte)45);
        telefoneDebora2.setNumero(45454545);

        pessoaDebora.getTelefones().add(telefoneDebora1);
        pessoaDebora.getTelefones().add(telefoneDebora2);


        pessoaService.salvar(pessoaDebora);

        Grupo grupo1 = new Grupo();

        grupo1.setNome("Estudo I");
        grupo1.setAtivo(false);
        grupo1.setLider(pessoaAna);

        grupoService.salvar(grupo1);

        Atuacao atuacaoGp1_Ana_lider = new Atuacao();
        atuacaoGp1_Ana_lider.setInicio(LocalDate.of(2011,1,1));
        atuacaoGp1_Ana_lider.setTermino(LocalDate.of(2021,11,11));
        atuacaoGp1_Ana_lider.setPessoa(pessoaAna);
        atuacaoGp1_Ana_lider.setGrupo(grupo1);

        atuacaoService.salvar(atuacaoGp1_Ana_lider);

        Atuacao atuacaoGp1_Ana = new Atuacao();
        atuacaoGp1_Ana.setInicio(LocalDate.of(2012,1,1));
        atuacaoGp1_Ana.setTermino(LocalDate.of(2022,11,11));
        atuacaoGp1_Ana.setPessoa(pessoaAna);
        atuacaoGp1_Ana.setGrupo(grupo1);

        atuacaoService.salvar(atuacaoGp1_Ana);

        Atuacao atuacaoGp1_Beatriz = new Atuacao();
        atuacaoGp1_Beatriz.setInicio(LocalDate.of(2012,1,2));
        atuacaoGp1_Beatriz.setTermino(LocalDate.of(2021,1,12));
        atuacaoGp1_Beatriz.setPessoa(pessoaBeatriz);
        atuacaoGp1_Beatriz.setGrupo(grupo1);

        atuacaoService.salvar(atuacaoGp1_Beatriz);

        Atuacao atuacaoGp1_Cecilia = new Atuacao();
        atuacaoGp1_Cecilia.setInicio(LocalDate.of(2012,1,3));
        atuacaoGp1_Cecilia.setTermino(LocalDate.of(2021,1,13));
        atuacaoGp1_Cecilia.setPessoa(pessoaCecilia);
        atuacaoGp1_Cecilia.setGrupo(grupo1);

        atuacaoService.salvar(atuacaoGp1_Cecilia);

        Atuacao atuacaoGp1_Debora = new Atuacao();
        atuacaoGp1_Debora.setInicio(LocalDate.of(2014,1,4));
        atuacaoGp1_Debora.setTermino(LocalDate.of(2021,1,14));
        atuacaoGp1_Debora.setPessoa(pessoaDebora);
        atuacaoGp1_Debora.setGrupo(grupo1);

        atuacaoService.salvar(atuacaoGp1_Debora);

        Grupo grupo2 = new Grupo();
        grupo2.setNome("Estudo II");
        grupo2.setAtivo(true);
        grupo2.setLider(pessoaBeatriz);

        grupoService.salvar(grupo2);

        Atuacao atuacaoGp2_Beatriz_lider = new Atuacao();
        atuacaoGp2_Beatriz_lider.setInicio(LocalDate.of(2012,1,2));
        atuacaoGp2_Beatriz_lider.setPessoa(pessoaBeatriz);
        atuacaoGp2_Beatriz_lider.setGrupo(grupo2);

        atuacaoService.salvar(atuacaoGp2_Beatriz_lider);

        Atuacao atuacaoGp2_Debora = new Atuacao();
        atuacaoGp2_Debora.setInicio(LocalDate.of(2012,1,2));
        atuacaoGp2_Debora.setPessoa(pessoaDebora);
        atuacaoGp2_Debora.setGrupo(grupo2);

        atuacaoService.salvar(atuacaoGp2_Debora);

        Grupo grupo3 = new Grupo();
        grupo3.setNome("Estudo III");
        grupo3.setAtivo(false);
        grupo3.setLider(pessoaCecilia);

        grupoService.salvar(grupo3);

        Atuacao atuacaoGp3_Cecilia_lider = new Atuacao();
        atuacaoGp3_Cecilia_lider.setInicio(LocalDate.of(2012,1,3));
        atuacaoGp3_Cecilia_lider.setTermino(LocalDate.of(2023,1,13));
        atuacaoGp3_Cecilia_lider.setPessoa(pessoaCecilia);
        atuacaoGp3_Cecilia_lider.setGrupo(grupo3);

        atuacaoService.salvar(atuacaoGp3_Cecilia_lider);

        Atuacao atuacaoGp3_Debora = new Atuacao();
        atuacaoGp3_Debora.setInicio(LocalDate.of(2012,1,3));
        atuacaoGp3_Debora.setTermino(LocalDate.of(2023,1,13));
        atuacaoGp3_Debora.setPessoa(pessoaDebora);
        atuacaoGp3_Debora.setGrupo(grupo3);

        atuacaoService.salvar(atuacaoGp3_Debora);

        Grupo grupo4 = new Grupo();
        grupo4.setNome("Estudo IV");
        grupo4.setAtivo(true);
        grupo4.setLider(pessoaBeatriz);

        grupoService.salvar(grupo4);

        Atuacao atuacaoGp4_Beatriz_lider = new Atuacao();
        atuacaoGp4_Beatriz_lider.setInicio(LocalDate.of(2012,1,4));
        atuacaoGp4_Beatriz_lider.setTermino(LocalDate.of(2024,1,14));
        atuacaoGp4_Beatriz_lider.setPessoa(pessoaBeatriz);
        atuacaoGp4_Beatriz_lider.setGrupo(grupo4);

        atuacaoService.salvar(atuacaoGp4_Beatriz_lider);

        Atuacao atuacaoGp4_Cecilia = new Atuacao();
        atuacaoGp4_Cecilia.setInicio(LocalDate.of(2012,1,4));
        atuacaoGp4_Cecilia.setTermino(LocalDate.of(2024,1,14));
        atuacaoGp4_Cecilia.setPessoa(pessoaCecilia);
        atuacaoGp4_Cecilia.setGrupo(grupo4);

        atuacaoService.salvar(atuacaoGp4_Cecilia);

        Atuacao atuacaoGp4_Debora = new Atuacao();
        atuacaoGp4_Debora.setInicio(LocalDate.of(2012,1,4));
        atuacaoGp4_Debora.setTermino(LocalDate.of(2024,1,14));
        atuacaoGp4_Debora.setPessoa(pessoaDebora);
        atuacaoGp4_Debora.setGrupo(grupo4);

        atuacaoService.salvar(atuacaoGp4_Debora);
    }
}
