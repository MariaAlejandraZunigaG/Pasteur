package com.company.buisness.ports.repository;

import com.company.buisness.domain.entities.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<PacienteEntity,Long> {
}
