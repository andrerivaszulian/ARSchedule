package com.arsystrem.servicos.agendador.services;

import com.arsystrem.servicos.agendador.commons.base.service.BaseService;
import com.arsystrem.servicos.agendador.dto.ProdutoDto;
import com.arsystrem.servicos.agendador.entities.auditoria.AuditoriaEntitie;
import com.arsystrem.servicos.agendador.entities.produto.ProdutoEntitie;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProdutoService extends BaseService<ProdutoEntitie, ProdutoDto> {
    private final AuditoriaService auditoriaService;

    public ProdutoService(AuditoriaService auditoriaService) {
        this.auditoriaService = auditoriaService;
    }

    @Override
    public ProdutoEntitie save(ProdutoEntitie entity) {
        auditoriaService.save(AuditoriaEntitie.builder().mensagem("").dataAuditoria(LocalDate.now()).build());
        return super.save(entity);
    }

    @Override
    public ProdutoEntitie update(Long id, ProdutoDto dto) {
        auditoriaService.save(AuditoriaEntitie.builder().mensagem("").dataAuditoria(LocalDate.now()).build());
        return super.update(id, dto);
    }

}
