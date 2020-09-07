package com.company.buisness.domain.implement;

import com.company.buisness.domain.entities.DoctorEntity;

import java.util.List;

public interface IDoctorIMPL {
    public List<DoctorEntity> findAll();
    public Boolean guardarDoctor();
}
