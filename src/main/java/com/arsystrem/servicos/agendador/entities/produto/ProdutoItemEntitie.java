package com.arsystrem.servicos.agendador.entities.produto;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "produto_item")
public class ProdutoItemEntitie extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "fk_produto")
    private ProdutoEntitie produto;

    @ManyToOne
    @JoinColumn(name = "fk_produto_item")
    private ProdutoEntitie produtoItem;
}

