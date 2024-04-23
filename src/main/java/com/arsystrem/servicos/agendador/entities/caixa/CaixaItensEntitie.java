package com.arsystrem.servicos.agendador.entities.caixa;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import com.arsystrem.servicos.agendador.entities.produto.ProdutoEntitie;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Where(clause = "ativo=true")
@Table(name = "caixa_itens")
public class CaixaItensEntitie extends BaseEntity {

    private Long quantidade;

    @ManyToOne
    @JoinColumn(name = "fk_produto")
    private ProdutoEntitie produto;

    @ManyToOne
    @JoinColumn(name = "fk_caixa")
    private CaixaEntitie caixa;

    private Long valor;
}
