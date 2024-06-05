package com.riwi.class_online.infrastructure.helpers.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.riwi.class_online.api.dtos.request.create.StudentRequest;
import com.riwi.class_online.api.dtos.response.StudentDetailsResponse;
import com.riwi.class_online.api.dtos.response.StudentResponse;
import com.riwi.class_online.domain.entities.Student;
import com.riwi.class_online.domain.repositories.ClassRepository;
import com.riwi.class_online.infrastructure.helpers.ServiceHelper;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.IClassMapper;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.IStudentMapper;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class StudentMapper implements IStudentMapper {

    @Autowired
    private final IClassMapper classMapper;

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private final ClassRepository classRepository;
    
    @Override
    public Student requestToEntity(StudentRequest request) {
        return Student.builder()
                .name(request.getName())
                .email(request.getEmail().toLowerCase())
                .active(true)
                .classId(this.serviceHelper.find(request.getClassId(), classRepository, "Class ID"))
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
    public StudentDetailsResponse entityToFullResponse(Student entity) {
        return StudentDetailsResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .classId(this.classMapper.entityToResponse(entity.getClassId()))
                .createdAt(entity.getCreatedAt())
                .active(entity.isActive())
                .build();
    }
    
}
