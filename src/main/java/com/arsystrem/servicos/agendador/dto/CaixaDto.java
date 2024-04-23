package com.arsystrem.servicos.agendador.dto;

import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CaixaDto {
    private Long id;
    private LocalDateTime dataCadastro;
    private UsuarioEntitie usuario;
    public Boolean ativo;
}
