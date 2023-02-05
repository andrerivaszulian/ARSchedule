package com.arsystrem.servicos.agendador.controller;

import com.arsystrem.servicos.agendador.commons.api.ApiReturn;
import com.arsystrem.servicos.agendador.commons.base.controller.BaseController;
import com.arsystrem.servicos.agendador.commons.error.Exception;
import com.arsystrem.servicos.agendador.dto.UsuarioDto;
import com.arsystrem.servicos.agendador.entities.usuario.UsuarioEntitie;
import com.arsystrem.servicos.agendador.services.UsuarioService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuario")
public class UsuarioController extends BaseController<UsuarioEntitie, UsuarioDto> {
    @Autowired
    private UsuarioService usuarioService;

//    @GetMapping()
//    public ResponseEntity<?> getProfissionaisAniversarianteDoMes(){
//        try {
//            return ResponseEntity.ok(ApiReturn.of(usuarioService.getProfissionaisAniversarianteDoMes()));
//        } catch (Exception e) {
//            return ResponseEntity.status(e.getErrorCode()).body(ApiReturn.ofKaspper(e));
//        }
//    }
//    @GetMapping()
//    public ResponseEntity<?> getClientesAniversarianteDoMes(){
//
//        try {
//            return ResponseEntity.ok(ApiReturn.of(usuarioService.getClientesAniversarianteDoMes()));
//        } catch (Exception e) {
//            return ResponseEntity.status(e.getErrorCode()).body(ApiReturn.ofKaspper(e));
//        }
//    }

}
