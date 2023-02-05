package com.arsystrem.servicos.agendador.entities.usuario;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "estado")
public class Estado extends BaseEntity {
    private String sigla;
    private String nome;
}
