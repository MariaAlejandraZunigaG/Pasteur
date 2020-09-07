package com.company.buisness.domain.services;

import com.company.buisness.domain.entities.ConsultorioEntity;
import com.company.buisness.domain.entities.DoctorEntity;
import com.company.buisness.domain.entities.EspecialidadEntity;
import com.company.buisness.domain.implement.IDoctorIMPL;
import com.company.buisness.ports.repository.ConsultorioRepository;
import com.company.buisness.ports.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service

    public class DoctorServices implements IDoctorIMPL{
    @Autowired
    private DoctorRepository DoctorRepository;

    @Override
    public List<DoctorEntity> findAll() {
        List<DoctorEntity> doctor = DoctorRepository.findAll();
        return doctor;
    }

    @Override
    public Boolean guardarDoctor() {
        return null;
    }
}

