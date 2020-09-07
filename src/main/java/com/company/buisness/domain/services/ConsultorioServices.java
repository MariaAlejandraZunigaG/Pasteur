package com.company.buisness.domain.services;

import com.company.buisness.domain.entities.ConsultorioEntity;
import com.company.buisness.domain.implement.IConsultorioIMPL;
import com.company.buisness.ports.repository.ConsultorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service

    public class ConsultorioServices implements IConsultorioIMPL {
    @Autowired
    private ConsultorioRepository consultorioRepository;

    @Override
    public List<ConsultorioEntity> findAll() {
      List<ConsultorioEntity> consult = consultorioRepository.findAll();
        return consult;

    }

    @Override
    public Boolean guardarConsultorio() {
        return null;
    }
}
