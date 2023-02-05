package com.arsystrem.servicos.agendador.entities.fornecedores;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import com.arsystrem.servicos.agendador.entities.usuario.Cidade;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "fornecedor")
public class FornecedorEntitie extends BaseEntity {
    private String razao;
    private String cnpj;
    private String fone;
    @ManyToOne
    @JoinColumn(name = "fk_cidade_id")
    private Cidade cidade;
    private String logradouro;
    private Long numero;
}
