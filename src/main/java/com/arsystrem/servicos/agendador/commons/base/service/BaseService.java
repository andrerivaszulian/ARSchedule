package com.arsystrem.servicos.agendador.commons.base.service;


import com.arsystrem.servicos.agendador.commons.base.entity.BaseEntity;
import com.arsystrem.servicos.agendador.commons.base.repository.BaseRepository;
import com.arsystrem.servicos.agendador.commons.error.Exception;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class BaseService<T1 extends BaseEntity, T2> {

    @Autowired
    private BaseRepository<T1> repository;

    public Page<T1> findAll(int page, int size, T1 entity) {
        Pageable pageable = PageRequest.of(page, size);

        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreNullValues()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<T1> example = Example.of(entity, matcher);

        return repository.findAll(example, pageable);
    }

    public List<T1> findAllNoPageOrFilter() { return repository.findAll(); }

    public T1 findById(Long id) {
         Optional<T1> optional = repository.findById(id);

         if (optional.isPresent()) {
             return optional.get();
         }
         throw Exception.ofNotFound("Id: " + id.toString() + " não encontrado!");
    }

    public T1 update(Long id, T2 dto) {
        Optional<T1> optional = repository.findById(id);

        if (!optional.isPresent()) {
            throw Exception.ofNotFound("Id: " + id.toString() + " não encontrado!");
        }
        T1 entity = optional.get();

        BeanUtils.copyProperties(dto, entity);

        return repository.save(entity);
    }
    
    public T1 save(T1 entity) {
        return repository.save(entity);
    }

    public List<T1> saveList(List<T1> entities) {
        return repository.saveAll(entities);
    }


}
