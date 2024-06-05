package com.riwi.class_online.infrastructure.helpers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.riwi.class_online.util.exceptions.BadIdException;

@Component
public class ServiceHelper {
    public <Entity, ID> Entity find(ID id, JpaRepository<Entity, ID> repository, String name){
        return repository.findById(id)
                    .orElseThrow(() -> new BadIdException(name));
    }
}
