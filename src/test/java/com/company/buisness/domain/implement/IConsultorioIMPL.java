package com.company.buisness.domain.implement;

import com.company.buisness.domain.entities.ConsultorioEntity;
import com.company.buisness.ports.repository.ConsultorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class IConsultorioIMPL {
    @Autowired
    private ConsultorioRepository consultorioRepository;


    public List<ConsultorioEntity> getAllConsultorio(){
        return (List<ConsultorioEntity>) consultorioRepository.findAll();
    }
}
