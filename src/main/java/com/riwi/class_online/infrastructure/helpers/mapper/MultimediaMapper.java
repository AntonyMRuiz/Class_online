package com.riwi.class_online.infrastructure.helpers.mapper;

import org.springframework.stereotype.Component;

import com.riwi.class_online.api.dtos.request.create.MultimediaRequest;
import com.riwi.class_online.api.dtos.response.MultimediaResponse;
import com.riwi.class_online.domain.entities.Multimedia;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.IMultimediaMapper;
import com.riwi.class_online.util.enums.MultimediaType;
import com.riwi.class_online.util.exceptions.BadRequestException;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class MultimediaMapper implements IMultimediaMapper {

    
    @Override
    public Multimedia requestToEntity(MultimediaRequest request) {
        try {
            MultimediaType type = MultimediaType.valueOf(request.getType());
            
            return Multimedia.builder()
                .type(type)
                .url(request.getUrl())
                .build();

        } catch (Exception e) {
            throw new BadRequestException("Type is invalid");
        }

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
