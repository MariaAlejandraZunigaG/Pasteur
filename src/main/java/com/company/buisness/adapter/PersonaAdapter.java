package com.company.buisness.adapter;

import com.company.buisness.domain.entities.PersonaEntity;
import com.company.buisness.domain.services.PersonasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping("/api/pasteur/")

    public class PersonaAdapter {
        @Autowired
        private PersonasServices personaApi;

        @PostMapping("guardarPersona")
        public ResponseEntity<?> guardarPersona(@RequestBody PersonaEntity persona) {

            Boolean status = personaApi.guardarPersona(persona);
            return new ResponseEntity<>(status, HttpStatus.CREATED);
        }
        @PutMapping ("modificarpersona")
        public ResponseEntity<?> modificarpersona(@RequestBody PersonaEntity persona) {

            Boolean status = personaApi.modificarPersona(persona);
            return new ResponseEntity<>(status, HttpStatus.ACCEPTED);
        }

    @DeleteMapping (path = "eliminarPersona/{id}")
    public ResponseEntity<?> eliminarpersona(@PathVariable("id")Long id) {

        Boolean status = personaApi.eliminarPersona(id);
        return new ResponseEntity<>(status, HttpStatus.ACCEPTED);
    }
    }
