package com.riwi.class_online.infrastructure.helpers.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.riwi.class_online.api.dtos.request.create.StudentRequest;
import com.riwi.class_online.api.dtos.response.StudentFullResponse;
import com.riwi.class_online.api.dtos.response.StudentResponse;
import com.riwi.class_online.domain.entities.Student;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.IClassMapper;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.IStudentMapper;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class StudentMapper implements IStudentMapper {

    @Autowired
    private final IClassMapper classMapper;
    
    @Override
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

    @Override
    public StudentFullResponse entityToFullResponse(Student entity) {
        return StudentFullResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .classId(this.classMapper.entityToResponse(entity.getClassId()))
                .createdAt(entity.getCreatedAt())
                .active(entity.isActive())
                .build();
    }
    
}
