package com.riwi.class_online.infrastructure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.riwi.class_online.api.dtos.request.create.ClassRequest;
import com.riwi.class_online.api.dtos.response.ClassResponse;
import com.riwi.class_online.domain.entities.ClassEntity;
import com.riwi.class_online.domain.repositories.ClassRepository;
import com.riwi.class_online.infrastructure.abstract_services.IClassService;
import com.riwi.class_online.infrastructure.helpers.ServiceHelper;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.IClassMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClassService implements IClassService {

    @Autowired
    private final ClassRepository classRepository;

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private final IClassMapper classMapper;

    @Override
    public ClassResponse create(ClassRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ClassResponse get(Long id) {
        ClassEntity classEntity = this.serviceHelper.find(id, classRepository, "class");
        return this.classMapper.entityToResponse(classEntity);
    }

    @Override
    public Page<ClassResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public ClassResponse update(Long id, ClassRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Page<ClassResponse> findByNameOrDescriptionAndActive(int page, int size, String name, String description) {
        if (page < 0)
            page = 0;
        if (size < 1)
            size = 10;
        
        return this.classRepository.findByNameOrDescriptionAndActive(null, name, description, false)
                .map((entity)->this.classMapper.entityToResponse(entity));
    }
    
}
