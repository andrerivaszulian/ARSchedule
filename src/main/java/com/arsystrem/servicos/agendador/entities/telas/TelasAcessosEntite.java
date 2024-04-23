package com.arsystrem.servicos.agendador.entities.telas;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
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
@Table(name = "telas_acessos")
public class TelasAcessosEntite extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "fk_tela")
    private TelaEntitie tela;

    @ManyToOne
    @JoinColumn(name = "fk_acessos")
    private AcessosEntite acessos;
}
