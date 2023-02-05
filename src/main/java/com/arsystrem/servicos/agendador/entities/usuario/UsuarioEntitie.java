package com.arsystrem.servicos.agendador.entities.usuario;

import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class UsuarioEntitie extends BaseEntity {
   private String nome;
   private String login;
   private String cnh;
   private String cpf;
   private String fone;
   @ManyToOne
   @JoinColumn(name = "fk_cidade_id")
   private Cidade cidade;
   @ManyToOne
   @JoinColumn(name = "fk_tipo_usuario")
   private TipoUsuarioEntite tipoUsuario;
   private String logradouro;
   private Long numero;
   private String senha;
   private LocalDate dataNasc;
   private LocalDate dataCadastro;
   private LocalDate dataAlteração;
}
