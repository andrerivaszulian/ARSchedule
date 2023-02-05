package com.arsystrem.servicos.agendador.controller;

import com.arsystrem.servicos.agendador.commons.base.controller.BaseController;
import com.arsystrem.servicos.agendador.dto.CaixaDto;
import com.arsystrem.servicos.agendador.entities.caixa.CaixaEntitie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caixa")
public class CaixaController extends BaseController<CaixaEntitie, CaixaDto> {
}
