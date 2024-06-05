package com.riwi.class_online.infrastructure.helpers.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.riwi.class_online.api.dtos.request.create.LessonRequest;
import com.riwi.class_online.api.dtos.response.LessonResponse;
import com.riwi.class_online.domain.entities.Lesson;
import com.riwi.class_online.domain.entities.Multimedia;
import com.riwi.class_online.domain.repositories.ClassRepository;
import com.riwi.class_online.domain.repositories.LessonRepository;
import com.riwi.class_online.infrastructure.helpers.ServiceHelper;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.IClassMapper;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.ILessonMapper;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.IMultimediaMapper;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class LessonMaper implements ILessonMapper {

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private final ClassRepository classRepository;

    @Autowired
    private final IClassMapper classMapper;

    @Autowired
    private final IMultimediaMapper multimediaMapper;

    @Autowired
    private final LessonRepository lessonRepository;

    @Override
    public Lesson requestToEntity(LessonRequest request) {
        return Lesson.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .classId(this.serviceHelper.find(request.getClassId(), classRepository, "class"))
                .build();
    }

    @Override
    public LessonResponse entityToResponse(Lesson entity) {
        return LessonResponse.builder()
                .title(entity.getTitle())
                .content(entity.getContent())
                .classId(this.classMapper.entityToResponse((entity.getClassId())))
                .multimedias(entity.getMultimedias().stream()
                        .map((media) -> {
                            return this.multimediaMapper.entityToResponse(media);
                        })
                        .collect(Collectors.toList()))
                .build();
    }

    @Override
    public Lesson requestToEntityAndMultimedia(LessonRequest request, Long lessonId) {
        List<Multimedia> multimedias = request.getMultimedias().stream()
                .map((multimedia) -> {
                    Multimedia mediaEntity = multimediaMapper.requestToEntity(multimedia);
                    mediaEntity.setLessonId(this.serviceHelper.find(lessonId, lessonRepository, "Lesson"));
                    return mediaEntity;
                })
                .collect(Collectors.toList());

        return Lesson.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .classId(this.serviceHelper.find(request.getClassId(), classRepository, "class"))
                .multimedias(multimedias)
                .build();
    }

}
