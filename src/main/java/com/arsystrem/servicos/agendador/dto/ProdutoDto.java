package com.arsystrem.servicos.agendador.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoDto {
    private Long id;
    private String descricao;
    private Float valor;
    private Boolean ativo;
}
