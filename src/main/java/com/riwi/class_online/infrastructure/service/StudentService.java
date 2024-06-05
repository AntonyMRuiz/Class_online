package com.riwi.class_online.infrastructure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.class_online.api.dtos.request.create.StudentRequest;
import com.riwi.class_online.api.dtos.response.StudentResponse;
import com.riwi.class_online.domain.entities.Student;
import com.riwi.class_online.domain.repositories.StudentRepository;
import com.riwi.class_online.infrastructure.abstract_services.IStudentService;
import com.riwi.class_online.infrastructure.helpers.ServiceHelper;
import com.riwi.class_online.infrastructure.helpers.abstract_mapper.IStudentMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService {
    
    @Autowired
    private final StudentRepository studentRepository;

    @Autowired
    private final ServiceHelper serviceHelper;

    @Autowired
    private final IStudentMapper studentMapper;

    @Override
    public StudentResponse create(StudentRequest request) {
        Student student = this.studentMapper.requestToEntity(request);
        return this.studentMapper.entityToResponse(this.studentRepository.save(student));
    }

    @Override
    public StudentResponse get(Long id) {
        Student studentData = this.serviceHelper.find(id, studentRepository, "student");
        return this.studentMapper.entityToFullResponse(studentData);
    }

    @Override
    public Page<StudentResponse> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    
    @Override
    public StudentResponse update(Long id, StudentRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Page<StudentResponse> getAllByName(int page, int size, String name) {
        if (page < 0)
            page = 0;
        if (size < 1)
            size = 10;

        return this.studentRepository.findByNameAndActive(PageRequest.of(page, size), name, true)
                .map((student)->this.studentMapper.entityToResponse(student));
    }

    
}
