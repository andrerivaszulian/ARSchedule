package com.arsystrem.servicos.agendador.controller;

import com.arsystrem.servicos.agendador.commons.api.ApiReturn;
import com.arsystrem.servicos.agendador.commons.base.controller.BaseController;
import com.arsystrem.servicos.agendador.commons.error.Exception;
import com.arsystrem.servicos.agendador.dto.UsuarioDto;
import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import com.arsystrem.servicos.agendador.services.UsuarioService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuario")
public class UsuarioController extends BaseController<UsuarioEntitie, UsuarioDto> {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/ProfissionaisAniversarianteDoMes")
    public ResponseEntity<Object> getProfissionaisAniversarianteDoMes(@PageableDefault(page = 0, size = 10) Pageable pageable){
        try {
            return ResponseEntity.ok(ApiReturn.of(usuarioService.getProfissionaisAniversarianteDoMes(pageable)));
        } catch (Exception e) {
            return ResponseEntity.status(e.getErrorCode()).body(ApiReturn.ofKaspper(e));
        }
    }
    @GetMapping("/ClientesAniversarianteDoMes")
    public ResponseEntity<Object> getClientesAniversarianteDoMes(@PageableDefault(page = 0, size = 10) Pageable pageable){

        try {
            return ResponseEntity.ok(ApiReturn.of(usuarioService.getClientesAniversarianteDoMes(pageable)));
        } catch (Exception e) {
            return ResponseEntity.status(e.getErrorCode()).body(ApiReturn.ofKaspper(e));
        }
    }

}
