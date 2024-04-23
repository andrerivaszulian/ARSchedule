package com.arsystrem.servicos.agendador.entities.agenda;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Where(clause = "ativo=true")
@Table(name = "agenda")
public class AgendaEntitie extends BaseEntity {

    private LocalDateTime data;

    @ManyToOne
    @JoinColumn(name = "fk_profissional_id")
    private UsuarioEntitie profissional;

    @ManyToOne
    @JoinColumn(name = "fk_cliente_id")
    private UsuarioEntitie cliente;
}
