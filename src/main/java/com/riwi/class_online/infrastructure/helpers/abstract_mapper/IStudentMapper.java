package com.riwi.class_online.infrastructure.helpers.abstract_mapper;

import com.riwi.class_online.api.dtos.request.create.StudentRequest;
import com.riwi.class_online.api.dtos.response.StudentFullResponse;
import com.riwi.class_online.api.dtos.response.StudentResponse;
import com.riwi.class_online.domain.entities.Student;

public interface IStudentMapper extends MapperGeneric<StudentRequest, Student, StudentResponse> {
    public StudentFullResponse entityToFullResponse(Student entity);
}
