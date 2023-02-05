package com.arsystrem.servicos.agendador.services;

import com.arsystrem.servicos.agendador.commons.base.service.BaseService;
import com.arsystrem.servicos.agendador.dto.UsuarioDto;
import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import com.arsystrem.servicos.agendador.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService extends BaseService<UsuarioEntitie, UsuarioDto> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioDto> getClientesAniversarianteDoMes() {
        //usuarioRepository.getClientesAniversarianteDoMes();
      return null;
    }

    public List<UsuarioDto> getProfissionaisAniversarianteDoMes() {
        //usuarioRepository.getProfissionaisAniversarianteDoMes();
      return null;
    }
}
