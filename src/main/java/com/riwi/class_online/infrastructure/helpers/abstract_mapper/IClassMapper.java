package com.riwi.class_online.infrastructure.helpers.abstract_mapper;

import com.riwi.class_online.api.dtos.request.create.ClassRequest;
import com.riwi.class_online.api.dtos.response.ClassResponse;
import com.riwi.class_online.domain.entities.ClassEntity;

public interface IClassMapper extends MapperGeneric<ClassRequest, ClassEntity, ClassResponse> {
    
}
