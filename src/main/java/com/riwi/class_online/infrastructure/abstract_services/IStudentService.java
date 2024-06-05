package com.riwi.class_online.infrastructure.abstract_services;

import org.springframework.data.domain.Page;

import com.riwi.class_online.api.dtos.request.create.StudentRequest;
import com.riwi.class_online.api.dtos.response.StudentResponse;

public interface IStudentService extends ServiceGeneric<StudentRequest, StudentResponse> {
    public Page<StudentResponse> getAllByName(int page, int size, String name);
}
