package com.arsystrem.servicos.agendador.dto;

import com.arsystrem.servicos.agendador.entities.usuario.Cidade;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfissionalDto {
    private Long id;
    private String nome;
    private String cnpj;
    private String fone;
    private boolean ativo;
    private Cidade cidade;
    private String logradouro;
    private Long numero;
}
