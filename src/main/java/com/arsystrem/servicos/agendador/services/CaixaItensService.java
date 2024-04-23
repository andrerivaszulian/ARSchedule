package com.arsystrem.servicos.agendador.services;

import com.arsystrem.servicos.agendador.commons.base.service.BaseService;
import com.arsystrem.servicos.agendador.dto.CaixaItensDto;
import com.arsystrem.servicos.agendador.entities.auditoria.AuditoriaEntitie;
import com.arsystrem.servicos.agendador.entities.caixa.CaixaItensEntitie;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CaixaItensService extends BaseService<CaixaItensEntitie, CaixaItensDto> {
    private final AuditoriaService auditoriaService;

    public CaixaItensService(AuditoriaService auditoriaService) {
        this.auditoriaService = auditoriaService;
    }

    @Override
    public CaixaItensEntitie save(CaixaItensEntitie entity) {
        auditoriaService.save(AuditoriaEntitie.builder().mensagem("").dataAuditoria(LocalDate.now()).build());
        return super.save(entity);
    }

    @Override
    public CaixaItensEntitie update(Long id, CaixaItensDto dto) {
        auditoriaService.save(AuditoriaEntitie.builder().mensagem("").dataAuditoria(LocalDate.now()).build());
        return super.update(id, dto);
    }
}
