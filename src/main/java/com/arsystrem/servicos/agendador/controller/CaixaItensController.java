package com.arsystrem.servicos.agendador.controller;

import com.arsystrem.servicos.agendador.commons.base.controller.BaseController;
import com.arsystrem.servicos.agendador.dto.CaixaItensDto;
import com.arsystrem.servicos.agendador.entities.caixa.CaixaItensEntitie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caixaItens")
public class CaixaItensController extends BaseController<CaixaItensEntitie, CaixaItensDto> {
}
