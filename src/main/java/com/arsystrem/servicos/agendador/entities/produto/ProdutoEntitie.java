package com.arsystrem.servicos.agendador.entities.produto;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "produto")
public class ProdutoEntitie extends BaseEntity {

    private String descricao;

    private Float valor;
}
