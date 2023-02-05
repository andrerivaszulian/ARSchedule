package com.arsystrem.servicos.agendador.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FornecedorDto {
    private Long id;
    private String razao;
    private String cnpj;
    private String fone;
}
