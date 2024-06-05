package com.riwi.class_online.infrastructure.abstract_services;

import org.springframework.data.domain.Page;

public interface AbstractGeneric <RequestDTO, ResponseDTO>{

    ResponseDTO create(RequestDTO request);

    ResponseDTO get(Long id);

    Page<ResponseDTO> getAll(int page, int size);

    ResponseDTO update(Long id, RequestDTO request);

    void delete(Long id);

}

