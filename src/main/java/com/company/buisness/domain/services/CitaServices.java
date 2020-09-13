package com.company.buisness.domain.services;

import com.company.buisness.domain.entities.CitaEntity;
import com.company.buisness.domain.implement.ICitaIMPL;
import com.company.buisness.ports.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service

public class CitaServices implements ICitaIMPL {

    @Autowired
    private CitaRepository citaR;


    @Override
    public List<CitaEntity> findAll() {
        return null;
    }

    @Override
    public Boolean guardarCita(CitaEntity citas) {

        citaR.save(citas);
        return true;
    }
}
