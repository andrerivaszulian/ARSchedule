package com.arsystrem.servicos.agendador.entities.caixa;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "caixa")
public class CaixaEntitie extends BaseEntity {

}
