package com.riwi.class_online.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.class_online.domain.entities.Multimedia;

@Repository
public interface MultimediaRepository extends JpaRepository<Multimedia, Long> {
    
}
