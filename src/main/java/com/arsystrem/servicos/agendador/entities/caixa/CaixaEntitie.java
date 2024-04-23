package com.arsystrem.servicos.agendador.entities.caixa;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Where(clause = "ativo=true")
@Table(name = "caixa")
public class CaixaEntitie extends BaseEntity {

  private LocalDateTime dataCadastro;

  @ManyToOne
  @JoinColumn(name = "fk_usuario")
  private UsuarioEntitie usuario;
}
