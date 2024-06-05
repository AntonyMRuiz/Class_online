package com.riwi.class_online.domain.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.class_online.domain.entities.ClassEntity;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity, Long> {
    Page<ClassEntity> findByNameOrDescriptionAndActive(PageRequest pageRequest, String name,String description, boolean active);
}
