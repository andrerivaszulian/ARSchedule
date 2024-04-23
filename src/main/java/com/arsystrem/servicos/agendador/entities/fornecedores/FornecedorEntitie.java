package com.arsystrem.servicos.agendador.entities.fornecedores;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import com.arsystrem.servicos.agendador.entities.usuario.Cidade;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Where(clause = "ativo=true")
@Table(name = "fornecedor")
public class FornecedorEntitie extends BaseEntity {

    private String razao;

    private String cnpj;

    private String fone;

    @ManyToOne
    @JoinColumn(name = "fk_cidade")
    private Cidade cidade;

    private String logradouro;

    private Long numero;
}
