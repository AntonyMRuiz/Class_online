package com.riwi.class_online.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.class_online.api.dtos.request.create.StudentRequest;
import com.riwi.class_online.api.dtos.response.StudentResponse;
import com.riwi.class_online.infrastructure.abstract_services.IStudentService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/students")
@Tag(name = "Students")
public class StudentController implements ControllerGeneric<StudentRequest,StudentResponse> {
    
    @Autowired
    private final IStudentService studentService;
    
    public ResponseEntity<StudentResponse> create(StudentRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @GetMapping(path = "/{studentId}")
    public ResponseEntity<StudentResponse> get(
        @PathVariable Long studentId) {
        return ResponseEntity.ok(this.studentService.get(studentId));
    }

    @Override
    public ResponseEntity<Page<StudentResponse>> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @GetMapping
    public ResponseEntity<Page<StudentResponse>> getAllByNameOrDescription(
        @RequestParam(defaultValue = "1") int page, 
        @RequestParam(defaultValue = "10") int size, 
        @RequestParam(defaultValue = "") String name) {
        return ResponseEntity.ok(this.studentService.getAllByName(page, size, name));
    }

    @Override
    public ResponseEntity<StudentResponse> update(StudentRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}