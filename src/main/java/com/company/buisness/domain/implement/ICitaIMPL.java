package com.company.buisness.domain.implement;


import com.company.buisness.domain.entities.CitaEntity;

import java.util.List;

public interface ICitaIMPL {
    public List<CitaEntity> findAll();
    public Boolean guardarCita(CitaEntity citas);
}
