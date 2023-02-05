package com.arsystrem.servicos.agendador.services;

import com.arsystrem.servicos.agendador.commons.base.service.BaseService;
import com.arsystrem.servicos.agendador.dto.ProdutoDto;
import com.arsystrem.servicos.agendador.entities.produto.ProdutoEntitie;

import org.springframework.stereotype.Service;

@Service
public class ProdutoService extends BaseService<ProdutoEntitie, ProdutoDto> {
}
