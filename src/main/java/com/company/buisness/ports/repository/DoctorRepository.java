package com.company.buisness.ports.repository;

import com.company.buisness.domain.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity,Long> {

}
