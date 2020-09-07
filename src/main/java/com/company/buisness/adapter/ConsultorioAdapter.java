package com.company.buisness.adapter;

import com.company.buisness.domain.entities.ConsultorioEntity;
import com.company.buisness.domain.services.ConsultorioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/pasteur/")

public class ConsultorioAdapter {
 @Autowired
 private ConsultorioServices colsutorioApi;

 @GetMapping("getConsultorios")
 public ResponseEntity<?> getConsultorios() {

     List<ConsultorioEntity> consultorio = colsutorioApi.findAll();
     return new ResponseEntity<>(consultorio, HttpStatus.OK);
 }
}
