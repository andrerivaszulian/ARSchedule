package com.arsystrem.servicos.agendador.dto;

import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class AgendaDto {
    private Long id;
    private LocalDate data;
    private UsuarioEntitie profissional;
    private UsuarioEntitie cliente;
}
