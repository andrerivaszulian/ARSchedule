package com.arsystrem.servicos.agendador.services;

import com.arsystrem.servicos.agendador.commons.base.service.BaseService;
import com.arsystrem.servicos.agendador.dto.AgendaDto;
import com.arsystrem.servicos.agendador.entities.agenda.AgendaEntitie;
import com.arsystrem.servicos.agendador.entities.auditoria.AuditoriaEntitie;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AgendaService extends BaseService<AgendaEntitie, AgendaDto> {
    private final AuditoriaService auditoriaService;

    public AgendaService(AuditoriaService auditoriaService) {
        this.auditoriaService = auditoriaService;
    }

    @Override
    public AgendaEntitie save(AgendaEntitie entity) {
        auditoriaService.save(AuditoriaEntitie.builder().mensagem("").dataAuditoria(LocalDate.now()).build());
        return super.save(entity);
    }

    @Override
    public AgendaEntitie update(Long id, AgendaDto dto) {
        auditoriaService.save(AuditoriaEntitie.builder().mensagem("").dataAuditoria(LocalDate.now()).build());
        return super.update(id, dto);
    }
}
