package com.company.buisness.ports.repository;

import com.company.buisness.domain.entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {

    public PersonaEntity findByIdentification(String identification);
}
