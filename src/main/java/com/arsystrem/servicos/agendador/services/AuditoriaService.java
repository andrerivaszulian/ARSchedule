package com.arsystrem.servicos.agendador.services;

import com.arsystrem.servicos.agendador.entities.auditoria.AuditoriaEntitie;
import com.arsystrem.servicos.agendador.repository.AuditoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditoriaService {
    @Autowired
    private AuditoriaRepository auditoriaRepository;

    public void save(AuditoriaEntitie auditoriaEntitie) {
        auditoriaRepository.save(auditoriaEntitie);
    }
}
