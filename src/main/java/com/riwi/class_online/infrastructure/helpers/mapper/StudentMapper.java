package com.riwi.class_online.infrastructure.helpers.mapper;

import org.springframework.stereotype.Component;

import com.riwi.class_online.api.dtos.request.create.StudentRequest;
import com.riwi.class_online.api.dtos.response.StudentResponse;
import com.riwi.class_online.domain.entities.Student;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.IStudentMapper;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class StudentMapper implements IStudentMapper {@Override
    public Student requestToEntity(StudentRequest request) {
        return Student.builder()
                .build();
    }

    @Override
    public StudentResponse entityToResponse(Student entity) {
        return StudentResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .createdAt(entity.getCreatedAt())
                .active(entity.isActive())
                .build();
    }
    
}
