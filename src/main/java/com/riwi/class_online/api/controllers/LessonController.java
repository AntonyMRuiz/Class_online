package com.riwi.class_online.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.class_online.api.dtos.request.create.LessonRequest;
import com.riwi.class_online.api.dtos.response.LessonResponse;
import com.riwi.class_online.infrastructure.abstract_services.ILessonService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/lessons")
@Tag(name = "Lessons")
public class LessonController implements ControllerGeneric<LessonRequest, LessonResponse>{
    
    @Autowired
    private final ILessonService lessonService;
    
    @Override
    public ResponseEntity<LessonResponse> create(
        @Validated @RequestBody LessonRequest request) {
        return ResponseEntity.ok(this.lessonService.create(request));
    }

    @Override
    public ResponseEntity<LessonResponse> get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public ResponseEntity<Page<LessonResponse>> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public ResponseEntity<LessonResponse> update(LessonRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @PostMapping(path = "/{lessonId}/disable")
    public ResponseEntity<LessonResponse> lessonDisable(
        @PathVariable Long lessonId) {
        return ResponseEntity.ok(this.lessonService.disable(lessonId));
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
