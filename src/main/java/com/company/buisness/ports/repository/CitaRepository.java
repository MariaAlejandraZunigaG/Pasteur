package com.company.buisness.ports.repository;

import com.company.buisness.domain.entities.CitaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository<CitaEntity,Long> {

}
