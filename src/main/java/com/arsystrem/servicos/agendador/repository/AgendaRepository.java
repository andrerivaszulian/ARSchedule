package com.arsystrem.servicos.agendador.repository;

import com.arsystrem.servicos.agendador.commons.base.repository.BaseRepository;
import com.arsystrem.servicos.agendador.entities.agenda.AgendaEntitie;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends BaseRepository<AgendaEntitie> {
}
