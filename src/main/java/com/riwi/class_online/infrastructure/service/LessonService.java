package com.riwi.class_online.infrastructure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.class_online.api.dtos.request.create.LessonRequest;
import com.riwi.class_online.api.dtos.response.LessonResponse;
import com.riwi.class_online.domain.entities.Lesson;
import com.riwi.class_online.domain.repositories.LessonRepository;
import com.riwi.class_online.infrastructure.abstract_services.ILessonService;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.ILessonMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LessonService implements ILessonService {

    @Autowired
    private final LessonRepository lessonRepository;

    @Autowired
    private final ILessonMapper lessonMapper;

    @Override
    public LessonResponse create(LessonRequest request) {
        Lesson lesson = this.lessonMapper.requestToEntity(request);
        Lesson lessonData = this.lessonRepository.save(lesson);

        if (!request.getMultimedias().isEmpty() && request.getMultimedias() != null) {
            Lesson lessonAndMultimedia = this.lessonMapper.requestToEntityAndMultimedia(request, lesson.getId());
            return this.lessonMapper.entityToResponse(lessonAndMultimedia);
        }

        return this.lessonMapper.entityToResponse(lessonData);
    }

    @Override
    public LessonResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Page<LessonResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public LessonResponse update(Long id, LessonRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
