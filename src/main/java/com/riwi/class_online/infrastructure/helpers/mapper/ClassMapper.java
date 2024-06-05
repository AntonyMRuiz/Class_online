package com.riwi.class_online.infrastructure.helpers.mapper;

import org.springframework.stereotype.Component;

import com.riwi.class_online.api.dtos.request.create.ClassRequest;
import com.riwi.class_online.api.dtos.response.ClassResponse;
import com.riwi.class_online.domain.entities.ClassEntity;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.IClassMapper;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ClassMapper implements IClassMapper{
    
    @Override
    public ClassEntity requestToEntity(ClassRequest request) {
        return ClassEntity.builder()
                .name(request.getName())
                .description(request.getDescription())
                .build();
    }

    @Override
    public ClassResponse entityToResponse(ClassEntity entity) {
        return ClassResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .createdAt(entity.getCreatedAt())
                .active(entity.isActive())
                .build();
    }
    
}
