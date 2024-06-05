package com.riwi.class_online.infrastructure.helpers.abstract_mapper;

import com.riwi.class_online.api.dtos.request.create.LessonRequest;
import com.riwi.class_online.api.dtos.response.LessonResponse;
import com.riwi.class_online.domain.entities.Lesson;

public interface ILessonMapper extends MapperGeneric<LessonRequest, Lesson, LessonResponse> {
    public Lesson requestToEntityAndMultimedia(LessonRequest request, Long lessonId);
}
