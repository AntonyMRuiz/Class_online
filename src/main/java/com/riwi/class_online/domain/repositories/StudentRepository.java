package com.riwi.class_online.domain.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.class_online.domain.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Page<Student> findByNameAndActive(PageRequest pageRequest, String name, boolean active);
}
