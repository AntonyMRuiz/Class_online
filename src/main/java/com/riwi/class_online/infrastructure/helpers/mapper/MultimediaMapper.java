package com.riwi.class_online.infrastructure.helpers.mapper;

import org.springframework.stereotype.Component;

import com.riwi.class_online.api.dtos.request.create.MultimediaRequest;
import com.riwi.class_online.api.dtos.response.MultimediaResponse;
import com.riwi.class_online.domain.entities.Multimedia;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.IMultimediaMapper;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class MultimediaMapper implements IMultimediaMapper {
    
    @Override
    public Multimedia requestToEntity(MultimediaRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'requestToEntity'");
    }

    @Override
    public MultimediaResponse entityToResponse(Multimedia entity) {
        return MultimediaResponse.builder()
                .id(entity.getId())
                .type(entity.getType())
                .url(entity.getUrl())
                .build();
    }

}
