package com.arsystrem.servicos.agendador.entities.telas;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import com.arsystrem.servicos.agendador.entities.usuario.TipoUsuarioEntite;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "acessos")
public class AcessosEntite extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "fk_tipo_usuario")
    private TipoUsuarioEntite tipoUsuarioEntite;

    private Boolean alterar;
    private Boolean visualizar;
    private Boolean incluir;
}
