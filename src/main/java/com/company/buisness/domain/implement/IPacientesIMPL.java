package com.company.buisness.domain.implement;

import com.company.buisness.domain.entities.PacienteEntity;

import java.util.List;

public interface IPacientesIMPL {


    List<PacienteEntity> findAll();
    Boolean guardarPaciente(PacienteEntity pacientes);
    public Boolean modificarPaciente(PacienteEntity paciente);
    Boolean eliminarpaciente(Long id);
}
