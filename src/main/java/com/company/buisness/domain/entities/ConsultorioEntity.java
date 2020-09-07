package com.company.buisness.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "consultorios")

public class ConsultorioEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

   @OneToOne
   @JoinColumn(name = "id_doctor", referencedColumnName = "id")
   private DoctorEntity doctor;

   @OneToOne
   @JoinColumn(name = "id_especialidad", referencedColumnName = "id")
   private EspecialidadEntity especialidad;



}


