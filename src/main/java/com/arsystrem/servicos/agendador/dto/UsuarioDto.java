package com.arsystrem.servicos.agendador.dto;

import com.arsystrem.servicos.agendador.entities.usuario.Cidade;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
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
    private LocalDate dataAlteração;
}
