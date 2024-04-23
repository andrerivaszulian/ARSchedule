package com.arsystrem.servicos.agendador.repository;

import com.arsystrem.servicos.agendador.entities.auditoria.AuditoriaEntitie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriaRepository extends JpaRepository<AuditoriaEntitie,Long> {
}
