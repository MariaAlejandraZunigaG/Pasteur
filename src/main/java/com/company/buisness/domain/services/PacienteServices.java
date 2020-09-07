package com.company.buisness.domain.services;

import com.company.buisness.domain.entities.PacienteEntity;
import com.company.buisness.domain.implement.IPacientesIMPL;
import com.company.buisness.ports.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service

public class PacienteServices implements IPacientesIMPL {

    @Autowired
    private PacienteRepository pacienteRepository;


    /*@Override
    public List<PacienteEntity> findAll() {
        List<PacienteEntity> paciente = pacienteRepository.findAll();
        return paciente;
        }*/

    @Override
    public List<PacienteEntity> findAll() {
        return null;
    }

    @Override
    public Boolean guardarPaciente(PacienteEntity pacientes) {

        Optional<PacienteEntity> paciente = pacienteRepository.findById(pacientes.getId());

        if (!paciente.isPresent()){
            pacienteRepository.save(pacientes);
            return true;
        }
        else {
            throw new IllegalStateException("Este paciente ya se encuentra Registrado");
        }
    }



    /*@Override
        public Boolean guardarPaciente(PacienteEntity pacientes){

        Optional<PacienteEntity> paciente = pacienteRepository.findById(pacientes.getId());

        if (paciente == null){
            pacienteRepository.save(pacientes);
            return true;
        }
        else {
            throw new IllegalStateException("Este paciente ya se encuentra Registrado");
        }
    }*/

    @Override
    public Boolean modificarPaciente(PacienteEntity pacientes) {

        Optional<PacienteEntity> paciente = pacienteRepository.findById(pacientes.getId());

        if (paciente == null){
            throw new IllegalStateException("Este paciente no existe registrado");
        }
        else{
            pacienteRepository.save(pacientes);
            return true;
        }
    }
    @Override
    public Boolean eliminarpaciente(Long id) {
        Optional<PacienteEntity> paciente = pacienteRepository.findById(id);

        if (!paciente.isPresent()){
            throw new IllegalStateException("Este paciente no existe registrado");
        }
        else{
            pacienteRepository.deleteById(id);
            return true;
        }
    }

    }

