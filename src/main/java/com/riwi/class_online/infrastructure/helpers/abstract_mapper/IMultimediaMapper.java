package com.riwi.class_online.infrastructure.helpers.abstract_mapper;

import com.riwi.class_online.api.dtos.request.create.MultimediaRequest;
import com.riwi.class_online.api.dtos.response.MultimediaResponse;
import com.riwi.class_online.domain.entities.Multimedia;

public interface IMultimediaMapper extends MapperGeneric<MultimediaRequest, Multimedia, MultimediaResponse>{

}
