package com.arsystrem.servicos.agendador.entities.frota;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import com.arsystrem.servicos.agendador.entities.fornecedores.FornecedorEntitie;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "manutencao")
public class ManutencaoEntitie extends BaseEntity {
    @OneToOne
    private CarroEntitie carro;
    private String descricao;
    private Double valor;
    @OneToOne
    private FornecedorEntitie fornecedor;
}
