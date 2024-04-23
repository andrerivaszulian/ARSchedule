package com.arsystrem.servicos.agendador.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CaixaItensDto {
    private Long id;
    private ProdutoDto produto;
    private Long quantidade;
    private CaixaDto caixa;
    private Long valor;
}
