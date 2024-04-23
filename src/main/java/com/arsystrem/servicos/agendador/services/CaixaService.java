package com.arsystrem.servicos.agendador.services;

import com.arsystrem.servicos.agendador.commons.base.service.BaseService;
import com.arsystrem.servicos.agendador.dto.CaixaDto;
import com.arsystrem.servicos.agendador.entities.auditoria.AuditoriaEntitie;
import com.arsystrem.servicos.agendador.entities.caixa.CaixaEntitie;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CaixaService extends BaseService<CaixaEntitie, CaixaDto> {
    private final AuditoriaService auditoriaService;

    public CaixaService(AuditoriaService auditoriaService) {
        this.auditoriaService = auditoriaService;
    }

    @Override
    public CaixaEntitie save(CaixaEntitie entity) {
        auditoriaService.save(AuditoriaEntitie.builder().mensagem("").dataAuditoria(LocalDate.now()).build());
        return super.save(entity);
    }

    @Override
    public CaixaEntitie update(Long id, CaixaDto dto) {
        auditoriaService.save(AuditoriaEntitie.builder().mensagem("").dataAuditoria(LocalDate.now()).build());
        return super.update(id, dto);
    }
}
