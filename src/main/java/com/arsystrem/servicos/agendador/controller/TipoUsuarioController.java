package com.arsystrem.servicos.agendador.controller;

import com.arsystrem.servicos.agendador.commons.base.controller.BaseController;
import com.arsystrem.servicos.agendador.dto.TipoUsuarioDto;
import com.arsystrem.servicos.agendador.entities.usuario.TipoUsuarioEntite;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipoUsuario")
public class TipoUsuarioController extends BaseController<TipoUsuarioEntite, TipoUsuarioDto> {
}
