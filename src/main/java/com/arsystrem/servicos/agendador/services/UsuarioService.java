package com.arsystrem.servicos.agendador.services;

import com.arsystrem.servicos.agendador.commons.base.service.BaseService;
import com.arsystrem.servicos.agendador.dto.UsuarioDto;
import com.arsystrem.servicos.agendador.entities.auditoria.AuditoriaEntitie;
import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import com.arsystrem.servicos.agendador.repository.UsuarioRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UsuarioService extends BaseService<UsuarioEntitie, UsuarioDto> {
    private final AuditoriaService auditoriaService;
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(AuditoriaService auditoriaService, UsuarioRepository usuarioRepository) {
        this.auditoriaService = auditoriaService;
        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public UsuarioEntitie save(UsuarioEntitie entity) {
        auditoriaService.save(AuditoriaEntitie.builder().mensagem("").dataAuditoria(LocalDate.now()).build());
        return super.save(entity);
    }

    @Override
    public UsuarioEntitie update(Long id, UsuarioDto dto) {
        auditoriaService.save(AuditoriaEntitie.builder().mensagem("").dataAuditoria(LocalDate.now()).build());
        return super.update(id, dto);
    }

    public Page<UsuarioDto> getClientesAniversarianteDoMes(Pageable pageable) {
      return usuarioRepository.getClientesAniversarianteDoMes(pageable).map(UsuarioDto::new);
    }

    public Page<UsuarioDto> getProfissionaisAniversarianteDoMes(Pageable pageable) {
      return usuarioRepository.getProfissionaisAniversarianteDoMes(pageable).map(UsuarioDto::new);
    }
}
