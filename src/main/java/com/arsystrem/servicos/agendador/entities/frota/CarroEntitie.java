package com.arsystrem.servicos.agendador.entities.frota;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Where(clause = "ativo=true")
@Table(name = "carro")
public class CarroEntitie extends BaseEntity {

    private String placa;

    private String renavan;

    private String modelo;

    private String marca;

    private Long ano;
}
