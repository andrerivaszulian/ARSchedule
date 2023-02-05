package com.arsystrem.servicos.agendador.controller;

import com.arsystrem.servicos.agendador.commons.base.controller.BaseController;
import com.arsystrem.servicos.agendador.dto.ProdutoDto;
import com.arsystrem.servicos.agendador.entities.produto.ProdutoEntitie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController extends BaseController<ProdutoEntitie, ProdutoDto> {
}
