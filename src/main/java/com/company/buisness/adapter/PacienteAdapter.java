package com.company.buisness.adapter;

import com.company.buisness.domain.entities.PacienteEntity;
import com.company.buisness.domain.services.PacienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pasteur/")


public class PacienteAdapter {

        @Autowired
        private PacienteServices pacienteApi;

    @GetMapping("getPacientes")
    public ResponseEntity<?> getPacientes() {

        List<PacienteEntity> paciente = pacienteApi.findAll();
        return new ResponseEntity<>(paciente, HttpStatus.OK);
    }

    @PostMapping("guardarPaciente")
    public ResponseEntity<?> guardarPaciente(@RequestBody PacienteEntity paciente) {

        Boolean status = pacienteApi.guardarPaciente(paciente);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @PutMapping ("modificarpaciente")
    public ResponseEntity<?> modificarpaciente(@RequestBody PacienteEntity paciente) {

        Boolean status = pacienteApi.modificarPaciente(paciente);
        return new ResponseEntity<>(status, HttpStatus.ACCEPTED);
    }
    @DeleteMapping (path = "eliminarPaciente/{id}")
    public ResponseEntity<?> eliminarpaciente(@PathVariable("id")Long id) {

        Boolean status = pacienteApi.eliminarpaciente(id);
        return new ResponseEntity<>(status, HttpStatus.ACCEPTED);
    }
}
