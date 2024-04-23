package com.arsystrem.servicos.agendador.commons.base.controller;


import com.arsystrem.servicos.agendador.commons.api.ApiReturn;
import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import com.arsystrem.servicos.agendador.commons.base.service.BaseService;
import com.arsystrem.servicos.agendador.commons.error.Exception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
public class BaseController<T1 extends BaseEntity, T2> {

    @Autowired
    private BaseService<T1, T2> service;

    @PostMapping("/filter")
    public ResponseEntity<?> findAll(@PageableDefault(page = 0, size = 10) Pageable pageable, @RequestBody T1 entity) {
        try {
            return ResponseEntity.ok(ApiReturn.of(service.findAll(pageable, entity)));
        } catch (Exception e) {
            return ResponseEntity.status(e.getErrorCode()).body(ApiReturn.ofKaspper(e));
        }
    }

    @GetMapping()
    public ResponseEntity<?> findAll() {
        try {
            return ResponseEntity.ok(ApiReturn.of(service.findAllNoPageOrFilter()));
        } catch (Exception e) {
            return ResponseEntity.status(e.getErrorCode()).body(ApiReturn.ofKaspper(e));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(ApiReturn.of(service.findById(id)));
        } catch (Exception e) {
            return ResponseEntity.status(e.getErrorCode()).body(ApiReturn.ofKaspper(e));
        }
    }

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody T1 entity) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(ApiReturn.of(service.save(entity)));
        } catch (Exception e) {
            return ResponseEntity.status(e.getErrorCode()).body(ApiReturn.ofKaspper(e));
        }
    }

    @PostMapping("/list")
    public ResponseEntity<?> saveList(@RequestBody List<T1> entities) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(ApiReturn.of(service.saveList(entities)));
        } catch (Exception e) {
            return ResponseEntity.status(e.getErrorCode()).body(ApiReturn.ofKaspper(e));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody T2 entityDto) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(ApiReturn.of(service.update(id, entityDto)));
        } catch (Exception e) {
            return ResponseEntity.status(e.getErrorCode()).body(ApiReturn.ofKaspper(e));
        }
    }

}

