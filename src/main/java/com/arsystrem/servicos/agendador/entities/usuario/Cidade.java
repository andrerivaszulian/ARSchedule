package com.arsystrem.servicos.agendador.entities.usuario;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "cidade")
public class Cidade extends BaseEntity {
    @ManyToOne()
    @JoinColumn(name = "fk_estado_id")
    private Estado estado;
    private String nome;
}
