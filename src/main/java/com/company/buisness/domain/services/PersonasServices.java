package com.company.buisness.domain.services;

import com.company.buisness.domain.entities.PersonaEntity;
import com.company.buisness.domain.implement.IpersonaIMPL;
import com.company.buisness.ports.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service

public class PersonasServices implements IpersonaIMPL {

    @Autowired
    private PersonaRepository personaRepository;


    @Override
    public Boolean guardarPersona(PersonaEntity personas) {

        PersonaEntity persona = personaRepository.findByIdentification(personas.getIdentification());

        if (persona == null){
            personaRepository.save(personas);
            return true;
        }
        else{
            throw new IllegalStateException("Esta persona ya se encuentra registrada");
        }
    }


    @Override
    public Boolean modificarPersona (PersonaEntity personas) {

        PersonaEntity persona = personaRepository.findByIdentification(personas.getIdentification());

        if (persona == null){
            throw new IllegalStateException("Esta persona no existe registrada");
        }
        else{
            personaRepository.save(personas);
            return true;
        }
    }


    @Override
    public Boolean eliminarPersona(Long id) {
       Optional<PersonaEntity> persona = personaRepository.findById(id);

        if (!persona.isPresent()){
            throw new IllegalStateException("Esta persona no existe registrada");
        }
        else{
            personaRepository.deleteById(id);
            return true;
        }
    }
}
