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
@Table(name = "estoque")
public class EstoqueEntitie extends BaseEntity {

    private Long quantidade;

    @ManyToOne
    @JoinColumn(name = "fk_produto")
    private ProdutoEntitie produto;
}
