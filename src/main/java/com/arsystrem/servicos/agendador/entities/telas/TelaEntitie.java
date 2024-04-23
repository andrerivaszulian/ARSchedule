package com.arsystrem.servicos.agendador.entities.telas;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Where(clause = "ativo=true")
@Table(name = "telas")
public class TelaEntitie extends BaseEntity {
    private String tela;
}
