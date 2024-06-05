package com.riwi.class_online.infrastructure.abstract_services;

import com.riwi.class_online.api.dtos.request.create.LessonRequest;
import com.riwi.class_online.api.dtos.response.LessonResponse;

public interface ILessonService extends ServiceGeneric<LessonRequest, LessonResponse>{
    public LessonResponse disable(Long id);
}
