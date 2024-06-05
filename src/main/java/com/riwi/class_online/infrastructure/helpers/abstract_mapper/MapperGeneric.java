package com.riwi.class_online.infrastructure.helpers.abstract_mapper;

public interface MapperGeneric <RequestDTO, Entity ,ResponseDTO>{
    
    Entity requestToEntity(RequestDTO request);

    ResponseDTO entityToResponse(Entity entity);
}