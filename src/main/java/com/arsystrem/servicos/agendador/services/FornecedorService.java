package com.arsystrem.servicos.agendador.services;

import com.arsystrem.servicos.agendador.commons.base.service.BaseService;
import com.arsystrem.servicos.agendador.dto.FornecedorDto;
import com.arsystrem.servicos.agendador.entities.auditoria.AuditoriaEntitie;
import com.arsystrem.servicos.agendador.entities.fornecedores.FornecedorEntitie;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class FornecedorService extends BaseService<FornecedorEntitie, FornecedorDto> {
    private final AuditoriaService auditoriaService;

    public FornecedorService(AuditoriaService auditoriaService) {
        this.auditoriaService = auditoriaService;
    }

    @Override
    public FornecedorEntitie save(FornecedorEntitie entity) {
        auditoriaService.save(AuditoriaEntitie.builder().mensagem("").dataAuditoria(LocalDate.now()).build());
        return super.save(entity);
    }

    @Override
    public FornecedorEntitie update(Long id, FornecedorDto dto) {
        auditoriaService.save(AuditoriaEntitie.builder().mensagem("").dataAuditoria(LocalDate.now()).build());
        return super.update(id, dto);
    }
}
