package com.company.buisness.adapter;

import com.company.buisness.domain.entities.EspecialidadEntity;
import com.company.buisness.domain.services.EspecialidadServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pasteur/")

public class EspecialidadAdapter {

    @Autowired
    private EspecialidadServices EspecialidadApi;

        @PostMapping("guardarEspecialidad")
        public ResponseEntity<?> guardarespecialidad(@RequestBody EspecialidadEntity especialidad) {

            Boolean status = EspecialidadApi.guardarEspecialidad(especialidad);
            return new ResponseEntity<>(status, HttpStatus.CREATED);
        }
        @PutMapping("modificarEspecialidad")
        public ResponseEntity<?> modificarEspecialidad(@RequestBody EspecialidadEntity especialidad) {

            Boolean status = EspecialidadApi.modificarEspecialidad(especialidad);
            return new ResponseEntity<>(status, HttpStatus.ACCEPTED);
        }

        @DeleteMapping (path = "eliminarEspecialidad/{id}")
        public ResponseEntity<?> eliminarEspecialidad(@PathVariable("id")Long id) {

            Boolean status = EspecialidadApi.eliminarEspecialidad(id);
            return new ResponseEntity<>(status, HttpStatus.ACCEPTED);
        }
}
