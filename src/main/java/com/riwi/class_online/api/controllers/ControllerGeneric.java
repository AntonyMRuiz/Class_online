package com.riwi.class_online.api.controllers;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

public interface ControllerGeneric <RequestDTO, ResponseDTO> {

    public ResponseEntity<ResponseDTO> create(RequestDTO request);

    public ResponseEntity<ResponseDTO> get(Long id);

    public ResponseEntity<Page<ResponseDTO>> getAll(int page, int size);

    public ResponseEntity<ResponseDTO> update(RequestDTO request, Long id);

    public ResponseEntity<Void> delete(Long id);
    
}