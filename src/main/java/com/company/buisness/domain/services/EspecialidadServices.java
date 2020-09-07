package com.company.buisness.domain.services;


import com.company.buisness.domain.entities.EspecialidadEntity;
import com.company.buisness.domain.implement.IEspecialidadIMPL;
import com.company.buisness.ports.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class EspecialidadServices implements IEspecialidadIMPL {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @Override
    public Boolean guardarEspecialidad(EspecialidadEntity especialidad) {

        Optional<EspecialidadEntity> especialidades = especialidadRepository.findById(especialidad.getId());


        if (!especialidades.isPresent()){
            especialidadRepository.save(especialidad);
            return true;
        }
        else{
            throw new IllegalStateException("Esta especialidad ya se encuentra registrada");
        }
}

    @Override
    public Boolean modificarEspecialidad(EspecialidadEntity especialidad) {
        return null;
    }

    @Override
    public Boolean eliminarEspecialidad(Long id) {
        return null;
    }
}
