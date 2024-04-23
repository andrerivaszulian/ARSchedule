package com.arsystrem.servicos.agendador.dto;

import com.arsystrem.servicos.agendador.entities.usuario.Cidade;
import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private Long id;
    private String nome;
    private String login;
    private String cnh;
    private String cpf;
    private String fone;
    private Cidade cidade;
    private String logradouro;
    private Long numero;
    private String senha;
    private Boolean ativo;
    private LocalDate dataNasc;
    private LocalDate dataCadastro;
    private LocalDate dataAlteracao;

    public UsuarioDto(UsuarioEntitie usuarioEntitie) {
        this.id = usuarioEntitie.getId();
        this.nome = usuarioEntitie.getNome();
        this.login = usuarioEntitie.getLogin();
        this.cnh = usuarioEntitie.getCnh();
        this.cpf = usuarioEntitie.getCpf();
        this.fone = usuarioEntitie.getFone();
        this.cidade = usuarioEntitie.getCidade();
        this.logradouro = usuarioEntitie.getLogradouro();
        this.numero = usuarioEntitie.getNumero();
        this.senha = usuarioEntitie.getSenha();
        this.ativo = usuarioEntitie.getAtivo();
        this.dataNasc = usuarioEntitie.getDataNasc();
        this.dataCadastro = usuarioEntitie.getDataCadastro();
        this.dataAlteracao = usuarioEntitie.getDataAlteracao();
    }
}
