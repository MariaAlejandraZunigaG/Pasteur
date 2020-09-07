package com.company.buisness.ports.repository;

import com.company.buisness.domain.entities.EspecialidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspecialidadRepository extends JpaRepository<EspecialidadEntity, Long> {

    public EspecialidadEntity findById (String id);
}
