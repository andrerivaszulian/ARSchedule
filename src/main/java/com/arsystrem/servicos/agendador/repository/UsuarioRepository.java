package com.arsystrem.servicos.agendador.repository;

import com.arsystrem.servicos.agendador.commons.base.repository.BaseRepository;
import com.arsystrem.servicos.agendador.dto.UsuarioDto;
import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends BaseRepository<UsuarioEntitie> {

//    @Query(value = " SELECT u " +
//                   "   FROM UsuarioEntite u " +
//                   "  WHERE EXTRACT(MONTH FROM u.dataNasc) = EXTRACT(MONTH FROM current_date) " +
//                   "    AND ")
//    List<UsuarioEntitie> getClientesAniversarianteDoMes();
//    @Query(value = "SELECT u FROM UsuarioEntite u WHERE EXTRACT(MONTH FROM u.dataNasc) = EXTRACT(MONTH FROM current_date)  ")
//    List<UsuarioEntitie> getProfissionaisAniversarianteDoMes();
}
