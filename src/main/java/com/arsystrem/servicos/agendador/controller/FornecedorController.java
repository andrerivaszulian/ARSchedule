package com.arsystrem.servicos.agendador.controller;

import com.arsystrem.servicos.agendador.commons.base.controller.BaseController;
import com.arsystrem.servicos.agendador.dto.FornecedorDto;
import com.arsystrem.servicos.agendador.entities.fornecedores.FornecedorEntitie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController extends BaseController<FornecedorEntitie, FornecedorDto> {

}
