package com.company.buisness.adapter;

import com.company.buisness.domain.entities.CitaEntity;
import com.company.buisness.domain.services.CitaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pasteur/")



public class CitaAdapter  {

    @Autowired
    private CitaServices citaApi;

    @PostMapping ("AgendaCita")
    public ResponseEntity<?> agendaCita(@RequestBody CitaEntity cita) {
        Boolean respuesta = citaApi.guardarCita(cita);
        return new ResponseEntity<>(respuesta, HttpStatus.CREATED);
    }
}
