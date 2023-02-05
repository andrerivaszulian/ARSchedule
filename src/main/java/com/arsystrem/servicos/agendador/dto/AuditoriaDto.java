package com.arsystrem.servicos.agendador.dto;

import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class AuditoriaDto {
    private Long id;
    private String mensagem;
    private LocalDate dataAuditoria;
    private UsuarioEntitie usuario;
}
