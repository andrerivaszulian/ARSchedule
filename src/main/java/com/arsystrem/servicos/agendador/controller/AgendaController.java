package com.arsystrem.servicos.agendador.controller;

import com.arsystrem.servicos.agendador.commons.base.controller.BaseController;
import com.arsystrem.servicos.agendador.dto.AgendaDto;
import com.arsystrem.servicos.agendador.entities.agenda.AgendaEntitie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agenda")
public class AgendaController extends BaseController<AgendaEntitie, AgendaDto> {
}
