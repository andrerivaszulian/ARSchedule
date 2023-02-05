package com.arsystrem.servicos.agendador.repository;

import com.arsystrem.servicos.agendador.commons.base.repository.BaseRepository;
import com.arsystrem.servicos.agendador.entities.produto.ProdutoEntitie;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends BaseRepository<ProdutoEntitie> {
}
