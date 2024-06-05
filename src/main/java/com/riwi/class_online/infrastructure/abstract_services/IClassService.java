package com.riwi.class_online.infrastructure.abstract_services;

import org.springframework.data.domain.Page;

import com.riwi.class_online.api.dtos.request.create.ClassRequest;
import com.riwi.class_online.api.dtos.response.ClassResponse;

public interface IClassService extends ServiceGeneric<ClassRequest, ClassResponse>{
    Page<ClassResponse> findByNameOrDescriptionAndActive(int page, int size, String name,String description);
}
