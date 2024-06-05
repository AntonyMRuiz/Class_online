package com.riwi.class_online.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.class_online.api.dtos.request.create.ClassRequest;
import com.riwi.class_online.api.dtos.response.ClassResponse;
import com.riwi.class_online.infrastructure.abstract_services.IClassService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/classes")
@Tag(name = "Classes")
public class ClassController implements ControllerGeneric<ClassRequest, ClassResponse>{
    
    @Autowired
    private final IClassService classService;

    @Override
    public ResponseEntity<ClassResponse> create(ClassRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ResponseEntity<ClassResponse> get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public ResponseEntity<Page<ClassResponse>> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @GetMapping
    public ResponseEntity<Page<ClassResponse>> getAllByNameOrDescription(
        @RequestParam(defaultValue = "1") int page, 
        @RequestParam(defaultValue = "0") int size,
        @RequestParam(defaultValue = "") String name,
        @RequestParam(defaultValue = "") String description) {
        return ResponseEntity.ok(this.classService.findByNameOrDescriptionAndActive(page-1, size, name, description));
    }

    @Override
    public ResponseEntity<ClassResponse> update(ClassRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
