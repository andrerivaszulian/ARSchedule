package com.arsystrem.servicos.agendador.repository;

import com.arsystrem.servicos.agendador.commons.base.repository.BaseRepository;
import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<UsuarioEntitie> {

    @Query(value = " SELECT u " +
                   "   FROM UsuarioEntitie u " +
                   "  WHERE EXTRACT(MONTH FROM u.dataNasc) = EXTRACT(MONTH FROM current_date) " +
                   "    AND u.tipoUsuario.tipo = 'CLIENTE' ")
    Page<UsuarioEntitie> getClientesAniversarianteDoMes(Pageable pageable);
    @Query(value = "SELECT u " +
                   "  FROM UsuarioEntitie u " +
                   " WHERE EXTRACT(MONTH FROM u.dataNasc) = EXTRACT(MONTH FROM current_date)  " +
                   "   AND u.tipoUsuario.tipo = 'PROFISSIONAL' ")
    Page<UsuarioEntitie> getProfissionaisAniversarianteDoMes(Pageable pageable);
}
