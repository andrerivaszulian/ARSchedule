package com.arsystrem.servicos.agendador.entities.auditoria;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@Entity
@Table(name = "auditoria")
@AllArgsConstructor
@NoArgsConstructor
public class AuditoriaEntitie extends BaseEntity {
    private String mensagem;
    private LocalDate dataAuditoria;
    @ManyToOne
    @JoinColumn(name = "fk_usuario_id")
    private UsuarioEntitie usuario;
}
